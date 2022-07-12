package com.bit.lc;

import java.util.Scanner;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-07-12 17:19
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder   sb = new StringBuilder();
        while (sc.hasNext()) {
            String str=sc.nextLine();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                String tmp=sb.toString();
                if(!tmp.contains(ch+"")){
                    sb.append(ch);
                }
            }
            System.out.print(sb);
        }

    }
}
