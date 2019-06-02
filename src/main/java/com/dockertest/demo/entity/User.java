package com.dockertest.demo.entity;

public class User {
    private Integer id;
    private String name;
    private String age;
    private String address;
    //省略get和set方法、构造函数

    public User(int id, String name, int age, String adress) {
        this.id = id;
        this.name = name;
        this.age = String.valueOf(age);
        this.address = adress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}