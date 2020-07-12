package neusoft.controller;

import neusoft.service.ProductSercive;
import neusoft.service.ProductServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller extends ControllerSelect{
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        for(;;){
            showView();
            ProductSercive productSercive=new ProductServiceImpl();
            boolean flag=true;
            while (flag){
                String input=productSercive.Input("输入数字");
                if("1".equals(input)){
                    selecta();
                }else if("2".equals(input)){
                    selectb();
                }else if("3".equals(input)){
                    update();
                }else if("4".equals(input)){
                    selectprice();
                }else if("5".equals(input)){
                    System.out.println("系统结束");
                    flag=false;
                }
            }

        }
    }

    private static void showView() {
        System.out.println("*************************");
        System.out.println("*    1、查询商品相关信息   *");
        System.out.println("*    2、查询商品是否促销   *");
        System.out.println("*    3、添加商品促销时间   *");
        System.out.println("*    4、判断商品促销价格   *");
        System.out.println("*      5、退出系统       *");
        System.out.println("************************");
    }
}
