package com.shed.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.shed")
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {
    // Spring主配置
}
