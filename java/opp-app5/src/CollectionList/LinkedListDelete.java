package CollectionList;

import javax.naming.LinkLoopException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-10
 * Time: 20:23
 */
public class LinkedListDelete {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList();
        list.add("叶秋涵");
        list.add("叶子秋");
        list.add("黄茂荣");
        list.add("java");
        list.add("java");
        list.add("HTML");
//        Iterator<String> it=list.iterator();
//        while(it.hasNext()){
//            String ele=it.next();
//            if ("java".equals(ele)){
//                //list.remove();
//                it.remove();
//            }
//            System.out.println(list);
//        }
//        System.out.println("*********");
//          for(String s:list){
//              if ("java".equals(s)){
//                 // list.remove();
//
//              }
//          }
//        System.out.println(list);

//      list.forEach(new Consumer<String>() {
//          @Override
//          public void accept(String s) {
//              if ("java".equals(s)){
//                  list.remove();
//              }
//          }
//      });
//        System.out.println(list);

//        for (int i=0;i<list.size();i++){
//            String ele=list.get(i);
//            if("java".equals(ele)){
//                list.remove();
//            }
//        }
//        System.out.println(list);

//        for (int i=0;i<list.size();i++){
//            String ele=list.get(i);
//            if("java".equals(ele)){
//                list.remove("java");
//                i--;
//            }
//        }

        for (int i = list.size()-1;i>=0;i--){
            String ele=list.get(i);
            if("java".equals(ele)){
                list.remove("java");
            }
        }
        System.out.println(list);
    }
 }
