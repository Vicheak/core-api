package com.api.core.baseapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiService {

    @GetMapping("/ping")
    public String pingService(){
        return "ping to core api successfully!";
    }

    @GetMapping("/test")
    public String test(){
        return "test application!";
    }

}
