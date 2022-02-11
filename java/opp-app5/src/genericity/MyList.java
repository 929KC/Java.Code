package genericity;

import java.util.ArrayList;

/**
* Description:
* @Author KC萧寒
* Date: 2022-02-11
* Time: 14:17
*/public class MyList<E> {
    private ArrayList lists = new ArrayList();

    public void add(E e){
        lists.add(e);
    }

    public void remove(E e){
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
