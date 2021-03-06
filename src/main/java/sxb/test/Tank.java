package sxb.test;
import java.awt.*;
import java.util.Random;

/**
 * @author: yefeirong
 * @date: 2022/3/19 17:56
 * @describe:
 */
public class Tank {
    private int x;
    private int y;
    public static final int HEIGHT =ResourceMgr.tankD.getHeight();
    public static final int WIDTH=ResourceMgr.tankD.getWidth();
    private Random random = new Random();
    private Dir dir = Dir.DOWN;
    private static final int SPEED=3;
    private boolean moving =true;
    private TankFrame tf =null;
    private boolean living =true;
    Rectangle rectangle = new Rectangle();
    private Group group = Group.BAD;
    public Tank(int x,int y,Dir dir,Group group ,TankFrame tf){
        super();
        this.dir=dir;
        this.x=x;
        this.y=y;
        this.tf=tf;
        this.group=group;
        rectangle.x =this.x;
        rectangle.y=this.y;
        rectangle.height=HEIGHT;
        rectangle.width=WIDTH;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }
    //坦克把自己画出来
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
//            default:
//                break;
        }

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

        if (this.group == Group.BAD && random.nextInt(100)>95){
            this.fire();
            if (this.group == Group.BAD){randomDir();}
            boundCheck();
            rectangle.x=this.x;
            rectangle.y=this.y;
        }
    }

    private void boundCheck() {
        if (this.x<0)x=0;
        if (this.y<30)y=30;
        if (this.x > TankFrame.WIDTH- Tank.WIDTH -2) x = TankFrame.WIDTH - Tank.WIDTH -2;
        if (this.y > TankFrame.HEIGHT - Tank.HEIGHT -2 ) y = TankFrame.HEIGHT -Tank.HEIGHT -2;
    }

    private void randomDir() {

       this.dir = Dir.values()[random.nextInt(4)] ;
    }


    public void fire() {
        int bX = this.x + Tank.WIDTH/2 - Bullet.WIDTH/2;
        int bY = this.y + Tank.HEIGHT/2 - Bullet.HEIGHT/2;
        Bullet b = new Bullet(bX, bY, this.dir, this.group, this.tf);
        tf.bulletList.add(b);
    }




    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
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
