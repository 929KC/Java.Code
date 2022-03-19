package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 13:56
 */

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "叶秋涵", "花狐狸");
        HeroNode hero2 = new HeroNode(2, "叶子秋", "花和尚");
        HeroNode hero3 = new HeroNode(3, "叶知秋", "花尼姑");

        //创建链表
        SingleLinkedList s= new SingleLinkedList();
        s.addByOrder(hero3);
        s.addByOrder(hero1);
        s.addByOrder(hero2);
        s.showList();

        HeroNode newHeroNode=new HeroNode(1,"涵涵","花姑凉");
        s.update(newHeroNode);
        System.out.println("修改后的链表：");
        s.showList();
        s.del(1);
        System.out.println("删除后");
        s.showList();
    }
}

