package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class StudentEntity
{
    @Id
    @GeneratedValue
    private Integer id;
    private String name,email,password;
    private Date created;
    public StudentEntity(){
    }
    public StudentEntity(Integer id,String name,String email,String password,Date created){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.created=created;
    }
    public String setName(String name){
        this.name=name;
    }
    public String setEmail(String email){
        this.email=email;
    }
    public String setPassword(String password){
        this.password=password;
    }
    public Integer setId(Integer id){
        this.id=id;
    }
    public void setCreated(Date created){
        this.created=created;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public Integer getId(){
        return id;
    }
    public Date getcreate(){
        return create;
    }
}