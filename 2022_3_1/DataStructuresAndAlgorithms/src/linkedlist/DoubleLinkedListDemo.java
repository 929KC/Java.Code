package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 18:56
 */
public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode2 hero1 = new HeroNode2(1, "叶秋涵", "花狐狸");
        HeroNode2 hero2 = new HeroNode2(2, "叶子秋", "花和尚");
        HeroNode2 hero3 = new HeroNode2(3, "叶知秋", "花尼姑");

        DoubleLinkedList d=new DoubleLinkedList();
        d.add(hero1);
        d.add(hero2);
        d.add(hero3);
        d.showList();

        HeroNode2 newHeroNode=new HeroNode2(1,"涵涵","小姑凉");
        d.update(newHeroNode);
        System.out.println("修改后：");
        d.showList();
        System.out.println("删除后：");
        d.del(1);
        d.showList();
    }
}
