package byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-05
 * Time: 12:24
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("D:\\Git\\GitHub\\github代码\\java.Coder\\Java.Code\\2022_3_1\\src\\data.txt");
        byte[] bytes = new byte[3];
        int len=in.read(bytes);
        System.out.println("读取了几个字节:"+len);
        String re=new String(bytes,0,len);
        System.out.println(re);
        //int len;
       // System.out.println("读取了几个字节:"+len);
      //  String re=new String(bytes);


       /* while ((len=in.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));//取多少倒多少

        }*/
    }
}
