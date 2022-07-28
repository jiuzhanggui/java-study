package cn.winebibber.pattern.creator.prototype;

import java.io.Serializable;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 11:26
 * @Description: 具体原型类 (案例：发奖)
 */
public class Citation implements Cloneable, Serializable {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show(){
        System.out.println("给" + student.getName() + "同学发奖。");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
