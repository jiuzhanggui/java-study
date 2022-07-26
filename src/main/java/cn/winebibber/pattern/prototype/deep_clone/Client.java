package cn.winebibber.pattern.prototype.deep_clone;

import cn.winebibber.pattern.prototype.Citation;
import cn.winebibber.pattern.prototype.Student;

import java.io.*;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 11:54
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws  Exception {
        Citation citation = new Citation();

        Student student = new Student();
        student.setName("阿飞");
        citation.setStudent(student);

        // 写入文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("classpath:text.txt"));
        oos.writeObject(citation);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("classpath:text.txt"));
        Citation citation1 = (Citation) ois.readObject();
        ois.close();

        Student student1 = citation1.getStudent();
        student1.setName("张三");

        citation.show();
        citation1.show();

    }
}
