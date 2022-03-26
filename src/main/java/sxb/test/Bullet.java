package sxb.test;

import java.awt.*;

/**
 * @author: yefeirong
 * @date: 2022/3/19 20:22
 * @describe:
 */
public class Bullet {
    private static final int SPEED =5;
    public static final int HEIGHT =ResourceMgr.bulletD.getHeight();
    public static final int WIDTH=ResourceMgr.bulletD.getWidth();
    private int x,y;
    private Dir dir;
    private boolean living = true;
    TankFrame tf =null;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    private Group group = Group.GOOD;


    public Bullet(int x,int y,Dir dir,Group group,TankFrame tf){
        this.x=x;
        this.y=y;
        this.dir=dir;
        this.group=group;
        this.tf =tf;
    }
    public void paint(Graphics g){
        if (!living)tf.bulletList.remove(this);
        switch (dir){
            case LEFT:
                g.drawImage(ResourceMgr.bulletL,x,y,null);
                break;
            case RIGHT:
                g.drawImage(ResourceMgr.bulletR,x,y,null);
                break;
            case UP:
                g.drawImage(ResourceMgr.bulletU,x,y,null);
                break;
            case DOWN:
                g.drawImage(ResourceMgr.bulletD,x,y,null);
                break;}
        move();

    }

    private void move() {
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
            default:
                break;
        }
        if (x<0 || y<0 || x>TankFrame.WIDTH||y>TankFrame.HEIGHT) {
        living=false;
        }

    }

    public void collideWith(Tank tank) {
        if (this.group==tank.getGroup())return;
        //todo:用一个rect来记录子弹的位置
        Rectangle rect = new Rectangle(this.x,this.y,WIDTH,HEIGHT);
        Rectangle rect2 = new Rectangle(tank.getX(),tank.getY(),WIDTH,HEIGHT);
        if (rect.intersects(rect2)){
                tank.die();
                this.die();
        }
    }

    private void die() {
        this.living = false;
    }
}
