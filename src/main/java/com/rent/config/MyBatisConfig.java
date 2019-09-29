package com.rent.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author BABA
 * @date 2019/9/24 16:19
 */
@Configuration
@MapperScan("com.rent.mapper")
public class MyBatisConfig {
}
