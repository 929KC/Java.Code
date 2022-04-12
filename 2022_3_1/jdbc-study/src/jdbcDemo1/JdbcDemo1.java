package jdbcDemo1;


import com.mysql.jdbc.Driver;

import java.sql.*;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-12
 * Time: 7:43
 */
public class JdbcDemo1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //注册驱动
            DriverManager.registerDriver(new Driver());
            //获取链接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "123456");
            //获取数据库操作对象
            stmt = conn.createStatement();
            //指行sql
            String sql = "select e.ename,d.dname from emp e join dept d on e.deptno = d.deptno";
            rs = stmt.executeQuery(sql);
            //处理查询结果集
            while (rs.next()) {
                String ename = rs.getString("ename");
                String dname = rs.getString("dname");
                System.out.println(ename + "," + dname);

            }
        } catch (SQLException e) {
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
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
