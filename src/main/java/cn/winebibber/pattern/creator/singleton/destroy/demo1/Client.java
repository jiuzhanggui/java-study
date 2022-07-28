package cn.winebibber.pattern.creator.singleton.destroy.demo1;

import java.io.*;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 22:02
 * @Description: 破坏单例模式--序列化方式
 */
public class Client {
    public static void main(String[] args) throws Exception {
//        writeObjectToFile();
        readObjectFromFile();
        readObjectFromFile();
    }

    // 向文件中写数据（对象）
    public static void writeObjectToFile() throws Exception {
        // 1.获取SingletonLazy对象
        SingletonLazy instance = SingletonLazy.getInstance();
        // 2.创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\JavaTool\\LearningProjects\\java-study\\design-mode\\src\\main\\java\\cn\\winebibber\\pattern\\singleton\\destroy\\demo1\\a.txt"));
        // 3.写对象
        oos.writeObject(instance);
        // 4.释放资源
        oos.close();
    }
    // 冲文件中读数据（对象）
    public static void readObjectFromFile() throws Exception {
        // 1.创建输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\JavaTool\\LearningProjects\\java-study\\design-mode\\src\\main\\java\\cn\\winebibber\\pattern\\singleton\\destroy\\demo1\\a.txt"));
        // 2.读取对象
        SingletonLazy singletonLazy = (SingletonLazy) ois.readObject();
        System.out.println(singletonLazy);
        // 3.释放资源
        ois.close();
    }
}
