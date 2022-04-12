package jdbcDemo1;

import javax.annotation.Resources;
import java.sql.*;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-12
 * Time: 8:41
 */
public class jdbcDemo3 {
    public static void main(String[] args) {

        //资源绑定器
        ResourceBundle bundle = ResourceBundle.getBundle("resource/db");
        //通过配置文件获取信息
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String passWord = bundle.getString("passWord");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //链接
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bjpowernode", "root", "123456");
            //数据库操作对像
            stmt = conn.createStatement();
            //执行sql
            String sql = "select e.ename,d.dname from emp e join dept d on e.deptno = d.deptno";
            rs = stmt.executeQuery(sql);
            //处理查询结果集
            while (rs.next()) {
                String ename = rs.getString("ename");
                String dname = rs.getString("dname");
                System.out.println(ename + "," + dname);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
