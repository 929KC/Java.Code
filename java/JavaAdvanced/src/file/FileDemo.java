package file;

import java.io.File;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-24
 * Time: 11:22
 */
public class FileDemo {
    public static void main(String[] args) {
        //File f=new File("E:\\笔记\\C语言资料\\C语言学习资料\\90970753_p0_custom1200.jpg");
        //File f=new File("E://笔记//C语言资料//C语言学习资料//90970753_p0_custom1200.jpg");
        //File.separator===//
        File f = new File("E:\\笔记\\C语言资料\\C语言学习资料\\90970753_p0_custom1200.jpg");//绝对路径
        System.out.println(f.length());
        System.out.println(f.exists());
        File f2 = new File("E:\\笔记");
        System.out.println(f2.length());

        //相对路径 相对于工程 File f3 = new File("JavaAdvanced/src/date.txt");
       // System.out.println(f3.exists());
    }
}
