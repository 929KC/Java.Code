package com.bit.lc;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-07-12 17:13
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 字符集合
 */
public class Main{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);

       while(sc.hasNext()){
           Set<Character> set=new HashSet<Character>();
           StringBuilder sb = new StringBuilder();
           char [] ch=sc.next().toCharArray();
            for(int i=0;i<ch.length;i++){
                if(set.add(ch[i])){
                    sb.append(ch[i]);
                }
            }
           System.out.println(sb.toString());
       }

    }
}