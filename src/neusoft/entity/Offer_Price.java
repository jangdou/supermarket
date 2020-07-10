package neusoft.entity;

import java.util.Date;

public class Offer_Price {
    private int ofp_id;
    private Date effetive_startdate;
    private Date effetive_enddate;
    private int pro_id;
    private double price;
    private String type_cd;

    public Offer_Price(int ofp_id, Date effetive_startdate, Date effetive_enddate, int pro_id, double price, String type_cd) {
        this.ofp_id = ofp_id;
        this.effetive_startdate = effetive_startdate;
        this.effetive_enddate = effetive_enddate;
        this.pro_id = pro_id;
        this.price = price;
        this.type_cd = type_cd;
    }

    public int getOfp_id() {
        return ofp_id;
    }

    public void setOfp_id(int ofp_id) {
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

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
        return "Offer_Price:" +
                "ofp_id=" + ofp_id +
                ", effetive_startdate=" + effetive_startdate +
                ", effetive_enddate=" + effetive_enddate +
                ", pro_id=" + pro_id +
                ", price=" + price +
                ", type_cd='" + type_cd + '\'';
    }
}
