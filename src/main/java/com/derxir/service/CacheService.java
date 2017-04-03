package com.derxir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.net.URL;

/**
 * Created by justin on 4/3/17.
 */
public class CacheService {
    // inject the actual template
    @Autowired
    private RedisTemplate<String, String> template;

    // inject the template as ListOperations
    // can also inject as Value, Set, ZSet, and HashOperations
    @Resource(name="redisTemplate")
    private ListOperations<String, String> listOps;

    public void addLink(String id, URL url) {
        //listOps.leftPush(userId, url.toExternalForm());
        template.boundListOps(id).leftPush(url.toExternalForm());
    }

    public Boolean isLinkCollected(String id){
        return template.hasKey(id);
    }
}
