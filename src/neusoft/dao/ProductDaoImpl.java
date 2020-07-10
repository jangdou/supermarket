package neusoft.dao;

import com.neusoft.util.DBUtil;
import neusoft.entity.Product_Price;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao{
    private final String URL = "jdbc:mariadb://localhost:3306/supermarket";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";

    public List<Product_Price> findAllProduct() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;

        List<Product_Price> products=new ArrayList<>();

        try {
            connection = DBUtil.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            final String SQL = "select * from product d,offer_price o where d.pro_id=o.pro_id and title='?';";
            resultSet=statement.executeQuery(SQL);
            while (resultSet.next()){
                products.add(new Product_Price(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getDate(5),resultSet.getDate(6),resultSet.getDouble(7),resultSet.getString(8)));
            }
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
        return products;
    }

}
