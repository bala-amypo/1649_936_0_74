package com.example.demo.service.impl;
import java.util.*;
import com.example.demo.service.TimeStampService;
import com.example.demo.repository.TimeStampRepo;
import com.example.demo.entity.TimeStamp;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TimeStampServiceImpl implements TimeStampService{
     @Autowired TimeStampRepo den;
     
          @Override
          public TimeStamp post1(TimeStamp stu){
               return den.save(stu);
          }
          @Override
          public TimeStamp finddata1(Long id){
               return den.findById(id).orElse(null);
          }
}