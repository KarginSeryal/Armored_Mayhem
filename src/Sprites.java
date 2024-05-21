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
        BufferedImage bufImg = toBufferedImage(img);
        double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
        int w = bufImg.getWidth(), h = bufImg.getHeight();
        int newW = (int) Math.floor(w * cos + h * sin), newH = (int) Math.floor(h * cos + w * sin);
        BufferedImage result = new BufferedImage(newW, newH, Transparency.TRANSLUCENT);
        Graphics2D g = result.createGraphics();
        g.translate((newW - w) / 2, (newH - h) / 2);
        g.rotate(angle, w / 2, h / 2);
        g.drawRenderedImage(bufImg, null);
        g.dispose();
        return result;
    }
    public static BufferedImage toBufferedImage(Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage) image;
        }
        BufferedImage buff = new BufferedImage(image.getWidth(null), image.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = buff.createGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return buff;
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
