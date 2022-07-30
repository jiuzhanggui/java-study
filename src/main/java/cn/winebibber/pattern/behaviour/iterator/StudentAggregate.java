package cn.winebibber.pattern.behaviour.iterator;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 抽象聚合角色
 */
public interface StudentAggregate {
    void addStudent(Student student);
    void removeStudent(Student student);
    StudentIterator getStudentIterator();

}
