package com.tracking.generator.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/next-tracking-number")
public class TrackingApiController {

    @GetMapping
    public String getTrackingApi (){
        return "hello";
    }
}
