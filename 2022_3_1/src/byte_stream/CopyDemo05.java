package byte_stream;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-05
 * Time: 14:21
 */
public class CopyDemo05 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("E:\\笔记\\C语言资料\\C语言学习资料\\最爱二次元美女丨粗心大意的女秘书-30.jpg");
            os = new FileOutputStream("E:\\笔记\\C语言资料\\C语言学习资料\\new最爱二次元美女丨粗心大意的女秘书-31.jpg");
            byte[] butter = new byte[1024];
            int len;
            while ((len = is.read(butter)) != -1) {
                os.write(butter, 0, len);

            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
