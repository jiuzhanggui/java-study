package cn.winebibber.pattern.behaviour.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 对象结构角色类
 */
public class Home {
    private List<Animal> list = new ArrayList<Animal>();

    public void action(Person person) {
        for (Animal animal : list) {
            animal.accept(person);
        }
    }

    public void add(Animal animal){
        list.add(animal);
    }
}
