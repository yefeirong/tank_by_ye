package sxb.test;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: yefeirong
 * @date: 2022/3/19 16:38
 * @describe:
 */
public class TankFrame extends Frame {
    Tank myTank = new Tank(100,100,Dir.DOWN,Group.GOOD,this);
    Bullet bullet = new Bullet(300,300,Dir.DOWN,Group.GOOD);
    List<Bullet> bulletList = new ArrayList<Bullet>();
    List<Tank> tanks = new ArrayList<Tank>();
    private static final int WIDTH = 800;
    private static final int HEIGHT = 400;
    Explode e = new Explode(100,100,this);
    public TankFrame(){
        setResizable(false);
        setSize(WIDTH,HEIGHT);
        setTitle("tank war");
        setVisible(true);
        this.addKeyListener(new MyKeyListener());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        if (offScreenImage==null){
            offScreenImage=this.createImage(WIDTH,HEIGHT);
        }
        Graphics gOffScreen = offScreenImage.getGraphics();
        Color c = gOffScreen.getColor();
        gOffScreen.setColor(Color.white);
        gOffScreen.fillRect(0,0,WIDTH,HEIGHT);
        gOffScreen.setColor(c);
        paint(gOffScreen);
        g.drawImage(offScreenImage,0,0,null);
    }

    @Override
    public void paint(Graphics g){
        myTank.paint(g);
        for (Bullet b:bulletList){
            b.paint(g);
        }
        for (int i=0;i<tanks.size();i++){
            tanks.get(i).paint(g);
        }
        for (int i=0;i<bulletList.size();i++){
            bulletList.get(i).collideWith(tanks.get(i));
        }
        for (int i=0;i<bulletList.size();i++){
            for (int j=0;j<tanks.size();j++){
                bulletList.get(i).collideWith(tanks.get(j));
            }
        }

    }
    class MyKeyListener extends KeyAdapter{
        boolean bl =false;
        boolean bu = false;
        boolean br = false;
        boolean bd =false;

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT:
                    bl=true;
                    break;
                case KeyEvent.VK_RIGHT:
                    br=true;
                    break;
                case KeyEvent.VK_UP:
                    bu=true;
                    break;
                case KeyEvent.VK_DOWN:
                    bd=true;
                    break;
                default:
                    break;
            }
        SetMainTank();
        }

        private void SetMainTank() {
            if (!bl && !bu && !br && !bd){
                myTank.setMoving(false);
            }else {
                myTank.setMoving(true);
            }

            if (bl) myTank.setDir(Dir.LEFT);
            if (bu) myTank.setDir(Dir.UP);
            if (br) myTank.setDir(Dir.RIGHT);;
            if (bd) myTank.setDir(Dir.DOWN);


        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT:
                    bl=false;
                    break;
                case KeyEvent.VK_RIGHT:
                    br=false;
                    break;
                case KeyEvent.VK_UP:
                    bu=false;
                    break;
                case KeyEvent.VK_DOWN:
                    bd=false;
                    break;
                case KeyEvent.VK_CONTROL:
                    myTank.fire();
                    break;
                default:
                    break;
            }
            SetMainTank();
        }
    }

}
