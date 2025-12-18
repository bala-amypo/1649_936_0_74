package com.example.demo.entity;
import jakarta.persistence.Entity;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=Generation.IDENTITY)
    private Long id;
    private Integer age;
    private String username,email,password;

}