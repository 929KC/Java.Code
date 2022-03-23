package task5;

public class Squar implements Shape3D{
    private double  length;
    private double width;
    private double heigth;
    public Squar(double length, double width, double heigth) {
        super();
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }
    @Override
    public double area() {
        return 2*length*width+2*length*heigth+2*width*heigth;
    }
    @Override
    public void shoInfo() {
        System.out.println("多面体的高为:"+this.heigth+"宽："+
                this.width+"长："+this.length);
    }
    @Override
    public void scale(double r) {
        System.out.println("比例：1"+r);
    }
    @Override
    public double volumn() {
        return length*width*heigth;
    }
}
