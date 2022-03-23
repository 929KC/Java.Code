package task5;

public class Spare implements Shape3D{
    private double raduis;
    public Spare(double raduis) {
        super();
        this.raduis = raduis;
    }
    @Override
    public double area() {
        return 4*Math.PI*Math.pow(this.raduis, 2);
    }
    @Override
    public void shoInfo() {
        System.out.println("半径为："+this.raduis+"面积为：" +
                ""+this.area());
    }
    @Override
    public void scale(double r) {
        System.out.println("比例：1"+r);
    }
    @Override
    public double volumn() {
        return 4/3*Math.pow(this.raduis, 3);
    }
}
