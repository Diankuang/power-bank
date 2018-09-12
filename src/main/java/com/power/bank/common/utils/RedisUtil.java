package com.power.bank.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.SerializationUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.*;

@Component
public class RedisUtil {

    private Logger logger = LoggerFactory.getLogger(RedisUtil.class);

    @Autowired
    private JedisPool jedisPool;

    public void set(String key, Object object) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key.getBytes(), SerializationUtils.serialize(object));
        } catch (Exception e) {
            logger.error("Redis_set_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
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

    public Object getNotSer(String key) {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.get(key);
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
            return jedis.del(key.getBytes()) > 0;
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

    public Set<String> stringKeys(String key){
        Jedis jedis = null;
        Set<String>  keys = null;
        try {
            jedis = jedisPool.getResource();
            keys = jedis.keys(key);
        } catch (Exception e) {
            logger.error("Redis_keys_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
        return keys;
    }

    public Set<byte[]> byteKeys(String key){
        Jedis jedis = null;
        Set<byte[]> keys = null;
        try {
            jedis = jedisPool.getResource();
            keys = jedis.keys(key.getBytes());
        } catch (Exception e) {
            logger.error("Redis_keys_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
        return keys;
    }

    public Set<JSONObject> getRedisSet(String key){
        Jedis jedis = null;
        Set<JSONObject> set = new HashSet<>();
        try {
            jedis = jedisPool.getResource();
            Set<byte[]> keys1 = jedis.keys(key.getBytes());
            byte[][] keys2 = keys1.toArray(new byte[keys1.size()][]);
            byte[][] values = jedis.mget(keys2).toArray(new byte[keys1.size()][]);
            for (int i = 0; i < keys1.size(); ++i) {
                System.out.println(keys2[i] + " --- " + SerializationUtils.deserialize(values[i]));
                set.add((JSONObject) SerializationUtils.deserialize(values[i]));
                System.out.println(new String(keys2[i]));
            }
        } catch (Exception e) {
            logger.error("Redis_keys_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
        return set;
    }

    public Map<String,Object> getRedisValue(String key){
        Jedis jedis = null;
        List<Integer> list = new ArrayList<>();
        Set<JSONObject> set = new HashSet<>();
        Map<String,Object> map = new HashMap<>();
        try {
            jedis = jedisPool.getResource();
            Set<byte[]> keys1 = jedis.keys(key.getBytes());
            if(keys1.size()==0){return null;}
            byte[][] keys2 = keys1.toArray(new byte[keys1.size()][]);
            byte[][] values = jedis.mget(keys2).toArray(new byte[keys1.size()][]);
            for (int i = 0; i < keys1.size(); ++i) {
                map.put(new String(keys2[i]), SerializationUtils.deserialize(values[i]));
            }
        } catch (Exception e) {
            logger.error("Redis_keys_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
        return map;
    }

    public Map<String,Object> getRedisValueNotSer(String key){
        Jedis jedis = null;
        List<Integer> list = new ArrayList<>();
        Set<JSONObject> set = new HashSet<>();
        Map<String,Object> map = new HashMap<>();
        try {
            jedis = jedisPool.getResource();
            Set<byte[]> keys1 = jedis.keys(key.getBytes());
            if(keys1.size()==0){return null;}
            byte[][] keys2 = keys1.toArray(new byte[keys1.size()][]);
            byte[][] values = jedis.mget(keys2).toArray(new byte[keys1.size()][]);
            for (int i = 0; i < keys1.size(); ++i) {
                map.put(new String(keys2[i]),new String(values[i]));
            }
        } catch (Exception e) {
            logger.error("Redis_keys_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
        return map;
    }
    public void incrBy(String key,long integer){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.incrBy(key.getBytes(),integer);
        } catch (Exception e) {
            logger.error("Redis_incrBy_error:", e);
        } finally {
            //返还到连接池
            jedis.close();
        }
    }

}
