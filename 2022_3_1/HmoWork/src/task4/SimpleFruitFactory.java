package task4;
public class SimpleFruitFactory {
   static int TYPE_LZ = 1;static int TYPE_GK = 3;
   static int TYPE_PM = 2;
    public static Fruit createFruit(int type){
        Fruit f=null;
        if(type==1){
            f=new Apple();
        }else if(type==2){
            f=new Branana();
        }else if(type==3){
            f=new Orange();
        }
      return f;
    }
}
