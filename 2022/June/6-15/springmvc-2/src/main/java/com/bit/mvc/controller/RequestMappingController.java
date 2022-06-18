package com.bit.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-06-17 16:43
 */
@Controller
public class RequestMappingController {
    @RequestMapping(value = {"/testRequestMapping/{id}/{username}","/target"},
                     method={RequestMethod.GET,RequestMethod.GET}           )//
    public String  success(@PathVariable("id") Integer id, @PathVariable("username")String name){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        return "success";
    }
}
