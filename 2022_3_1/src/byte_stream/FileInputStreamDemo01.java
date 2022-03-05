package byte_stream;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 * @Author ：KC萧寒
 * Date: 2022-03-05
 * Time: 11:41
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
       // InputStream is=new FileInputStream(new File("D:\\Git\\GitHub\\github代码\\java.Coder\\Java.Code\\2022_3_1\\src\\data.txt"));
        InputStream is=new FileInputStream("D:\\Git\\GitHub\\github代码\\java.Coder\\Java.Code\\2022_3_1\\src\\data.txt");
        int b;
        /*is.read();
        System.out.println((char)b1);

        int b2=is.read();
        System.out.println((char)b2);

        int b3=is.read();
        System.out.println((char)b3);

        int b4=is.read();
        System.out.println((char)b4);*/
           /* while((b=is.read())!=-1){
                System.out.println((char) b);
            }*/
    }
}
