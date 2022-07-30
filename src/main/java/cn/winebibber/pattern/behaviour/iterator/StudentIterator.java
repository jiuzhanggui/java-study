package cn.winebibber.pattern.behaviour.iterator;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 抽象迭代器角色
 */
public interface StudentIterator {
    public boolean hasNext();
    public Student next();
}
