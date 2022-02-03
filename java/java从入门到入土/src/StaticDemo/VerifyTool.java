package StaticDemo;

import java.util.Random;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-03
 * Time: 9:53
 */
public class VerifyTool {
    private  VerifyTool(){

    }

    public  static String createCode(int n){
        String code="";
        String chars="abcdefghijklmnopqrstuvwhrzABCDEFGHIJKLMNOPQRSTUVWHRZ0123456789";
        Random r=new Random();
        for (int i=0;i<n;i++){
            int index=r.nextInt(chars.length());
            code+=chars.charAt(index);
        }
        return  code;
    }
}
