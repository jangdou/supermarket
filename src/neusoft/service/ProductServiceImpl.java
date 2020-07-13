package neusoft.service;

import neusoft.dao.ProductDao;
import neusoft.dao.ProductDaoImpl;
import neusoft.entity.Product_Price;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductSercive{
    ProductDao productDao=new ProductDaoImpl();

    @Override
    public List<Product_Price> findProduct(String title) throws SQLException {
        return productDao.findProduct(title);
    }
    public int selectProduct(String title) throws SQLException {
        return productDao.selectProduct(title);
    }

    public void updateTest(String title, String startDate, String endDate) throws SQLException {
        productDao.updateTest(title,startDate,endDate);
    }
    public double selectPrice(String title) throws SQLException{
        return productDao.selectPrice(title);
    }
    public String Input() {
        return productDao.Input();
    }
    public String Input(String str) {
        return productDao.Input(str);
    }
}
