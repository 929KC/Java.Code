package collection_text;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-15
 * Time: 19:16
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 目标：斗地主游戏的案例开发。

 业务需求分析:
 斗地主的做牌, 洗牌, 发牌, 排序（拓展知识）, 看牌。
 业务: 总共有54张牌。
 点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
 花色: "♠", "♥", "♣", "♦"
 大小王: "👲" , "🃏"
 点数分别要组合4种花色，大小王各一张。
 斗地主：发出51张牌，剩下3张作为底牌。

 功能：
 1.做牌。
 2.洗牌。
 3.定义3个玩家
 4.发牌。
 5.排序（拓展，了解，作业）
 6.看牌
 */
public class GameDemo {
        private static List<Card> allCards=new ArrayList<>();

   static {
    String [] size={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
    String [] color={"♠", "♥", "♣", "♦"};
    int index=0;
       for (String s : size) {
           index++;
           for (String s1 : color) {
               Card c=new Card(s,s1,index);
                allCards.add(c);
           }
       }

       Card c2=new Card("","👲",++index);
       Card c3=new Card("","🃏",++index);
       Collections.addAll(allCards, c2,c3);
       System.out.println("新牌："+allCards);

   }

    public static void main(String[] args) {
        // 9、洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后："+allCards);
        // 10、发牌（定义三个玩家，每个玩家的牌也是一个集合容器）
        List<Card> hmy=new ArrayList<>();
        List<Card> yqh=new ArrayList<>();
        List<Card> yzq=new ArrayList<>();
        // 11、开始发牌（从牌集合中发出51张牌给三个玩家，剩余3张作为底牌）
        // allCards = [🃏, A♠, 5♥, 2♠, 2♣, Q♣, 👲, Q♠ ...
        //    i        0  1   2   3   4   5    6  7      %  3
        for (int i = 0; i <allCards.size() ; i++) {
            Card c=allCards.get(i);
            if(i%3==0){
                hmy.add(c);
            }else if(i%3==1){
                yqh.add(c);
            }else if(i%3==2){
            yzq.add(c);
            }
        }
        // 12、拿到最后三张底牌(把最后三张牌截取成一个子集合)
        List<Card> lastThreeCards  = allCards.subList(allCards.size() - 3,allCards.size());
        sortCards(hmy);
        sortCards(yqh);
        sortCards(yzq);
        // 13、给玩家的牌排序（从大到小

        // 14、输出玩家的牌：
        System.out.println("hmy的牌"+hmy);
        System.out.println("yzq的牌"+yzq);
        System.out.println("yqh的牌"+yqh);
        System.out.println("地主的牌"+lastThreeCards);


    }
    private static void sortCards(List<Card> cards){
          Collections.sort(cards, new Comparator<Card>() {
              @Override
              public int compare(Card o1, Card o2) {
                  return o2.getIndex()-o1.getIndex();
              }
          });
    }
}
