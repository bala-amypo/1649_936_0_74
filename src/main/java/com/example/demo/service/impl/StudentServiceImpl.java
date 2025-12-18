package com.example.demo.service.impl;
import java.util.*;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepo;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Override;
@Service
public class StudentServiceImpl implements StudentService{
     @Autowired StudentRepo student;
          @Override
                public StudentEntity postData(StudentEntity stu){
                          return student.save(stu);
                               }
          @Override
          public List<StudentEntity> getData(){
               return student.findAll();
          }
          @Override
          public String deleteData(@PathVariable int id){
               repo
          }
                               }