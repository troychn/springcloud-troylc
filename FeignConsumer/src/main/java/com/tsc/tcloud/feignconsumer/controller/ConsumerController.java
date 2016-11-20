package com.tsc.tcloud.feignconsumer.controller;

import com.tsc.tcloud.feignconsumer.feignclient.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/11/8.
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @GetMapping("/add")
    public Integer add(){
        return computeClient.add(10,40);
    }
}
