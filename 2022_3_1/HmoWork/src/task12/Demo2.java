package task12;

import java.sql.*;

public class Demo2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //链接
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root", "123456");
            //数据库操作对像
            stmt = conn.createStatement();
            //执行sql
            String sql = "select *from student";
            rs = stmt.executeQuery(sql);
            //处理查询结果集
            System.out.println("学号\t姓名\t性别\t年龄\t出生日期\t家庭地址\t");
            System.out.println("---------------------------------");
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4) + "\t");
                System.out.print(rs.getDate(5) + "\t");
                System.out.println(rs.getString(6) + "\t");
            }
            System.out.println("---------------------------------");
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
