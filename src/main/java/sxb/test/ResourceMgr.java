package sxb.test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

/**
 * @author: yefeirong
 * @date: 2022/3/20 13:34
 * @describe:
 */
public class ResourceMgr {
    public  static BufferedImage tankL ,tankU,tankD,tankR,bulletL,bulletR,bulletU,bulletD;
    public static BufferedImage[] explores = new BufferedImage[16];
    static {
        try {
            tankL = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankL.gif"));
            tankR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankR.gif"));

            tankU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankU.gif"));
            tankD = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankD.gif"));


            bulletL = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletL.gif"));
            bulletR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletR.gif"));

            bulletU = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletU.gif"));
            bulletD = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletD.gif"));

            for (int i=0;i<16;i++){
                explores[i]=ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream(("images/e"+(i+1)+".gif")));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
