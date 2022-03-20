package sxb.test;

import java.awt.*;

/**
 * @author: yefeirong
 * @date: 2022/3/19 20:22
 * @describe:
 */
public class Bullet {
    private static final int SPEED =5;
    private static final int HEIGHT =10,WIDTH=10;
    private int x,y;
    private Dir dir;
    private boolean living = true;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    private Group group = Group.GOOD;


    public Bullet(int x,int y,Dir dir,Group group){
        this.x=x;
        this.y=y;
        this.dir=dir;
    }
    public void paint(Graphics g){
        Color color = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x,y,HEIGHT,WIDTH);
        g.setColor(color);
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
    }

    public void collideWith(Tank tank) {
        if (this.group==tank.getGroup())return;
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
