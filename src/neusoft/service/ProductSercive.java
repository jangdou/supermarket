package neusoft.service;

import neusoft.entity.Product_Price;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public interface ProductSercive {
    List<Product_Price> findProduct(String title) throws SQLException;
    int selectProduct(String title) throws SQLException;
    void updateTest(String title, String startDate, String endDate) throws SQLException;
    double selectPrice(String title) throws SQLException;
    String Input();
    String Input(String str);
}
