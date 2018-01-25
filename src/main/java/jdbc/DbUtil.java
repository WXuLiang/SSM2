package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Created  by wxl on 2018/1/24 0024.
 */
public class DbUtil {

    public static final String URL = "jdbc:mysql://192.168.50.181:3306/wxl";
    public static final String USER = "root";
    public static final String PASSWORD = "jfkjyfb";

    public static void main(String[] args) throws Exception {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT name, age FROM user");
        //如果有数据，rs.next()返回true
        while(rs.next()){
            System.out.println(rs.getString("name")+" 年龄："+rs.getInt("age"));
        }
    }
}
