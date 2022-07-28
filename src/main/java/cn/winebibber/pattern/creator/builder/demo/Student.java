package cn.winebibber.pattern.creator.builder.demo;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 20:44
 * @Description:
 */
public class Student {
    private String name;
    private Integer age;
    private String grade;
    private Boolean gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", gender=" + gender +
                '}';
    }

    // 私有构造
    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.grade = builder.grade;
        this.gender = builder.gender;
    }

    // 利用建造者模式
    public static final class Builder {
        private String name;
        private Integer age;
        private String grade;
        private Boolean gender;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }
        public Builder grade(String grade) {
            this.grade = grade;
            return this;
        }
        public Builder gender(Boolean gender) {
            this.gender = gender;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", grade='" + grade + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }
}
