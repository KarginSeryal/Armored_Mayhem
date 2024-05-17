import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class Sprites {
    private final String name;
    private String value;
    private String imageFileName;
    private BufferedImage image;
    private Tank tank;
    private Cannon cannon;


    public Sprites(String name, String imageFileName, Tank tank, Cannon cannon) {
        this.name = name;
        this.imageFileName = imageFileName;
        this.tank = tank;
        this.cannon = cannon;
        image = readImage();

    }
    protected void draw(Graphics g) {

        g.drawImage(rotateImageByDegrees(cannon.getImage(), cannon.getDeg()), tank.getX()+6, tank.getY() -26, 40, 8, null);
        g.drawImage(image, tank.getX() - 54, tank.getY() -30, 108, 36, null);
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
    public BufferedImage rotateImageByDegrees(BufferedImage img, double angle) {
        double rads = Math.toRadians(angle);
        double sin = Math.abs(Math.sin(rads)), cos = Math.abs(Math.cos(rads));
        int w = img.getWidth();
        int h = img.getHeight();
        int newWidth = (int) Math.floor(w * cos + h * sin);
        int newHeight = (int) Math.floor(h * cos + w * sin);

        BufferedImage rotated = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = rotated.createGraphics();
        AffineTransform at = new AffineTransform();
        at.translate((double) (newWidth - w) / 2, (double) (newHeight - h) / 2);

        int x = w / 2;
        int y = h / 2;

        at.rotate(rads, x, y);
        g2d.setTransform(at);
        g2d.drawImage( img, 0, 0, null);
        g2d.dispose();

        return rotated;
    }


    public void drawTank(Graphics g){
        while(true)
            g.drawImage(image, 100, 100, null);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Cannon getCannon() {
        return cannon;
    }
}
