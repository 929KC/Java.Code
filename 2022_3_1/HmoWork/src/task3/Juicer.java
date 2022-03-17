package task3;
public class Juicer {
    public String GetFruitJuicer(Fruit f) {
        return "一杯" + f.getColor() + "的" + f.getName()
                + "汁" + "味道" + f.getTaste();
    }
    public String GetFruitJuicer(Apple a, Banana b) {
        return "一杯"+a.getColor()+"的,"+a.getName()
                +b.getName()+","+"味道"+a.getTaste()+b.getTaste();
    }
    public String GetFruitJuicer(Fruit f, int num) {
        return num + "杯" + f.getColor() + "的" + f.getName()
                + "汁" + "味道" + f.getTaste();
    }
}
