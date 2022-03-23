package task5;

public class Rectangle implements Shape2D{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return this.length*this.width;
    }
    @Override
    public void shoInfo() {
        System.out.println("矩形的长为："+this.length+"" +
                "矩形的宽为："+this.width+"面积："+this.area());
    }
    @Override
    public void scale(double r) {
        System.out.println("比例：1"+r);
    }
    @Override
    public double perimeter() {
        return 2*(this.length+this.width);
    }
}
