package com.springboot.config.client.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class ConfigClient {

    @Value("${config.mysql}")
    private String mysql;

    @Value("${config.redis}")
    private String redis;

    @Value("${config.mongodb}")
    private String mongodb;

    public String getMysql() {
        return mysql;
    }

    public void setMysql(String mysql) {
        this.mysql = mysql;
    }

    public String getRedis() {
        return redis;
    }

    public void setRedis(String redis) {
        this.redis = redis;
    }

    public String getMongodb() {
        return mongodb;
    }

    public void setMongodb(String mongodb) {
        this.mongodb = mongodb;
    }
}
