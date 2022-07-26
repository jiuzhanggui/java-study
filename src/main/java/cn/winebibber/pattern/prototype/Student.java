package cn.winebibber.pattern.prototype;

import java.io.Serializable;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 12:23
 * @Description:
 */
public class Student implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
