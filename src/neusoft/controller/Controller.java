package neusoft.controller;

import neusoft.service.ProductSercive;
import neusoft.service.ProductServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        System.out.println("输入你想查询的商品：");
        Scanner scanner=new Scanner(System.in);
        String goods=scanner.nextLine();
        ProductSercive productSercive=new ProductServiceImpl();
        try {
            System.out.println(productSercive.findAllProduct());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
