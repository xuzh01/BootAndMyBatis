package com.example.demo.entity;

import java.util.Date;

public class User {
    private Integer uid;

    private String uname;

    private String password;

    private Integer roleid;

    private Date createtime;

    private Integer score;

    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User(Integer uid, String uname, String password, Integer roleid, Date createtime, Integer score) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.roleid = roleid;
        this.createtime = createtime;
        this.score = score;
    }

    public User() {
    }

    public User(String uname, String password, Integer roleid, Date createtime, Integer score) {
        this.uname = uname;
        this.password = password;
        this.roleid = roleid;
        this.createtime = createtime;
        this.score = score;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", roleid=" + roleid +
                ", createtime=" + createtime +
                ", score=" + score +
                '}';
    }
}