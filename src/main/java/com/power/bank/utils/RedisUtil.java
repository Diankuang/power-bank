package com.power.bank.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.SerializationUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

@Component
public class RedisUtil {

    @Resource
    private JedisPool jedisPool;
    private Logger logger = LoggerFactory.getLogger(RedisUtil.class);



    /**
     * 默认存一小时
     * @param key
     * @param object
     */

    public void set(String key, Object object) {
        this.set(key, object, 3600);
    }

    public void set(String key, Object object, int second) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key.getBytes(), SerializationUtils.serialize(object));

            jedis.expire(key.getBytes(), second);
        } catch (Exception e) {
            logger.error("Redis_set_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
    }


    public Object get(String key) {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return SerializationUtils.deserialize(jedis.get(key.getBytes()));
        } catch (Exception e) {
            logger.error("Redis_set_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
        return null;
    }

    public boolean delete(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.del(key) > 0;
        } catch (Exception e) {
            logger.error("Redis_delete_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
        return false;
    }

    public boolean exists(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.exists(key.getBytes());
        } catch (Exception e) {
            logger.error("Redis_exists_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
        return false;
    }
}
