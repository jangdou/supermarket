package neusoft.controller;

import neusoft.service.ProductSercive;
import neusoft.service.ProductServiceImpl;

import java.util.Calendar;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ControllerSelect {
    static void selecta(){
        System.out.println("输入你想查询的商品：");
        Scanner scanner=new Scanner(System.in);
        ProductSercive productSercive=new ProductServiceImpl();
        try {
            System.out.println(productSercive.findProduct(scanner.next()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    static void selectb(){
        System.out.println("输入你想查询是否促销的商品：");
        Scanner scanner=new Scanner(System.in);
        ProductSercive productSercive=new ProductServiceImpl();
        try {
            if(productSercive.selectProduct(scanner.next())==1){
                System.out.println("该商品没有在促销");
            }else {
                System.out.println("该商品正在促销");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    static void update(){
        System.out.println("输入你想添加促销时间的商品");
        Scanner scanner=new Scanner(System.in);
        String goods=scanner.next();
        System.out.println("输入开始促销的日期");
        Scanner scanner1=new Scanner(System.in);
        String startdate=scanner1.next();
        System.out.println("输入结束促销的日期");
        Scanner scanner2=new Scanner(System.in);
        String enddate=scanner1.next();
            ProductSercive productSercive=new ProductServiceImpl();
            try {
                productSercive.updateTest(goods,startdate,enddate);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
    }

    static void selectprice() {
        System.out.println("输入你想判断的商品：");
        Scanner scanner = new Scanner(System.in);
        String sp=scanner.next();
        System.out.println("输入你想判断的促销价格：");
        Scanner scanner1 = new Scanner(System.in);
        double price_cx=scanner1.nextDouble();
        ProductSercive productSercive = new ProductServiceImpl();
        try {
            if(price_cx> productSercive.selectPrice(sp)){
                System.out.println("促销价格不能大于正价");
            }else{
                System.out.println("这个可以是促销价格");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
