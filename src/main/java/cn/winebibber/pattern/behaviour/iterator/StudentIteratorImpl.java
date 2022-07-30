package cn.winebibber.pattern.behaviour.iterator;

import java.util.List;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 具体迭代器角色
 */
public class StudentIteratorImpl implements StudentIterator{
    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return position < list.size();
    }

    public Student next() {
        Student student = list.get(position);
        position++;
        return student;
    }
}
