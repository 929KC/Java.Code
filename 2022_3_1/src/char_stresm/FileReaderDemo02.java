package char_stresm;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-05
 * Time: 16:00
 */
public class FileReaderDemo02 {
    public static void main(String[] args) throws IOException {
        Writer w = new FileWriter("D:\\Git\\GitHub\\github代码\\java.Coder\\Java.Code\\2022_3_1\\src\\data07.txt",true);
        //Writer w = new FileWriter("D:\\Git\\GitHub\\github代码\\java.Coder\\Java.Code\\2022_3_1\\src\\data07.txt");
        w.write("我");
        w.write("喜");
        w.write("你");
        w.write("\r\n");
        char arr[] = "你是猪！我不是猪，你是傻子".toCharArray();
        w.write("\r\n");
        w.write(arr);
        w.write("\r\n");
        w.write(arr, 3, 6);
        w.write("\r\n");
        String name = "叶子秋";
        w.write(name);
        w.write("\r\n");
        w.close();
    }
}
