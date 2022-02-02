package Array;

import java.util.ArrayList;

public class ArrayExe {
    public static void main(String[] args) {
    //遍历并删除元素
    ArrayList<Integer> list=new ArrayList<>();
    list.add(45);
    list.add(100);
    list.add(80);
    list.add(90);
    list.add(30);
    list.add(50);
    list.add(10);
    list.add(81);
    list.add(11);
    list.add(41);
    list.add(59);
    list.add(60);

     for (int i = list.size()-1; i >=0; i--) {
            int score=list.get(i);
            if (score<80){
                list.remove(i);
            }
    }
        System.out.println(list);


    }
}
