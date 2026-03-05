package com.vti.entity;

public class Department {
    private int id;
    private String name;

    //không có parameters

    public Department() {

    }

    //Có 1 parameter là nameDepartment và default id của Department = 0
    //Khởi tạo 1 Object với mỗi constructor ở trên
    public Department(String name) {
        this.id = 0;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + '}';
    }

}

