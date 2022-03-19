package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 18:01
 */
public class DoubleLinkedList {
    private HeroNode2 head = new HeroNode2(0, " ", " ");

    public HeroNode2 getHead() {
        return head;
    }

    public void showList() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }
        HeroNode2 temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void add(HeroNode2 heroNode) {
        //因为head节点不能动，因此我们需要一个辅助节点遍历链表
        HeroNode2 temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            //如果没有找到最后，将tmp后移
            temp = temp.next;
        }
        //退出while循环时，tmp就指向了链表的最后
        //将最后这个节点的next指向新的节点
        //形成一个双向链表
        temp.next = heroNode;
        heroNode.pre=temp;
    }

    public void update(HeroNode2 newHeroNode) {
        HeroNode2 temp = head.next;
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
        HeroNode2 temp=head.next;
        boolean flag=false;
        while(true){
            if(temp==null){
                break;
            }
            if(temp.SerialNumber==SerialNumber){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(flag){
            temp.pre.next=temp.next;
            if(temp.next!=null){
                temp.next.pre=temp.pre;
            }
        }else{
            System.out.printf("要删除的%d 节点不存在\n",SerialNumber);
        }
    }


}
