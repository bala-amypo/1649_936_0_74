package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.*;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    private String username;
    @Email
    private String email;
    @Size(min=2,max=6)
    @NotNull(message="Password is mandatory")
    Private String password;
    @Max(30)@Positive(messaage="Age must be a Positive number")
    private Integer age;
    public ValidationEntity(Long id,String username,String email,String password,Date created){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        
    }
}