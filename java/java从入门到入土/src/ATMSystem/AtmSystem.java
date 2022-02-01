package ATMSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AtmSystem {
    public static void main(String[] args) {

        ArrayList<Account> accounts=new ArrayList<>();
            showMain(accounts);
    }

    //1.ATM系统登录菜单
    public static void showMain(ArrayList<Account> accounts){
        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("***欢迎来到ATM****");
            System.out.println("***1****登录*****");
            System.out.println("***2****开户*****");
            System.out.println("请输入你想要的操作：");
            int command=sc.nextInt();
            switch (command){
                case 1:
                    //登陆
                    login(accounts,sc);
                    break ;
                case 2:
                    //开户
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("你输入的有误请重新输入！！！");
            }
        }
    }


    private static void login(ArrayList<Account> accounts, Scanner sc) {
        if(accounts.size()==0){
            System.out.println("该系统中没有任何用户的信息，您先要注册！！！");
            return;
        }

        System.out.println("请输入你的卡号：");
        String YouCardId=sc.next();
        //根据卡号查询对象
        Account acc=getCardId(YouCardId,accounts);

        if(acc!=null){
            System.out.println("请输入您的登录密码：");
            String passWord=sc.next();
            if (acc.getPassword().equals(passWord)){
                System.out.println("恭喜"+acc.getUserName()+"成功进入系统，您的卡号是"+acc.getCardId());
                showCommand(sc, acc, accounts);
                        return;
            }else{
                System.out.println("您输入的密码有误，请确认。");
            }
        }else{
            System.out.println("对不起，不存在此用户！！！");
        }

    }


    private static void showCommand(Scanner sc, Account acc,ArrayList<Account> accounts) {
        while (true) {
        System.out.println("*********用户操作见面*********");
        System.out.println("1.查询账户");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.转账");
        System.out.println("5.修改密码");
        System.out.println("6.退出");
        System.out.println("7.注销账户");


            System.out.println("请您输入操作命令");
            int command =sc.nextInt();
            switch (command){
                case 1:
                    //查询账户
                    showAccount(acc);
                    break;
                case 2:
                    //存款
                    depositMoney(acc,sc);
                    break;
                case 3:
                    //取款
                    drawMoney(acc,sc);
                    break;
                case 4:
                    //转账
                    transferMoney(acc,accounts,sc);
                    break;
                case 5:
                    //修改密码
                    updatePassWord(acc, sc);
                    return; // 跳出当前操作的方法，最终回到首页
                case 6:
                    //退出
                    System.out.println("欢迎使用，下次再来！");
                    return;
                case 7:
                    // 注销账户
                    accounts.remove(acc); // 从集合对象中删除当前账户对象。
                    System.out.println("您的账户已经完成了销毁，您将不可以进行登录了！");
                    return;
                default:
                    System.out.println("您输入的有误请重新输入！！");
            }
        }

    }

    private static void updatePassWord(Account acc, Scanner sc) {
        // 1、判断旧密码是否正确
        while (true) {
            System.out.println("请您输入当前密码认证：");
            String passWord = sc.next();
            if(acc.getPassword().equals(passWord)){
                while (true) {
                    // 2、输入新密码
                    System.out.println("请您输入新密码：");
                    String newPassWord = sc.next();
                    System.out.println("请您确认新密码：");
                    String okPassWord = sc.next();
                    // 3、比对两次密码是否一致
                    if(newPassWord.equals(okPassWord)){
                        acc.setPassword(okPassWord);
                        System.out.println("密码已经修改成功，请重新登录！");
                        return;
                    }else {
                        System.out.println("两次密码不一致！");
                    }
                }
            }else {
                System.out.println("您输入的密码有误。请重新确认密码！");
            }
        }
    }

    public static void transferMoney(Account acc, ArrayList<Account> accounts, Scanner sc) {
        // 1、判断自己的账户中是否有钱
        if(acc.getMoney() <= 0){
            System.out.println("您自己都没钱，就别转了吧！");
            return;
        }

        // 2、判断总账 户数量是否大于等于2个。
        if(accounts.size() >= 2){
            while (true) {
                // 3、让当前用户输入对方的账号进行转账
                System.out.println("请您输入对方卡号：");
                String cardId = sc.next();

                // 4、根据卡号查询出集合中的账户对象
                Account otherAcc = getCardId(cardId , accounts);
                // 5、判断账户对象是否存在，而且这个账户对象不能是自己。
                if(otherAcc != null){
                    // 6、判断当前账户是否是自己。
                    if(acc.getCardId().equals(otherAcc.getCardId())){
                        System.out.println("不能给自己账户转账！");
                    }else {
                        // 7、正式进入到转账逻辑了
                        // 黑马刘德华
                        String rs = "*" + otherAcc.getUserName().substring(1);
                        System.out.println("请您确认["+rs +"]的姓氏来确认！");
                        System.out.println("请您输入对方的姓氏：");
                        String preName = sc.next();
                        if(otherAcc.getUserName().startsWith(preName)){
                            // 认证通过
                            while (true) {
                                System.out.println("请您输入转账的金额（您最多可以转账：" + acc.getMoney() +"元）：");
                                double money = sc.nextDouble();
                                if(money > acc.getMoney()){
                                    System.out.println("你不听话，没有这么多钱可以转！");
                                }else {
                                    // 开始转
                                    acc.setMoney(acc.getMoney() - money); // 更新自己账户
                                    otherAcc.setMoney(otherAcc.getMoney() + money);
                                    System.out.println("您已经完成转账！您当前还剩余：" + acc.getMoney());
                                    return;
                                }
                            }

                        }else {
                            System.out.println("您输入对方的信息有误！");
                        }
                    }
                }else {
                    System.out.println("您输入的转账卡号不存在！");
                }
            }
        }else {
            System.out.println("当前系统中没有其他账户可以转账，去注册一个账户吧！");
        }



    }


  public static void drawMoney(Account acc, Scanner sc) {
        System.out.println("******取款功能******");
        if (acc.getMoney()>=100){
            while (true) {
                System.out.println("请输入取款的金额：");
                double money=sc.nextDouble();
                if (money>acc.getQuotaMoney()){
                    System.out.println("您当次取款的超过限额，无法取出，每次最多能取"+acc.getQuotaMoney());
                }else{
                    if (money>acc.getMoney()){
                    acc.setMoney(acc.getMoney()-money);
                        System.out.println("恭喜您，取钱"+money+"成功!"+"当前账户的余额还有"+acc.getMoney());
                      return;
                    }else{
                        System.out.println("余额不足！！！");
                    }
                }
            }
        }else{
            System.out.println("您自己的金额不足100,就别取了~~~");
        }
    }

    /*
     * 存款功能
     * */
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("******存款功能******");
        System.out.println("请输入您要存款的金额：");
        double money= sc.nextDouble();
        acc.setMoney(acc.getMoney()+money);
        showAccount(acc);
    }

    private static void showAccount(Account acc) {
        System.out.println("******当前用户详情******");
        System.out.println("卡号："+acc.getCardId());
        System.out.println("姓名："+acc.getUserName());
        System.out.println("余额："+acc.getQuotaMoney());
        System.out.println("当次限额："+acc.getQuotaMoney());

    }

    public static void register(ArrayList<Account> accounts, Scanner sc) {
       System.out.println("***欢迎使用开户功能***");

        // 1、录入用户账户信息
       System.out.println("请输入你的开户名称：");
       String Username=sc.next();
       String passWord="";
       while (true) {
           System.out.println("请输入开户密码：");
           passWord=sc.next();
           System.out.println("请确认密码：");
           String okPassWord=sc.next();

           if (okPassWord.equals(passWord)){
               break;
           }else{
               System.out.println("两次输入的密码必须一致");
           }
       }
       System.out.println("请输入当次限额");
       double quotaMoney=sc.nextDouble();
       //生成账户的卡号，卡号是8位，而且不能与其他账户卡号重复
            String cardId=creatCardId(accounts);
       //创建一个账户对象封装用户的信息
    Account account=new Account(cardId,Username,passWord,quotaMoney);
    //5.创建的用户添加到集合里面
       accounts.add(account);
       System.out.println("恭喜您，开户成功，您的卡号是："+account.getCardId()+"请你妥善保管！");

   }


    public  static String creatCardId(ArrayList<Account> accounts){

        while (true) {
            String cardId="";
            Random r=new Random();
            for (int i=0;i<8;i++){
                cardId+=r.nextInt(10);
            }
            Account acc=getCardId(cardId, accounts);
            if(acc==null){
                return  cardId;
            }
        }
    }

    public  static Account getCardId(String cardId,ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc=accounts.get(i);
            if(acc.equals(cardId)){
                return  acc;
            }

        }
        return null;//查无此账户
    }

}
