package singleton;

/**
 * @author: yefeirong
 * @date: 2022/3/27 15:42
 * @describe:
 */
public class Mgr02 {
    private static Mgr02 INSTANCE ;

    //懒汉式
    private Mgr02(){

    }
    public static synchronized Mgr02 getInstance(){
        if (INSTANCE==null){
            INSTANCE = new Mgr02();
        }
        return INSTANCE;
    }
}
