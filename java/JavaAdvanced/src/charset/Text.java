package charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-25
 * Time: 19:37
 */
public class Text {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String name="我爱你1314叶秋涵";
        byte [] bytes=name.getBytes();
       // byte [] bytes=name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        //解码
        String rs=new String(bytes);
        System.out.println(rs);
    }
}
