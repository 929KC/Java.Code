package jdbcDemo1;


import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-12
 * Time: 8:09
 */
/*
注册驱动的第二种方式
 */
public class JdbcDemo2 {
    public static void main(String[] args) {
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
