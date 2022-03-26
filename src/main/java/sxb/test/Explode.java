package sxb.test;

import java.awt.*;

/**
 * @author: yefeirong
 * @date: 2022/3/20 16:14
 * @describe:
 */
public class Explode {
    public static  int WIDTH = ResourceMgr.explores[0].getWidth();
    public static  int HEIGHT = ResourceMgr.explores[0].getHeight();
    private int x,y;
    private boolean living = true;
    TankFrame tf = null;
    private  int step =0;

    public Explode(int x, int y, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.tf = tf;
        new Audio("audio/explode.wav").play();
    }

    public void paint(Graphics g){
      g.drawImage(ResourceMgr.explores[step++],x,y,null);
      if (step>=ResourceMgr.explores.length){
            tf.explodes.remove(this);
      }

    }





}
