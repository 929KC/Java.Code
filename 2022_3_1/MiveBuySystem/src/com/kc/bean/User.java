package com.kc.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-02
 * Time: 21:43
 */
public class User {
    private String loginName;
    private String userName;
    private String passWord;
    private char sex;
    private double money;
    private String phone;

    public User() {

    }

    public User(String loginName, String userName, String passWord, char sex, double money, String phone) {
        this.loginName = loginName;
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.money = money;
        this.phone = phone;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
