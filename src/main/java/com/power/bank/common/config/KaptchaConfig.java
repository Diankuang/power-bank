package com.power.bank.common.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author xiedishi
 * @date 2018/7/2
 */
@Configuration
public class KaptchaConfig {

    @Bean
    public DefaultKaptcha getDefaultKaptcha(){
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        Properties properties = new Properties();
        properties.setProperty("kaptcha.border", "yes"); // 是否有边框
        properties.setProperty("kaptcha.border.color", "41,55,128");  // 边框颜色
        properties.setProperty("kaptcha.textproducer.font.color", "152,159,194");  // 字体颜色
        properties.setProperty("kaptcha.image.width", "110");  // 长
        properties.setProperty("kaptcha.image.height", "40");  // 高
        properties.setProperty("kaptcha.textproducer.font.size", "30"); // 字体大小
        properties.setProperty("kaptcha.session.key", "code");
        properties.setProperty("kaptcha.textproducer.char.length", "4"); // 验证码字符长度
        properties.setProperty("kaptcha.textproducer.font.names", "Times New Roman"); // 字体
//        properties.setProperty("kaptcha.obscurificator.impl", "com.google.code.kaptcha.impl.ShadowGimpy");
        properties.setProperty("kaptcha.noise.impl", "com.google.code.kaptcha.impl.NoNoise"); // 干扰
        properties.setProperty("kaptcha.textproducer.char.string", "0123456789"); // 验证码字符
//        properties.setProperty("kaptcha.noise.color","41,55,128");
        properties.setProperty("kaptcha.background.clear.from","41,55,128"); // 背景开始颜色
        properties.setProperty("kaptcha.background.clear.to","41,55,128");  // 背景结束颜色
        properties.setProperty("kaptcha.textproducer.char.space","3");  // 字符间隔

        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);

        return defaultKaptcha;
    }

}
