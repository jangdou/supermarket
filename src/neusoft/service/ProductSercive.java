package neusoft.service;

import neusoft.entity.Product_Price;

import java.sql.SQLException;
import java.util.List;

public interface ProductSercive {
    List<Product_Price> findAllProduct() throws SQLException;

}
