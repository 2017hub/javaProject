package com.documendation.designpatterns.entity;

import java.util.Date;

public class MyUser {
    private Integer id;

    private String username;

    private String pwd;

    private String phone;

    private String emaile;

    private Date joninTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmaile() {
        return emaile;
    }

    public void setEmaile(String emaile) {
        this.emaile = emaile == null ? null : emaile.trim();
    }

    public Date getJoninTime() {
        return joninTime;
    }

    public void setJoninTime(Date joninTime) {
        this.joninTime = joninTime;
    }
}