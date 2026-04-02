package com.vti.entity;

public class Employee extends User{
    private Project project;
    private String proSkill;


    public Employee(int id, String fullName, String email, String password, Role role, Project projectID, String proSkill) {
        super(id, fullName, email, password, role);
        this.project = project;
        this.proSkill = proSkill;
    }

    public Employee() {

    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project projectID) {
        this.project = projectID;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
