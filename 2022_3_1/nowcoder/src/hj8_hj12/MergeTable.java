package hj8_hj12;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-06
 * Time: 13:38
 */
public class MergeTable {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                map.put(a, map.getOrDefault(a, 0) + b);
            }
        }

        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            System.out.println(i + " " + map.get(i));
        }
    }
}
