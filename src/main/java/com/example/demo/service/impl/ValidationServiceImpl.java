package com.example.demo.service.impl;
import java.util.*;
import com.example.demo.service.ValidationService;
import com.example.demo.repository.ValidationRepo;
import com.example.demo.entity.ValidationEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ValidationServiceImpl implements ValidationService{
     @Autowired ValidationRepo dent;
     
          @Override
          public StudentEntity post(StudentEntity stu){
               return dent.save(stu);
          }
}