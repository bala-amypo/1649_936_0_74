package com.example.demo.entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
public class StudentIdCard{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String idCardNum;
}