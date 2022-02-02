package Array;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Movie> movies=new ArrayList<>();
       // Movie m=new Movie("《肖申克救赎》",9.7,"罗宾斯");
        System.out.println(movies.add(new Movie("《肖申克救赎》",9.7,"罗宾斯")));
        System.out.println(movies.add(new Movie("《霸王别姬》",9.79,"张国荣")));
        System.out.println(movies.add(new Movie("《阿甘正传》",9.1,"汉克斯")));
        for (int i = 0; i < movies.size(); i++) {
        Movie  movie= movies.get(i);
            System.out.println("电影名称："+movie.getName());
            System.out.println("评分："+movie.getScore());
            System.out.println("主演"+movie.getActor());
        }
    }
}
