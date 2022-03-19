package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 14:04
 */
public class SingleLinkedList {
    //头节点
    private HeroNode head = new HeroNode(0, " ", " ");

    public HeroNode getHead() {
        return head;
    }
    public void add(HeroNode heroNode) {
        //因为head节点不能动，因此我们需要一个辅助节点遍历链表
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            //如果没有找到最后，将tmp后移
            temp = temp.next;
        }
        //退出while循环时，tmp就指向了链表的最后
        //将最后这个节点的next指向新的节点
        temp.next = heroNode;
    }

    public void addByOrder(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.SerialNumber > heroNode.SerialNumber) {
                break;
            } else if (temp.next.SerialNumber == heroNode.SerialNumber) {
                flag = true;
            }
            temp = temp.next;
        }

        if (flag) {
            System.out.printf("准备插入的英雄编号%d 已存在了,不能重复加入\n", heroNode.SerialNumber);
        } else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }

    }

    public void update(HeroNode newHeroNode) {
        HeroNode temp = head.next;
        boolean flag = false;

        while (true) {
            if (temp.next == null) {
                break;
            } else if (temp.SerialNumber == newHeroNode.SerialNumber) {
                flag = true;
                break;
            }
            temp=temp.next;
        }

        if(flag){
            temp.name= newHeroNode.name;;
            temp.nickName= newHeroNode.nickName;
        }else{
            System.out.printf("没有找到编号%d 的节点,不能修改\n",newHeroNode.SerialNumber);
        }
    }

    public void del(int SerialNumber){
        HeroNode temp=head;
        boolean flag=false;
        while(true){
            if(temp.next==null){
                break;
            }
            if(temp.next.SerialNumber==SerialNumber){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(flag){
            temp.next=temp.next.next;
        }else{
            System.out.printf("要删除的%d 节点不存在\n",SerialNumber);
        }
    }


    public void showList() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
