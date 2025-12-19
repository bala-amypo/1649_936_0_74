package com.example.demo.controller;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.TimeStamp;
import com.example.demo.service.TimeStampService;
import jakarta.validation.Valid;
@RestController
public class TimeStampController{
    @Autowired TimeStampService a;
    @PostMapping("/data1")
    public TimeStamp sendData(@Valid @RequestBody TimeStamp t){
        return a.post1(t);
    }
    
}