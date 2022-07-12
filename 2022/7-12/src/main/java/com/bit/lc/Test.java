package com.bit.lc;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-07-12 13:14
 */

public class Test {

    public static void main(String[] args) {
        int x = 3;
        int y = 1;
        if (x == y) {
            System.out.println("Not equal");
        } else {
            System.out.println("Equal");
        }
        Test t=new Test();
        System.out.println(t.fun3());
       Integer var1=new Integer(1);
       Integer var2=var1;
       doSomething(var2);
        System.out.println(var1.intValue());
        System.out.println(var2 == var1);

    }

    private static void doSomething(Integer integer) {
        integer=new Integer(2);
    }

    float fun3() {
        long i = 3;
        int j=3;
        float g=j;
        char ch='a';
        float z=ch;
        byte b=1;
        float c=b;
        short t=9;
        float n=t;

        return i;

    }


}
