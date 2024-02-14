package com.example.demo.Configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource("file:${catalina.home}/config/SpringbootBuild/system.properties")
public class PropertiesConf {
}
