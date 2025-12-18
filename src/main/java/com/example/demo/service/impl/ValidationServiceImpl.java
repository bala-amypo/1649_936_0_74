package com.example.demo.service.impl;
import java.util.*;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepo;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService{
     @Autowired Repo student;
     
          @Override
          public StudentEntity postData(StudentEntity stu){
               return student.save(stu);
          }
}