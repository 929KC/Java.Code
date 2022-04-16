package JDBCDemo2;

import java.sql.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-13
 * Time: 6:37
 */
public class StatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入desc or asc");
        String orderKey = scanner.next();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "123456");
            stmt = conn.createStatement();
            String sql = "select ename,sal from emp order by sal " + orderKey;
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("ename") + "," + rs.getString("sal"));
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
