package JDBCDemo2;

import java.sql.*;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-13
 * Time: 7:04
 */
public class JDBCPreparedStatement {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "123456");
           // String sql = "update dept set dname = ?,loc = ? where deptno = ?";
           String sql="delete from dept where deptno = ?";
            ps = conn.prepareStatement(sql);
           /* ps.setString(1,"软件研发部");
            ps.setString(2,"北京");
            ps.setInt(3,67);*/
          /*  ps.setInt(1,50);
            ps.setString(2,"销售部");
            ps.setString(3,"北京");*/
        ps.setInt(1,45);
            int count=ps.executeUpdate();
            System.out.println(count);
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
            if (ps != null) {
                try {
                    ps.close();
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