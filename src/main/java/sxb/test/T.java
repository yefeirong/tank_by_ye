package sxb.test;


/**
 * @author: yefeirong
 * @date: 2022/3/19 16:28
 * @describe:  git:bjmashibing/tank
 */
public class T {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();
        //初始化敌方坦克
        for(int i=0;i<5;i++){
            tf.tanks.add(new Tank(50+i*30,200,Dir.LEFT,Group.BAD,tf));
        }
        while (true){
            Thread.sleep(50);
            tf.repaint();
        }
    }
}
