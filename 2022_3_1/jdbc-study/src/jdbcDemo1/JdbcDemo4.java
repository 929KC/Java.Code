package jdbcDemo1;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-12
 * Time: 9:41
 */

/**
 *
 */
public class JdbcDemo4 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //用户登录界面
        Map<String, String> map = initUI();
        //检查户名和密码
        boolean ok = checkNameAndPwd(map.get("loginName"), map.get("loginPwd"));
        /*if (ok) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }*/
        System.out.println(ok?"登录成功":"登录失败");
    }

    private static boolean checkNameAndPwd(String loginName, String loginPwd) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        boolean ok = false;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //连接
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bjpowernode", "root", "123456");
            //获得数据库对象
            stmt = conn.createStatement();
            //执行sql
            String sql = "select *from t_user where  loginName = '" + loginName + "' and loginPwd='" + loginPwd + "' ";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                ok = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return ok;
    }

    private static Map<String, String> initUI() {
        System.out.println("欢迎使用该系统,请输入用户名和密码：");
        System.out.println("用户名：");
        String loginName = sc.nextLine();
        System.out.println("密码：");
        String loginPwd = sc.nextLine();
        Map<String, String> userLoginInfo = new HashMap<String, String>();
        userLoginInfo.put("loginName", loginName);
        userLoginInfo.put("loginPwd", loginPwd);
        return userLoginInfo;
    }
}
