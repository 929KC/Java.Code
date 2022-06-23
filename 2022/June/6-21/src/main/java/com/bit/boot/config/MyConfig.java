package com.bit.boot.config;

import com.bit.boot.bean.CatPet;
import com.bit.boot.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-06-23 12:44
 */
//容器中默认一个类,只能创建一份实例,解单例,默认的情况,当调用实例时，默认情况会去容器找,会增加boot的启动时间
@Configuration//该注解相当于使用xml文件,注册组件
public class MyConfig {
    //向容器中添加组件,该默认该方法名为组件的id,即组件在容器中的标识,返回值则为容器中的实例
    @Bean("cat")
    public CatPet getCatPet(){
        CatPet c=new CatPet();
        c.setName("汤姆猫");
        c.setAge(1);
        return c;
    }

    @Bean("student")
    public Student getStudent(){
        Student s=new Student();
        s.setName("叶秋涵");
        s.setAge(19);
        s.setAddress("长沙");
        s.setSchool("B站");
        return s;
    }

}
