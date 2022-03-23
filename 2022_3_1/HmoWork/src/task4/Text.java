package task4;

public class Text {
    public static void main(String[] args) {
        Fruit f=SimpleFruitFactory.createFruit(1);
        f.productFruit();
        Fruit f2=SimpleFruitFactory.createFruit(2);
        f2.productFruit();
        Fruit f23=SimpleFruitFactory.createFruit(3);
        f2.productFruit();
    }
}
