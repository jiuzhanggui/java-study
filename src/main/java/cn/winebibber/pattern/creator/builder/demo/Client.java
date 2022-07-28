package cn.winebibber.pattern.creator.builder.demo;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 20:52
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .name("阿飞")
                .age(23)
                .grade("大三")
                .gender(true)
                .build();
        System.out.println(student);
    }
}
