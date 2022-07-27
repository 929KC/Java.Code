package com.bit.string;

import org.junit.Test;

public class testSing {
    @Test
    public  void testString(){
            String    s  = "hello";
            String  s2 = new String("world");
            String  s3 = "hello";
            System.out.println(s3==s);
    }
}
