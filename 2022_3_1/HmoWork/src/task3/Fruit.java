package task3;
public class Fruit {
    private  String name ;
    public String color;
    private String taste;
    public Fruit() {
    }
    public Fruit(String name, String color, String taste) {
        this.name = name;
        this.color = color;
        this.taste = taste;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getTaste() {
        return taste;
    }
}
