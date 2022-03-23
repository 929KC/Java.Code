package task5;

public class Text {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(12.12,23.123);
        r.shoInfo();
        double area=r.area();
        double p=r.perimeter();
        System.out.println("面积:"+area);
        System.out.println("周长："+p);
        System.out.println();
        Spare s=new Spare(12.5);
        s.shoInfo();
        double area2=s.area();
        double vm=s.volumn();
        System.out.println("面积："+area2);
        System.out.println("体积："+vm);
    }
}
