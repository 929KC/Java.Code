package com.bit.mvc.controller;

import com.bit.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-06-18 09:27
 */
@Controller
public class TestController {
//    @RequestMapping("/para")
//    public String  getparam(HttpServletRequest request){
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        System.out.println(username);
//        System.out.println(password);
//        return "test_param";
//    }

    @RequestMapping("/para")
    //@RequestParam将请求的实参与形参对应,value为实参的值,required意为需不需要传value值,默认为true即一定需要传,defaultValue 当参数所对应的值为null或者为空是则value为默认值
    public String  getparam(@RequestParam(value="user_name",required=false,defaultValue = "Hello")  String username,
                            String password,
                            String [] hobby, @RequestHeader(value="Host",required=true,defaultValue="hhh")String host){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        System.out.println(Arrays.toString(hobby));
        System.out.println(host);
        return "test_param";
    }

    @RequestMapping("/testBean")
    public String getBean(User user){
        System.out.println(user);
        return "test_param";
    }
}
