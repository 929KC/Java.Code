package com.bit.mvc.bean;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-06-18 16:22
 */

public class User {
    private String user_name;
    private Integer age;
    private String emil;
    private String password;
    private String sex;

    public User() {
    }

    public User(String user_name, Integer age, String emil, String password, String sex) {
        this.user_name = user_name;
        this.age = age;
        this.emil = emil;
        this.password = password;
        this.sex = sex;
    }

    public String getUsr_name() {
        return user_name;
    }

    public void setUsr_name(String usr_name) {
        this.user_name = usr_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "usr_name='" + user_name + '\'' +
                ", age=" + age +
                ", emil='" + emil + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
