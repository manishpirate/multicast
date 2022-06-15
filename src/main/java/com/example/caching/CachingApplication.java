package com.example.caching;

import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class CachingApplication {



    public static void main(String[] args) {
        SpringApplication.run(CachingApplication.class, args);
    }

}
