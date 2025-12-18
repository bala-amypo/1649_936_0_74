package com.example.demo.service;
import com.example.demo.entity.StudentEntity;
import java.util.*;
public interface StudentService{
    StudentEntity postData(StudentEntity stu);
    List<StudentEntity> getData();
    String deleteData(int id);
}
