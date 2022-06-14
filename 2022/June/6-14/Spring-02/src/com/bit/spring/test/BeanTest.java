package com.bit.spring.test;

import com.bit.spring.bean.Book;
import com.bit.spring.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-06-14 21:02
 */

public class BeanTest {
    @Test
    public void StudentTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("Student", Student.class);
        System.out.println(student);
    }
    @Test
    public void BookTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

}
