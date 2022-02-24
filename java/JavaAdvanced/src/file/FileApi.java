package file;


import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-24
 * Time: 11:59
 */
public class FileApi {
    public static void main(String[] args) {
       File f=new File("E:\\笔记\\C语言资料\\C语言学习资料\\90970753_p0_custom1200.jpg");
        System.out.println(f.isAbsolute());//绝对路径
        System.out.println(f.isFile());//是否为文件夹
        System.out.println(f.getPath());
        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.isDirectory());
        long time = f.lastModified();
        System.out.println(("最后修改的时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time)));

    }
}
