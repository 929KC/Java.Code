package com.ssg_exe;

public class Exe3 {
    public static void main(String[] args) {
        Exe3 m=new Exe3();
       int area=m.print(10,8);
        System.out.println("面积为："+area);
    }

       /*public void print()
       {
           for (int i=0;i<10;i++){
               for (int j=0;j<8;j++){
                   System.out.print("*");
               }
               System.out.println();
           }
       }*/
 /*      public int  print()
       {
           for (int i=0;i<10;i++){
               for (int j=0;j<8;j++){
                   System.out.print("*");
               }
               System.out.println();
           }
           return  10*8;
       }*/
    public int  print(int x,int y)
    {
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return  10*8;
    }



}
