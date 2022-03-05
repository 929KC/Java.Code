package byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 * @Author ：KC萧寒
 * Date: 2022-03-05
 * Time: 12:42
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
       //法一：
        File f=new File("D:\\Git\\GitHub\\github代码\\java.Coder\\Java.Code\\2022_3_1\\src\\data.txt");
        InputStream in=new FileInputStream(f);
//        byte [] bytes =new byte[(int) f.length()];
//        int len=in.read(bytes);
//        System.out.println(f.length());
//        System.out.println(len);
       // System.out.println(new String(bytes));
        //法2
    
    }
}
