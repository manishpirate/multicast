package com.example.caching;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/test")
public class TestService {

    public final HazelcastInstance hazelcast = Hazelcast.newHazelcastInstance();

@GetMapping
    public String getData(){
    return "Hello world";
}

}


