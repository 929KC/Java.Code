package PetShop;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-28
 * Time: 11:47
 */
public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetShop.Interface();
        String word = sc.next();
        if ("YES".equals(word)) {
            System.out.println("请选择你领养的宠物：1，狗狗2，企鹅");
            int petName = sc.nextInt();
            Pet myPet = null;
            if (petName == 1) {
                PetShop.Adopt(sc, myPet, "狗狗");
                PetShop.menu();
                int k = sc.nextInt();
                while (k >= 1 && k <= 4) {
                    switch (k) {
                        case 1:
                            System.out.println("请选择食物类型1-鱼肉-2-鲨鱼肉");
                            int food = sc.nextInt();
                            myPet.eat(food);
                            break;
                        case 2:
                            myPet.bath();
                            break;
                        case 3:
                            System.out.println("请选则学习的内容：1-技能-识字");
                            int thing = sc.nextInt();
                            myPet.study(thing);
                            break;
                        case 4:
                            myPet.play();
                            break;
                        case 0:
                            System.out.println("退出互动！");
                            return;
                        default:
                            System.out.println("没有这个游戏环节，退出程序");
                            return;
                    }
                    System.out.println("接下来进行与宠物的互动环节");
                    k = sc.nextInt();
                }
                myPet.print();
                System.out.println("程序退出！");
            } else if (petName == 2) {
                PetShop.Adopt(sc, myPet, "企鹅");
            } else {
                System.out.println("没有此宠物");
            }
        } else {
            System.out.println("欢迎下次光临！");
        }
    }

    }

