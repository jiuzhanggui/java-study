package cn.winebibber.pattern.behaviour.iterator;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        aggregate.addStudent(new Student("阿飞","001"));
        aggregate.addStudent(new Student("阿","002"));
        aggregate.addStudent(new Student("飞","003"));

        StudentIterator iterator = aggregate.getStudentIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
