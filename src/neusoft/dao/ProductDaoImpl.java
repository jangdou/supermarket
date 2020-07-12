package neusoft.dao;

import com.neusoft.entity.Student;
import com.neusoft.util.DBUtil;
import neusoft.entity.Product_Price;
import org.junit.jupiter.api.Test;
import java.sql.Date;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDaoImpl implements ProductDao{
    private final String URL = "jdbc:mariadb://localhost:3306/supermarket";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";

    //查询商品
    public List<Product_Price> findProduct(String title) throws SQLException {
        Connection connection = null;
        ResultSet resultSet=null;
        PreparedStatement preparedStatement=null;

        List<Product_Price> products=new ArrayList<>();

        try {
            connection = DBUtil.getConnection(URL, USER, PASSWORD);
            final String SQL = "select * from product d,offer_price o where d.pro_id=o.pro_id and 1=1 and title in(?) ;";
            preparedStatement=connection.prepareStatement(SQL);
            preparedStatement.setString(1,title);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                products.add(new Product_Price(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getDate(5),resultSet.getDate(6),resultSet.getDouble(7),resultSet.getString(8)));
            }
        } catch (SQLException throwables) {
            throwables.getMessage();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
        return products;
    }

    //查询商品是否促销
    public int selectProduct(String title) throws SQLException{
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;
        PreparedStatement preparedStatement=null;
        int cx = 0;
        try {
            connection = DBUtil.getConnection(URL, USER, PASSWORD);
            final String SQL = "select effetive_startdate from product d,offer_price o where d.pro_id=o.pro_id and 1=1 and title in(?);";
            preparedStatement=connection.prepareStatement(SQL);
            preparedStatement.setString(1,title);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                if(resultSet.getString(1)==null){
                     cx=1;
                }else{
                    cx=2;
                }
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
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
        return cx;
    }

    //添加商品促销价格
    public void updateTest(String title, String startDate, String endDate) throws SQLException {
        Connection connection = null;
        ResultSet resultSet=null;
        PreparedStatement preparedStatement=null;
        try {
            connection = DBUtil.getConnection(URL, USER, PASSWORD);
            final String SQL = "update offer_price,product set  effetive_startdate=? , effetive_enddate=? where offer_price.pro_id=product.pro_id and title in(?);";
            preparedStatement=connection.prepareStatement(SQL);
            preparedStatement.setString(1,startDate);
            preparedStatement.setString(2,endDate);
            preparedStatement.setString(3,title);
            resultSet=preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
    //查询商品正价
    public double selectPrice(String title) throws SQLException{
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;
        double price_zj = 0;
        PreparedStatement preparedStatement=null;
        try {
            connection = DBUtil.getConnection(URL, USER, PASSWORD);
            final String SQL = "select price from offer_price,product where offer_price.pro_id=product.pro_id and title in(?);";
            preparedStatement=connection.prepareStatement(SQL);
            preparedStatement.setString(1,title);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                 price_zj=resultSet.getDouble(1);
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
            if (resultSet != null) {
                resultSet.close();
            }
        }
        return price_zj;
    }

     public String Input(){
        System.out.print("请输入数字，选择功能：");
        String input = new Scanner(System.in).next();
        return input;
    }

    @Override
    public String Input(String str) {
        System.out.print(str);
        String input = new Scanner(System.in).next();
        return input;
    }


}
