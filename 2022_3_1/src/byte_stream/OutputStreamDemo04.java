package byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-05
 * Time: 14:00
 */
public class OutputStreamDemo04 {
    public static void main(String[] args) throws Exception {
        OutputStream ou = new FileOutputStream("D:\\Git\\GitHub\\github代码\\java.Coder\\Java.Code\\2022_3_1\\src\\out.txt");
        ou.write('a');
        ou.write('b');
        ou.write(99);
        ou.write(10);
        ou.write("\r\n".getBytes());
        byte[] butffer = "我是中国人".getBytes();
        ou.write(butffer);
        ou.close();
    }
}
