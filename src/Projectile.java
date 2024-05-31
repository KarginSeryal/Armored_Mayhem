import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Projectile {
    private BufferedImage image;
    private Terrain map;
    private String imageFileName;
    private int t;


    public Projectile(String imageFileName, Terrain map) {
        this.imageFileName = imageFileName;
        readImage();
        this.map = map;
        t = 0;
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

    protected boolean draw(Graphics g,int x,int y, int deg){
        if(map.getHitMap().get(x).y >= y){
            t = 0;
            return false;
        }else{
            t++;
        }
        double vY = 10 * Math.sin(deg);      //velocity vertical
        double vX = 10 * Math.cos(deg);      //velocity horizontal
        double tempX = x;
        double tempY = y;
        x = (int) (x + (t * vX));
        y = (int) (y + (t * vY));
        vY -= 3;
        g.drawImage(image, x, y, 16, 16, null);

        return true;
    }

    public BufferedImage getImage() {
        return image;
    }
}
