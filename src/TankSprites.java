import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TankSprites {
    private final String name;
    private String value;
    private String imageFileName;
    private boolean show;
    private BufferedImage image;
    private Tank tank;


    public TankSprites(String name, String imageFileName, boolean show, Tank tank) {
        this.name = name;
        this.imageFileName = imageFileName;
        this.show = show;
        this.tank = tank;
        image = readImage();

    }
    protected void draw(Graphics g) {
        g.drawImage(image, tank.getX() - 55, tank.getY() -30, 110, 36, null);
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

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }


}
