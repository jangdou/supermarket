package neusoft.entity;

import java.util.Date;

public class Product_Price {
    private Integer pro_id;
    private Integer sku;
    private String title;
    private Integer ofp_id;
    private Date effetive_startdate;
    private Date effetive_enddate;
    private Double price;
    private String type_cd;

    public Product_Price(Integer pro_id, Integer sku, String title, Integer ofp_id, Date effetive_startdate, Date effetive_enddate, Double price, String type_cd) {
        this.pro_id = pro_id;
        this.sku = sku;
        this.title = title;
        this.ofp_id = ofp_id;
        this.effetive_startdate = effetive_startdate;
        this.effetive_enddate = effetive_enddate;
        this.price = price;
        this.type_cd = type_cd;
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

    public Integer getOfp_id() {
        return ofp_id;
    }

    public void setOfp_id(Integer ofp_id) {
        this.ofp_id = ofp_id;
    }

    public Date getEffetive_startdate() {
        return effetive_startdate;
    }

    public void setEffetive_startdate(Date effetive_startdate) {
        this.effetive_startdate = effetive_startdate;
    }

    public Date getEffetive_enddate() {
        return effetive_enddate;
    }

    public void setEffetive_enddate(Date effetive_enddate) {
        this.effetive_enddate = effetive_enddate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType_cd() {
        return type_cd;
    }

    public void setType_cd(String type_cd) {
        this.type_cd = type_cd;
    }

    @Override
    public String toString() {
        return "Product_Price:" +
                "pro_id=" + pro_id +
                ", sku=" + sku +
                ", title='" + title + '\'' +
                ", ofp_id=" + ofp_id +
                ", effetive_startdate=" + effetive_startdate +
                ", effetive_enddate=" + effetive_enddate +
                ", price=" + price +
                ", type_cd='" + type_cd + '\'';
    }
}
