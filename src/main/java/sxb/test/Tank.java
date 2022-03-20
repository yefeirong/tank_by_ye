package sxb.test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.util.Random;

/**
 * @author: yefeirong
 * @date: 2022/3/19 17:56
 * @describe:
 */
public class Tank {
    private int x;

    private Random random = new Random();
    private int y;
    private Dir dir = Dir.DOWN;
    private static final int SPEED=10;
    private boolean moving =false;
    private TankFrame tf =null;
    private boolean living =true;
    private Group group = Group.BAD;
    public Tank(int x,int y,Dir dir,Group group ,TankFrame tf){
        super();
        this.dir=dir;
        this.x=x;
        this.y=y;
        this.tf=tf;
        this.group=group;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public void paint(Graphics g) {
        if (!living)tf.tanks.remove(this);
        switch (dir){
            case LEFT:
                g.drawImage(ResourceMgr.tankL,x,y,null);
                break;
            case RIGHT:
                g.drawImage(ResourceMgr.tankR,x,y,null);
                break;
            case UP:
                g.drawImage(ResourceMgr.tankU,x,y,null);
                break;
            case DOWN:
                g.drawImage(ResourceMgr.tankD,x,y,null);
                break;
            default:
                break;
        }

        g.drawImage(ResourceMgr.tankL,x,y,null);
        move();
    }

    private void move() {
        if (!moving){
            return;
        }

        switch (dir){
            case LEFT:
                x-=SPEED;
                break;
            case UP:
                y-=SPEED;
                break;
            case RIGHT:
                x+=SPEED;
                break;
            case DOWN:
                y+=SPEED;
                break;
        }
        if (random.nextInt(10)>8){
            this.fire();

        }
    }


    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public void fire() {
        tf.bulletList.add(new Bullet(this.x,this.y,this.dir,Group.GOOD));
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void die(){
        this.living=false;
    }

}
