package singleton;

/**
 * @author: yefeirong
 * @date: 2022/3/27 14:36
 * @describe:
 */
public class Mgr01 {

    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01(){

    }
    public static Mgr01 getInstance(){
        return INSTANCE;};
    public void method(){
//        return "m";
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02= Mgr01.getInstance();
        if (mgr01.equals(mgr02)){
            System.out.println(true);
        }else {System.out.println(false);}

    }
}
