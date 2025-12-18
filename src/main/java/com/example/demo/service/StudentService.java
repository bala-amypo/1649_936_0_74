package com.example.demo.service;
import com.example.demo.entity.StudentEntity;
import java.uitl.*;
public interface StudentService{
    StudentEntity postData(StudentEntity stu);
    List<StudentEntity> getData();
}
