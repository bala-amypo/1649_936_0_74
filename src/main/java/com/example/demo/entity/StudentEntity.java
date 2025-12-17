package com.example.demo.entity;

@Entity
public class StudentEntity
{
    private Integer id;
    private String username,email,password;
    private Date created;
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