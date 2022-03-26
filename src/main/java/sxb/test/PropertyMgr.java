package sxb.test;

import java.io.IOException;
import java.util.Properties;

/**
 * @author: yefeirong
 * @date: 2022/3/26 20:28
 * @describe:
 */
public class PropertyMgr {
    static Properties props = new Properties();
    static {
        try {
            props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config"));
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public static Object get(String key){
        if (props == null)return null;
        return props.get(key);
    }

    public static void main(String[] args) {
        System.out.println(PropertyMgr.get("initTankCount"));
    }
}
