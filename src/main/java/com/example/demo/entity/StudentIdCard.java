package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
public class StudentIdCard{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @OneToOne
    @JoinColumn(name="student_id")
    private StudentDetails detail;
    private String idCardNum;
}