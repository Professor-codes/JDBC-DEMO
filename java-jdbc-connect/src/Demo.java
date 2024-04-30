import java.sql.*;

public class Demo {

    public static void main(String[] args) throws SQLException {

        String sql = "select productName, productDesc from products where productId = 10";

        String url = "jdbc:mysql://localhost:3306/db_products";
        String username = "";
        String password = "";

        Connection conn = DriverManager.getConnection(url, username, password);

        Statement st = conn.createStatement();

        ResultSet res = st.executeQuery(sql);
        res.next();

        String name = res.getString("productName");
        String desc = res.getString("productDesc");
        System.out.println(name);
        System.out.println(desc);

        conn.close();
    }

}
