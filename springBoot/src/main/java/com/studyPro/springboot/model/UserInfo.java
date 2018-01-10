package com.studyPro.springboot.model;

/**
 * @author 范富强
 * @description
 * @date 2018/1/8 14:45
 */
public class UserInfo {

    private Long id;
    private String userName;
    private String mobile;

    public UserInfo() {
    }

    public UserInfo(Long id, String userName, String mobile) {
        this.id = id;
        this.userName = userName;
        this.mobile = mobile;
    }

    public UserInfo(String userName, String mobile) {
        this.userName = userName;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
