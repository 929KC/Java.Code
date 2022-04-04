package com.kc.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-02
 * Time: 21:54
 */
public class Business extends User {
    private String shopNmae;
    private String address;

    public String getShopName() {
        return shopNmae;
    }

    public void setShopName(String shopNmae) {
        this.shopNmae = shopNmae;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
