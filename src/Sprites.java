import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
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
        g.drawImage(cannon.getImage(), tank.getX()+6, tank.getY() -26, 40, 8, null);
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



}
