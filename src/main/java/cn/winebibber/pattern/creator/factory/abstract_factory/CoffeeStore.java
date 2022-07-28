//package cn.winebibber.pattern.creator.factory.abstract_factory.product;
//
//
//import cn.winebibber.pattern.creator.factory.factory_method.SimpleCoffeeFactory;
//
///**
// * @author xujianhu
// * @email moke917@163.com
// * @date 2022-07-25 16:16
// * @Description:
// */
//public class CoffeeStore {
//    private SimpleCoffeeFactory coffeeFactory;
//
//    public void setCoffeeFactory(SimpleCoffeeFactory coffeeFactory) {
//        this.coffeeFactory = coffeeFactory;
//    }
//
//
//    public Coffee orderCoffee(){
//        Coffee coffee = coffeeFactory.createCoffee();
//        coffee.addMilk();
//        coffee.addSugar();
//        return coffee;
//    }
//}
