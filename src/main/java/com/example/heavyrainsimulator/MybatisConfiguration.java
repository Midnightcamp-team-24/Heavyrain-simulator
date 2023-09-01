package com.example.heavyrainsimulator;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.example.heavyrainsimulator", annotationClass = Mapper.class)
public class MybatisConfiguration {
}
