package com.example.demo.service;
import com.example.demo.entity.TimeStamp;
import java.util.*;
public interface TimeStampService{
    TimeStamp post(TimeStamp stu);
    TimeStamp finddata1(Long id);
}