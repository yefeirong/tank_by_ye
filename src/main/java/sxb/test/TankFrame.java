package sxb.test;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: yefeirong
 * @date: 2022/3/19 16:38
 * @describe:
 */
public class TankFrame extends Frame {
    Tank myTank = new Tank(200,400,Dir.DOWN,Group.GOOD,this);
    List<Bullet> bulletList = new ArrayList<Bullet>();
    List<Tank> tanks = new ArrayList<Tank>();
    private static final int GAME_WIDTH = 1080;
    private static final int GAME_HEIGHT = 960;
    List<Explode> explodes = new ArrayList<>();
    public TankFrame(){
        setResizable(false);
        setSize(GAME_WIDTH,GAME_HEIGHT);
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

    //双缓冲
    @Override
    public void update(Graphics g) {
        if (offScreenImage==null){
            offScreenImage=this.createImage(GAME_WIDTH,GAME_HEIGHT);
        }
        Graphics gOffScreen = offScreenImage.getGraphics();
        Color c = gOffScreen.getColor();
        gOffScreen.setColor(Color.BLACK);
        gOffScreen.fillRect(0,0,GAME_WIDTH,GAME_HEIGHT);
        gOffScreen.setColor(c);
        paint(gOffScreen);
        g.drawImage(offScreenImage,0,0,null);
    }

    @Override
    public void paint(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.WHITE);
        g.drawString("子弹的数量："+bulletList.size(),10,60);
        g.drawString("敌人的数量："+tanks.size(),10,80);
        g.drawString("爆炸的数量："+explodes.size(),10,100);
        g.setColor(c);
        myTank.paint(g);
        for (int i=0;i<bulletList.size();i++){
           bulletList.get(i).paint(g);
        }
        for (int i=0;i<tanks.size();i++){
            tanks.get(i).paint(g);
        }
        for (int i=0;i<explodes.size();i++){
            explodes.get(i).paint(g);
        }
        for (int i=0;i<bulletList.size();i++){
            for (int j=0;j<tanks.size();j++){
                bulletList.get(i).collideWith(tanks.get(j));
            }
        }
//        for (Iterator<Bullet> it = bulletList.iterator();it.hasNext();){
//            Bullet b = it.next();
//            if (!b.live)it.remove();
//        }

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
                    SetMainTankDir();
                    break;
                case KeyEvent.VK_RIGHT:
                    br=true;
                    SetMainTankDir();
                    break;
                case KeyEvent.VK_UP:
                    bu=true;
                    SetMainTankDir();
                    break;
                case KeyEvent.VK_DOWN:
                    bd=true;
                    SetMainTankDir();
                    break;
                default:
                    break;
            }
            SetMainTankDir();
        }



        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT:
                    bl=false;
                    SetMainTankDir();
                    break;
                case KeyEvent.VK_RIGHT:
                    br=false;
                    SetMainTankDir();
                    break;
                case KeyEvent.VK_UP:
                    bu=false;
                    SetMainTankDir();
                    break;
                case KeyEvent.VK_DOWN:
                    bd=false;
                    SetMainTankDir();
                    break;
                    //发射子弹
                case KeyEvent.VK_CONTROL:
                    myTank.fire();
                    break;
                default:
                    break;
            }
            SetMainTankDir();
        }
        private void SetMainTankDir() {
            myTank.setMoving(bl || bu || br || bd);
            if (bl) myTank.setDir(Dir.LEFT);;
            if (bu) myTank.setDir(Dir.UP);
            if (br) myTank.setDir(Dir.RIGHT);
            if (bd) myTank.setDir(Dir.DOWN);
        }


    }



}
