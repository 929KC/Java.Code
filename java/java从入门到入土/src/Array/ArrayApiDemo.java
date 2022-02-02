package Array;


import java.util.ArrayList;

public class ArrayApiDemo {
    public static void main(String[] args) {
//        ArrayList list=new ArrayList();
//
//        list.add("java");
//        list.add("html");
//        list.add("javaScript");
//        list.add("MySQl");
//        list.add(12);
//        list.add(123.4856);
//
//        list.add(true);
//        System.out.println(list);
//        list.add(1,"叶秋寒");
//        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("java");
        list1.add("html");
        list1.add("javaScript");
        list1.add("MySQl");
        list1.add("java");
        //1.public E get(int index)  返回指定索引处的元素
//        String e = list1.get(1);
//        System.out.println(e);
        //2.public int size() 返回集合中的元素的个数
//        int size = list1.size();
//        System.out.println(size);
        //遍历集合
//        for (int i = 0; i < list1.size(); i++) {
//            String E = list1.get(i);
//            System.out.println(E);
//        }

        //3.public E remove(int index) ,删除指定索引的元素，返回被删除的元素
//        String word=list1.remove(3);
//        System.out.println(word);
//        System.out.println(list1);
        //4.public boolean remove(Object o)删除指定的元素 返回被修改的元素
//        System.out.println(list1.remove("jav21"));
//        System.out.println(list1.remove("java"));

        //5.public E set( int index,E element)修改指定索引处的元素 ，返回被修改的元素
        String word2=list1.set(1,"叶秋涵");
        System.out.println(word2);
        System.out.println(list1);


    }
}
