package Demo;

public class CarText {
    public static void main(String[] args) {
            Car c=new Car();//Car();为构造器
            c.name="奔驰";
            c.price=23456165.000;
        System.out.println(c.name);
        System.out.println(c.price);
        Car c2=new Car("奥迪",15243.465);
        System.out.println(c2.price);
        System.out.println(c2.name);

    }
}
