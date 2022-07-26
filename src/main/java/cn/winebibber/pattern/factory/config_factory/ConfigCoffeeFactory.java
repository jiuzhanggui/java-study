package cn.winebibber.pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 09:25
 * @Description:
 */
public class ConfigCoffeeFactory {

    private static Map<String, Coffee> map = new HashMap<String, Coffee>();

    static {
        Properties properties = new Properties();
        InputStream resourceAsStream = ConfigCoffeeFactory.class.getClassLoader().getResourceAsStream("config-factory.properties");
        try {
            properties.load(resourceAsStream);
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty((String) key);
                Class<?> aClass = Class.forName(className);
                Coffee coffee = (Coffee) aClass.newInstance();
                map.put((String) key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Coffee createCoffee(String name){
        return map.get(name);
    }
}
