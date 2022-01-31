package shop;

import java.util.Scanner;

public class ShopCarText {
    public static void main(String[] args) {
        //创建数组对象
        Goods[] shopCar = new Goods[100];
        //搭建购物车界面
        while (true) {
            System.out.println("请您选择要进行操作的功能：");
            System.out.println("添加商品");
            System.out.println("查询商品");
            System.out.println("购买商品的数量");
            System.out.println("结账");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要操作的命令：");
            String commend = sc.next();

            switch (commend) {
                case "add":
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    update(shopCar, sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("您输入的有误！！！");
            }

        }

    }

   public static void payGoods(Goods[] shopCar) {
      queryGoods( shopCar);
       double money=0;
       for (int i = 0; i < shopCar.length; i++) {
           Goods g=shopCar[i];
           if (g!=null){
               money+=(g.getPrice()*g.getBuyNumber());
           }else{
               break;
           }
       }
       System.out.println("订单的总价格"+money);

    }

    public static void update(Goods[] shopCar, Scanner sc) {

        while(true) {

            System.out.println("请输入你要修改的商品的id");
           int id=sc.nextInt();
           Goods g=getUpDateGoods(shopCar,id);

           if (g==null){
               System.out.println("对不起，没有该商品！");
           }else{
               System.out.println("请输入"+g.getName()+"的最新数量");
               int BuyNumber=sc.nextInt();
               g.setBuyNumber(BuyNumber);
           }
       }
    }

    public static  Goods getUpDateGoods(Goods [] shopCar,int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g=shopCar[i];
            if(g!=null){
                if (g.getId()==id){
                    return  g;
                }
            }else{
                return null;
            }
        }
        return  null;//找完了所有的商品依旧没有找到
    }



    public static void queryGoods(Goods[] shopCar) {
     System.out.println("**********查询购物车商品的信息**********");
     System.out.println("编号\t\t名称\t\t购买数量\t\t价格");
     for (int i = 0; i < shopCar.length; i++) {
         Goods g = shopCar[i];
         if (g!=null) {
             System.out.println(  g.getId() + "\t\t" + g.getName() + "\t\t" + g.getBuyNumber() + "\t\t" + g.getPrice());
         } else {
             break;
         }
     }

    }

   public static void addGoods(Goods[] shopCar, Scanner sc) {
       System.out.println("请输入你添加商品的编号");
       int id=sc.nextInt();
       System.out.println("请输入您添加商品的名称：");
       String name=sc.next();
       System.out.println("请输入该商品的数量：");
       int BuyNumber=sc.nextInt();
       System.out.println("请输入该商品的价格：");
       double price=sc.nextDouble();
       Goods g=new Goods();
//       g.id=id;
//       g.name=name;
//       g.BuyNumber=BuyNumber;
//       g.price=price;
       g.setId(id);
       g.setName(name);
       g.setBuyNumber(BuyNumber);
       g.setPrice(price);
       for (int i = 0; i < shopCar.length; i++) {
           if(shopCar[i]==null){
               shopCar[i]=g;
               break;
           }
       }
       System.out.println("您的商品"+g.getName()+"已添加成功！");
    }
}
