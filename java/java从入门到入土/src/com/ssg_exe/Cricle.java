package com.ssg_exe;

public class Cricle {
    double radius;
  /*  public double findArewa(){
        return  Math.PI*radius*radius;
    }*/

    public  void findArewa1(){
        double area=Math.PI*radius*radius;
        System.out.println("圆的面积是："+area);
    }
    //错误示范
   /* public  double findArewa(double r){
        double area=Math.PI*r*r;
        return  area;

    }*/
}
