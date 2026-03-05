package com.vti.entity;

import java.util.Arrays;
import java.util.Date;

public class Group {
    private int id;
    private String groupName;
    private Account creator;
    private Account[] accounts;
    private Date createDate;

    //không có parameters
    public Group(){

    }
    //Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
    public Group(String groupName, Account creator,Account[] accounts, Date createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }
    //Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
    public Group(String groupName, Account creator,String[] usernames, Date createDate ) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            Account account = new Account(3, "huong@gmail.com", "user3", "Thị", "Hương", "Test", new Date());
            account.setUserName(usernames[i]);
            this.accounts[i] = account;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", accounts=" + Arrays.toString(accounts) +
                ", createDate=" + createDate +
                '}';
    }
}
