import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Projectile {
    private BufferedImage image;
    private String imageFileName;


    public Projectile(String imageFileName) {
        this.imageFileName = imageFileName;
        readImage();
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
        int t = 1;

    }

    public BufferedImage getImage() {
        return image;
    }
}
