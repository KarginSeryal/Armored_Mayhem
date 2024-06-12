import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Projectile {
    private BufferedImage image;
    private Terrain map;
    private String imageFileName;
    private Tank tank;
    private double vY;
    private double vX;
    private int x;
    private int y;
    private boolean newShot = true;


    public Projectile(String imageFileName, Terrain map, Tank t) {
        this.imageFileName = imageFileName;
        readImage();
        this.map = map;
        tank = t;
    }

    public BufferedImage readImage() {
        image = null;

        try {
            image = ImageIO.read(new File(imageFileName));
            return image;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    protected boolean draw(Graphics g, int tempX, int tempY, int deg, int power) {
        if(newShot) {
            vY = 3 * power * Math.sin(Math.toRadians(deg));      //velocity vertical
            vX = 5 * power * Math.cos(Math.toRadians(deg));      //velocity horizontal
            tank.setPower(3);
        }
         x = tempX;
         y = tempY;

        if (x > 0 && x < 2000) {
            vY -= 3;
            x += vX;
            y -= vY;
        }
        g.drawImage(image, x, y, 16, 16, null);

        if (map.getMap().get(x) <= y || x < 0 || x > 2000) {
            tank.setShoot(false);
            newShot = true;
            System.out.println("hit");
            return true;

        }
        System.out.println(newShot);
        return false;
    }

    public BufferedImage getImage() {
        return image;
    }

    public double getvY() {
        return vY;
    }

    public void setvY(double vY) {
        this.vY = vY;
    }

    public double getvX() {
        return vX;
    }

    public void setvX(double vX) {
        this.vX = vX;
    }

    public int getTempX() {
        return x;
    }

    public void setTempX(int tempX) {
        this.x = tempX;
    }

    public int getTempY() {
        return y;
    }

    public void setTempY(int tempY) {
        this.y = tempY;
    }

    public boolean isNewShot() {
        return newShot;
    }

    public void setNewShot(boolean newShot) {
        this.newShot = newShot;
    }
}
