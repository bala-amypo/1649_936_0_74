package com.example.demo.service.impl;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
@service
public class StudentServiceImpl implements StudentService{
     @Autowired StudentRepo student;
      public StudentEntity postData(StudentEntity stu){
     }
}