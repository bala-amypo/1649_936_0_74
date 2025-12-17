package com.example.demo.entity;

@Entity
public class StudentEntity
{
    private String username,email,password;
    private Integer id;
    private Date create;
    public String setName(String name){
        this.name=name;
    }
    public String setName(String email){
        this.email=email;
    }
    public String setName(String password){
        this.password=password;
    }
    public Integer setName(Integer id){
        this.id=id;
    }
    public Date setName(Date create){
        this.create=create;
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