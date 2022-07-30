package cn.winebibber.pattern.behaviour.iterator;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description:
 */
public class Student {
    private String name;
    private String number;

    public Student() {
    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
