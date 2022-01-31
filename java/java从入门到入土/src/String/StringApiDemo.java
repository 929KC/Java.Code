package String;

public class StringApiDemo {
    public static void main(String[] args) {
        String name="叶秋涵";
        //1.public int length
        System.out.println(name.length());
        //2.public char charAt(int index)
        String word="君不见黄河之水天上来";
        char ch=word.charAt(0);
        System.out.printf("%c\n", ch);
        //遍历字符串
        for (int i = 0; i <word.length() ; i++) {
            System.out.println(word.charAt(i));
        }
        //3.public char[] toStringArray()
        String word2="奔流到海不复还";
        char ch2 []=word2.toCharArray();
        System.out.println(ch2);
        //4.public String substring(int beginIndex,int endIndex) 截取字符串（包前不包后）
        String s=word2.substring(0,4);
        System.out.println(s);
        //5.public String substring(int beginIndex)
        String s2=word2.substring(0);
        System.out.println(s2);
        //6.public String replace(charSequence target,charSequence replacement)
        String word3="长风破浪会有时，直挂云帆济沧海";
        String word4=word3.replace("长风","大风");
        System.out.println(word4);
        //7.public String [] split(String regex)
        String name3="叶秋寒，叶秋涵，叶子秋，黄茂荣";
         String name5[]=name3.split(",");
        for (int i = 0;  i< name5.length; i++) {
            System.out.println(name5[i]);
        }
    }
}
