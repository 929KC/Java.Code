package hj21;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-09
 * Time: 20:27
 */
public class EasyPassWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char [] arr=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>='a'&&arr[i]<='r'){
                arr[i]=(char)((arr[i]-'a')/3+2+'0');
            }else if(arr[i]=='s'){
            arr[i]='7';
            }else if(arr[i]=='v'){
                arr[i]='8';
            }else if(arr[i]>='t'&&arr[i]<='u'){
                arr[i]=(char)((arr[i]-'a')/3+2+'0');
            }else if(arr[i]>='w'&&arr[i]<='z'){
                arr[i]='9';
            }else if(arr[i]>='A'&&arr[i]<='Z'){
                arr[i]=(char)(arr[i]+32+1);
            }else if(arr[i]=='Z'){
                arr[i]='a';
            }
        }

        for (char c : arr) {
            System.out.print(c);
        }

    }

}

