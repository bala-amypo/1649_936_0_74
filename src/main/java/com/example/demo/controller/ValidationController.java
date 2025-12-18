package com.example.demo.controller;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/da")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postData(stu);
    }