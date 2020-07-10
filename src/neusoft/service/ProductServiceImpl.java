package neusoft.service;

import neusoft.dao.ProductDao;
import neusoft.dao.ProductDaoImpl;
import neusoft.entity.Product_Price;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductSercive{
    ProductDao productDao=new ProductDaoImpl();

    @Override
    public List<Product_Price> findAllProduct() throws SQLException {
        return productDao.findAllProduct();
    }
}
