package task5;
public class circle implements Shape2D{
    private double raduis;
    public circle(double raduis) {
        super();
        this.raduis = raduis;
    }
    public double area() {
        return Math.PI*this.raduis*this.raduis;
    }
    public void shoInfo() {
        System.out.println("圆的半径："+this.raduis);
    }
    public void scale(double r) {
        System.out.println("比例：1"+r);
    }
    public double perimeter() {
        return 2*Math.PI*this.raduis;
    }
}
