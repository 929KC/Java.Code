package char_stresm;

import java.io.FileReader;
import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-05
 * Time: 15:36
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws Exception {
        Reader fr=new FileReader("D:\\Git\\GitHub\\github代码\\java.Coder\\Java.Code\\2022_3_1\\src\\dara06.txt");
        int code;

        while ((code=fr.read())!=-1){
            System.out.print((char) code);
        }
    }
}
