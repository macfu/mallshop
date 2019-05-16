package com.macfu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author macfu
 * @description: mybatis配置类
 * @date 2019/5/16
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.macfu.mapper"})
public class MyBatisConfig {
}
