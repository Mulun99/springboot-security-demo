package com.mulun.pojo;

import java.util.Date;

public class User {
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 性别- 1为男，2为女
     */
    private Character gender;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 地址
     */
    private String address;
    /**
     * 加入时间 2020-02-03
     */
    private Date entryTime;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 权限
     */
    private Integer jurisdiction;

    public User() {
    }

    public User(Integer id, String username, String password, String nickname, Character gender, String phone, String email, String address, Date entryTime, Integer state, Integer jurisdiction) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.entryTime = entryTime;
        this.state = state;
        this.jurisdiction = jurisdiction;
    }


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
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", entryTime=" + entryTime +
                ", state=" + state +
                ", jurisdiction=" + jurisdiction +
                '}';
    }
}
