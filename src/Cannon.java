import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Cannon implements KeyListener {

    private BufferedImage image;
    private String imageFileName;
    private int deg = 0;

    public Cannon(String imageFileName) {
        this.imageFileName = imageFileName;
        readImage();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){

        }
    }

    public int getDeg() {
        return deg;
    }

    @Override
    public void keyReleased(KeyEvent e) {

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

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public BufferedImage getImage() {
        return image;
    }
}
