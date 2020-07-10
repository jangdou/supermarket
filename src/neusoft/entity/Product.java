package neusoft.entity;

public class Product {
    private Integer pro_id;
    private Integer sku;
    private String title;

    public Product(Integer pro_id, Integer sku, String title) {
        this.pro_id = pro_id;
        this.sku = sku;
        this.title = title;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product:" +
                "pro_id=" + pro_id +
                ", sku=" + sku +
                ", title='" + title + '\'';
    }
}
