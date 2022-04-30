package task3;

/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-04-30 20:12
 */

public class Demo8 {
    public static void main(String[] args) {
        int num=3;
        hanio(3,'A','B','C');

    }
    //A B C
    //A -> C
    //A ->B  A->C B->C
    // A ->C  A->B  C->B A->C  B->A B->C  A->C


    public static void hanio(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos2);
            return ;
        }
        hanio(n-1,pos1,pos2,pos3);
        move(pos1,pos3);
        hanio(n-1,pos2,pos1,pos3);
    }

    public static void move(char m,char n){
        System.out.println(m+"->"+n);
    }

}
