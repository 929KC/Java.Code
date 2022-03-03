package Company;
public class Pay {
    private double hours;
    private double salary;
    private double prate;//折扣率
    private double srate;//工资率

    public Pay() {
    }

    public Pay(double salary) {
        this.salary = salary;
    }

    public double getHour() {
        return hours;
    }

    public void setHour(double hour) {
        this.hours = hour;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPrate() {
        return prate;
    }

    public void setPrate(double prate) {
        this.prate = prate;
    }

    public double getSrate() {
        return srate;
    }

    public void setSrate(double srate) {
        this.srate = srate;
    }

    private  double getGrossPay(){
        this.hours=hours;
        this.srate=srate;
        this.prate=prate;
        double GrossPay=this.hours*this.salary*(1-this.prate)*(1-this.srate);
        return GrossPay;
    }


    public double computeNatPay(double hours,double state,double prate){
        this.hours=hours;
        this.srate=srate;
        this.prate=prate;
        return getGrossPay();

    }

    public double computeNatPay(double hours,double state){
        this.hours=hours;
        this.srate=srate;
        this.prate=0.15;
        return getGrossPay();

    }

    public double computeNatPay(double hours){
        this.hours=hours;
        this.srate=0.0465;
        this.prate=0.15;
        return getGrossPay();

    }
}
