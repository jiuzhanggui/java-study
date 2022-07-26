package cn.winebibber.pattern.factory.simple_factory;

import java.util.Scanner;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 16:16
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Integer type = 1;
        while (true) {
            System.out.println("----咖啡种类-----");
            System.out.println("----       -----");
            System.out.println("---- 1.美式  -----");
            System.out.println("---- 2.拿铁  -----");
            System.out.println("----------------");
            System.out.println("请选择");
            CoffeeStore coffeeStore = new CoffeeStore();
            type = scanner.nextInt();
            coffeeStore.orderCoffee(type);
            System.out.println("====================");
        }
    }
}
