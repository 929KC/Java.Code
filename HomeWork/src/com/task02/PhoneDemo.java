package com.task02;

import com.task02.Phone;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-23
 * Time: 12:27
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "华为";
        p.model = "CHL_AL00";
        System.out.println("手机品牌：" + p.brand);
        System.out.println("手机型号：" + p.model);
    }
}
