package cn.winebibber.pattern.behaviour.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 具体聚合角色
 */
public class StudentAggregateImpl implements StudentAggregate {
    private List<Student> list = new ArrayList<Student>();

    public void addStudent(Student student) {
        list.add(student);
    }

    public void removeStudent(Student student) {
        list.remove(student);
    }

    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
