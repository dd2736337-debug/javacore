package com.vti.entity;

public class User {
    private int id;
    private String fullName;
    private String email;
    private String Password;
    private Role role;

    public User(int id, String fullName, String email, String password, Role role) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        Password = password;
        this.role = role;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", Password='" + Password + '\'' +
                ", role=" + role +
                '}';
    }
}
