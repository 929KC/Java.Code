package dbcon;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-16
 * Time: 17:09
 */
public class DbConDemo {
    public static void main(String[] args) throws SQLException {
       //创建数据库连接对象
        DataSource ds=new ComboPooledDataSource();
        //获取连接对象
        Connection conn = ds.getConnection();
        System.out.println(conn);

    }


}
