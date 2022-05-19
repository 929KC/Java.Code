package operation;

import book.Book;
import bookList.BookList;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-05-19 13:12
 */

public class DeleteBook implements IOperations {
    @Override
    public void work(BookList list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("删除图书！");
        System.out.println("情输入你要删除的图书：");
        String name = sc.next();
        int index = 0;
        for (int i = 0; i < list.getUserSized(); i++) {
            Book book = list.getBook(i);
            if (name.equals(book.getName())) {
                index = i;
                break;
            }
        }

        if (index == 1) {
            System.out.println("没有找到此书");
        }

        for (int j = index; j < list.getUserSized(); j++) {
            Book book=list.getBook(j+1);
            list.setBooks(j,book);
        }
        list.setBooks(list.getUserSized()-1,null);
        list.setUserSized(list.getUserSized()-1);
        System.out.println("删除了");
    }
}
