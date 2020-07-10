package neusoft.dao;

import neusoft.entity.Product_Price;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
     List<Product_Price> findAllProduct() throws SQLException;

    }
