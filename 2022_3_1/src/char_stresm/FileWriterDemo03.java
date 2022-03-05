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
 * Time: 15:59
 */
public class FileWriterDemo03 {
    /**
     * Created with IntelliJ IDEA.
     * Description:
     * truth:talk  is cheap, show me the code.
     *
     * @Author ：KC萧寒
     * Date: 2022-03-05
     * Time: 15:48
     */
    public static class FileReaderDemo02 {
        public static void main(String[] args) throws Exception {
            Reader r=new FileReader("D:\\Git\\GitHub\\github代码\\java.Coder\\Java.Code\\2022_3_1\\src\\data06.txt");
            char [] butter = new char[1024];
            int len;
            while ((len = r.read( butter )) != -1){
                String rs=new String(butter,0,len);
                System.out.println(rs);
            }
        }
    }
}
