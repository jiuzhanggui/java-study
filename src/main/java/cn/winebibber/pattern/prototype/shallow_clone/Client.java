package cn.winebibber.pattern.prototype.shallow_clone;

import cn.winebibber.pattern.prototype.Citation;
import cn.winebibber.pattern.prototype.Student;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 11:54
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation citation1 = new Citation();

        Student student = new Student();
        student.setName("阿飞");
        citation.setStudent(student);

        student.setName("张三");
        citation1.setStudent(student);

        citation.show();
        citation1.show();

    }
}
