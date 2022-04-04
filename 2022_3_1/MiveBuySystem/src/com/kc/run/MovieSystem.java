package com.kc.run;

import com.kc.bean.Business;
import com.kc.bean.Customer;
import com.kc.bean.Movie;
import com.kc.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-02
 * Time: 21:54
 */
public class MovieSystem {
    /*
    定义系统的数据容器
    1.存储很多个用户(客户对象，商家对象)
     */
    public static final List<User> All_USERS = new ArrayList<>();
        /*
        2.存储系统全部的商家和其排片信息
        商家1=[p1,p2,pa,.....]
         */


    public static final Map<Business, List<Movie>> All_MOVIES = new HashMap<>();

    /**
     3、准备一些测试数据
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        All_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        All_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        All_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        All_MOVIES.put(b, movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        All_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        All_MOVIES.put(b2, movies3); // b2 = []
    }

    public static final Scanner SYS_SC = new Scanner(System.in);
    //定义一个静态的User类型的变量记录登录成功的用户
    public static User loginUser;
    public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:m:ss");
    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");

    public static void main(String[] args) {
        showMain();
    }

    private static void showMain() {
        while (true) {
            System.out.println("电影首页");
            System.out.println("1，登录：");
            System.out.println("2用户注册：");
            System.out.println("3,商家注册：");
            System.out.println("请输入命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    login();
                    break;
                case "2":
                    break;

                case "3":

                    break;
                default:
                    System.out.println("没有此选项");
                    break;
            }
        }


    }

    private static void login() {
        System.out.println("请输入登录名称：");
        String loginName = SYS_SC.nextLine();
        System.out.println("请输入登录密码：");
        String passWord = SYS_SC.nextLine();
        //1.根据登录名称查询用户对象。
        User u = getUserByLoginName(loginName);
        //2.判断用户对象是否存在，存在说明登录名称正确
        if (u != null) {
            if (u.getPassWord().equals(passWord)) {
                //登录成功:商家or用户
                loginUser = u;
                if (u instanceof Customer) {
                    showCustomerMain();
                } else {
                    showBusinessMain();
                }
            } else {
                System.out.println("密码错误");
            }
        } else {
            System.out.println("登录名称错误,请确认！");
        }
    }

    private static void showCustomerMain() {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统" +
                    "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    scoreMovie();
                    showAllMovies();
                    break;
                case "3":
                    // 评分功能
                    buyMovie();
                    break;
                case "4":
                    // 购票功能

                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    private static void buyMovie() {
        showAllMovies();
        System.out.println("=============用户购票功能=================");
        while (true) {
            System.out.println("请您输入需要买票的门店：");
            String shopName = SYS_SC.nextLine();
            // 1、查询是否存在该商家。
            Business business = getBusinessByShopName(shopName);
            if(business == null){
                System.out.println("对不起，没有该店铺！请确认");
            }else {
                // 2、此商家全部的排片
                List<Movie> movies = All_MOVIES.get(business);
                // 3、判断是否存在上映的电影
                if(movies.size() > 0) {
                    // 4、开始进行选片购买
                    while (true) {
                        System.out.println("请您输入需要购买电影名称：");
                        String movieName = SYS_SC.nextLine();
                        // 去当前商家下，查询该电影对象。
                        Movie movie = getMovieByShopAndName(business, movieName);
                        if(movie != null){
                            // 开始购买
                            while (true) {
                                System.out.println("请您输入要购买的电影票数：");
                                String number = SYS_SC.nextLine();
                                int buyNumber = Integer.valueOf(number);
                                // 判断电影是否购票
                                if(movie.getNumber() >= buyNumber){
                                    // 可以购买了
                                    // 当前需要花费的金额
                                    double money = BigDecimal.valueOf(movie.getPrice()).multiply(BigDecimal.valueOf(buyNumber))
                                            .doubleValue();
                                    if(loginUser.getMoney() >= money){
                                        // 终于可以买票了
                                        System.out.println("您成功购买了"+ movie.getName() + buyNumber +
                                                "张票！总金额是：" + money);
                                        // 更新自己的金额 更新商家的金额
                                        loginUser.setMoney(loginUser.getMoney() - money);
                                        business.setMoney(business.getMoney() + money);
                                        movie.setNumber(movie.getNumber() -  buyNumber);

                                        Customer c = (Customer) loginUser;
                                        // 记录购买电影的信息
                                        // 第一个参数是购买的电影，第二个参数是没有评价的标记！
                                        c.getBuyMovies().put(movie.getName(), false);

                                        return;// 结束方法
                                    }else {
                                        // 钱不够！
                                        System.out.println("是否继续~~");
                                        System.out.println("是否继续买票？y/n");
                                        String command = SYS_SC.nextLine();
                                        switch (command) {
                                            case "y":
                                                break;
                                            default:
                                                System.out.println("好的！");
                                                return;
                                        }
                                    }
                                }else {
                                    // 票数不够
                                    System.out.println("您当前最多可以购买：" + movie.getNumber());
                                    System.out.println("是否继续买票？y/n");
                                    String command = SYS_SC.nextLine();
                                    switch (command) {
                                        case "y":
                                            break;
                                        default:
                                            System.out.println("好的！");
                                            return;
                                    }
                                }
                            }

                        }else {
                            System.out.println("电影名称有毛病~~");
                        }
                    }

                }else {
                    System.out.println("该电影院关门了~~~");
                    System.out.println("是否继续买票？y/n");
                    String command = SYS_SC.nextLine();
                    switch (command) {
                        case "y":
                            break;
                        default:
                            System.out.println("好的！");
                            return;
                    }
                }
            }
        }
    }

    /**
     * 根据商家店铺名称查询商家对象
     *
     * @return
     */
    public static Business getBusinessByShopName(String shopName) {
        Set<Business> businesses = All_MOVIES.keySet();
        for (Business business : businesses) {
            if (business.getShopName().equals(shopName)) {
                return business;
            }
        }
        return null;
    }

    private static void scoreMovie() {
        // 1、查询当前登录成功的用户历史购买记录，看哪些电影是它可以评分的。
        Customer c = (Customer) loginUser;
        Map<String, Boolean> movies = c.getBuyMovies();
        if (movies.size() == 0) {
            System.out.println("当前您没有看过电影，不能评价！");
            return;
        }

        // 买过了 ，看哪些电影是它可以评分的。
        movies.forEach((name, flag) -> {
            if (flag) {
                System.out.println(name + "此电影已评价");
            } else {
                System.out.println("请您对：" + name + "进行打分（0-10）：");
                double score = Double.valueOf(SYS_SC.nextLine());

                // 先根据电影名称拿到评分数据
                List<Double> scores = MOVIES_SCORE.get(name); // MOVIES_SCORE = [ 名称=[10] , ... ]
                if (scores == null) {
                    // 说明此电影是第一次评价
                    scores = new ArrayList<>();
                    scores.add(score);
                    MOVIES_SCORE.put(name, scores);
                } else {
                    scores.add(score);
                }

                movies.put(name, true);
            }
        });
    }

    private static void showAllMovies() {
        System.out.println("=============展示全部商家排片信息=================");
        All_MOVIES.forEach((business, movies) -> {
            System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone() + "\t\t地址:" + business.getAddress());
            System.out.println("\t\t\t片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println("\t\t\t" + movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime()
                        + "\t\t" + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber() + "\t\t"
                        + sdf.format(movie.getStartTime()));
            }
        });
    }

    public static Movie getMovieByShopAndName(Business business, String name) {
        List<Movie> movies = All_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(name)) {
                return movie;
            }
        }
        return null;
    }

    private static void showBusinessMain() {
        while (true) {
            System.out.println("============黑马电影商家界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    private static void updateMovie() {
        Business business = (Business) loginUser;
        List<Movie> movies = All_MOVIES.get(business);
        if (movies.size() == 0) {
            System.out.println("无片可修改");
            return;
        }
        while (true) {
            System.out.println("请输入你要修改的影片：");
            String movieName = SYS_SC.nextLine();
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                System.out.println("请您输入修改后新片名：");
                String name = SYS_SC.nextLine();
                System.out.println("请您输入修改后主演：");
                String actor = SYS_SC.nextLine();
                System.out.println("请您输入修改后时长：");
                String time = SYS_SC.nextLine();
                System.out.println("请您输入修改后票价：");
                String price = SYS_SC.nextLine();
                System.out.println("请您输入修改后票数：");
                String totalNumber = SYS_SC.nextLine();
                while (true) {
                    try {
                        System.out.println("请您修改后影片放映时间：");
                        String stime = SYS_SC.nextLine();
                        // String name,  String actor, double time, double price, int number, Date startTime)       // 封装成电影对象 ，加入集合movices中去
                        movie.setName(name);
                        movie.setActor(actor);
                        movie.setTime(Double.valueOf(time));
                        movie.setPrice(Double.valueOf(price));
                        movie.setNumber(Integer.valueOf(totalNumber));
                        movie.setStartTime(sdf.parse(stime));
                        System.out.println("恭喜您，修改成功");
                        showBusinessInfos();
                        return; // 直接退出去
                    } catch (Exception e) {
                        e.printStackTrace();
                        LOGGER.error("Error parsing时间解析出了毛病");
                    }
                }
            } else {
                System.out.println("你的店铺没有上架该影片");
                System.out.println("请问您继续吗?");
                System.out.println("请输入你的选择：Y/N");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    default:
                        System.out.println("好的");
                        return;
                }
            }
        }
    }

    private static void deleteMovie() {
        Business business = (Business) loginUser;
        List<Movie> movies = All_MOVIES.get(business);
        if (movies.size() == 0) {
            System.out.println("无片可删");
            return;
        }
        while (true) {
            System.out.println("请输入你要下架的影片：");
            String movieName = SYS_SC.nextLine();
            Movie movie = getMovieByName(movieName);
            if (movie != null) {
                movies.remove(movie);
                System.out.println("你把" + movie.getName() + "下架了");
                showBusinessInfos();
            } else {
                System.out.println("你的店铺没有上架该影片");
                System.out.println("请问您继续修改吗?");
                System.out.println("请输入你的选择：Y/N");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    default:
                        System.out.println("好的");
                        return;
                }
            }
        }
    }

    public static Movie getMovieByName(String movieName) {
        Business business = (Business) loginUser;
        List<Movie> movies = All_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(movieName)) {
                return movie;
            }
        }
        return null;
    }

    private static void addMovie() {
        // 根据商家对象(就是登录的用户loginUser)，作为Map集合的键 提取对应的值就是其排片信息 ：Map<Business , List<Movie>> ALL_MOVIES
        Business business = (Business) loginUser;
        List<Movie> movies = All_MOVIES.get(business);

        System.out.println("请您输入新片名：");
        String name = SYS_SC.nextLine();
        System.out.println("请您输入主演：");
        String actor = SYS_SC.nextLine();
        System.out.println("请您输入时长：");
        String time = SYS_SC.nextLine();
        System.out.println("请您输入票价：");
        String price = SYS_SC.nextLine();
        System.out.println("请您输入票数：");
        String totalNumber = SYS_SC.nextLine();
        while (true) {
            try {
                System.out.println("请您输入影片放映时间：");
                String stime = SYS_SC.nextLine();
                // String name,  String actor, double time, double price, int number, Date startTime)       // 封装成电影对象 ，加入集合movices中去
                Movie movie = new Movie(name, actor, Double.valueOf(time), Double.valueOf(price), Integer.parseInt(price), sdf.parse(stime)
                );
                movies.add(movie);
                System.out.println("您已经成功上架了：《" + movie.getName() + "》");
                return; // 直接退出去
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("Error parsing时间解析出了毛病");
            }
        }
    }
    /**
     定义一个静态的Map集合存储电影的评分
     */
    public static final Map<String , List<Double>> MOVIES_SCORE = new HashMap<>();

    /**
     展示商家的详细：展示当前商家的信息。
     */
    /**
     * 展示商家的信息
     */
    private static void showBusinessInfos() {
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t电话：" + business.getPhone() + "\t\t地址：" + business.getAddress()
        );
        List<Movie> movies = All_MOVIES.get(business);
        if (movies.size() > 0) {
            System.out.println("片名\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
        } else {
            System.out.println("无片可播!");
        }
    }


    public static User getUserByLoginName(String LoginName) {
        for (User user : All_USERS) {
            if (user.getLoginName().equals(LoginName)) {
                return user;
            }
        }
        return null;
    }
}
