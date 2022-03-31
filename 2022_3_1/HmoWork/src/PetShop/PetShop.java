package PetShop;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 * @Author ：KC萧寒
 * Date: 2022-03-28
 * Time: 13:52
 */
public class PetShop {

    public static void menu() {
        System.out.println("接下来进行与宠物的互动环节");
        System.out.println("请选择互动的方式：");
        System.out.println("1-喂食");
        System.out.println("2-洗澡");
        System.out.println("3-学习");
        System.out.println("4-玩耍");
    }

    public static void Interface() {
        System.out.println("|********************|");
        System.out.println("|********************|");
        System.out.println("|**欢迎来到我的宠物商店**|");
        System.out.println("|--------------------|");
        System.out.print("请问您是否需要领养一只宠物:");
        System.out.print("YES or NO");
    }

    public static void Adopt(Scanner sc, Pet myPet, String name) {
        System.out.println("请为" + name + "起个名字：");
        name = sc.next();
        System.out.println("请输入您想要的领养的品种：：");
        String type = sc.next();
        myPet = new Penguin(name, type);
        System.out.println("恭喜您领养成功");
        myPet.print();
    }

}
