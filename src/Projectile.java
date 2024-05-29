import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Projectile {
    private BufferedImage image;
    private Terrain map;
    private String imageFileName;


    public Projectile(String imageFileName, Terrain map) {
        this.imageFileName = imageFileName;
        readImage();
        this.map = map;
    }
    public BufferedImage readImage() {
        image = null;

        try {
            image = ImageIO.read(new File(imageFileName));
            return image;
        }
        catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    protected void draw(Graphics g,int x,int y, int deg){
        int t = 0;
        double vY = 10 * Math.sin(deg);      //velocity vertical
        double vX = 10 * Math.cos(deg);      //velocity horizontal
        double tempX = x;
        double tempY = y;
        while(map.getHitMap().get((int) (tempX/4)).y > tempY){
             tempX = x + (t * vX);




             t++;
        }


    }

    public BufferedImage getImage() {
        return image;
    }
}
