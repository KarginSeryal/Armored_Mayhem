import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TankSprites extends DrawPanel{
    private String name;
    private String value;
    private String imageFileName;
    private boolean show;
    private BufferedImage image;

    public TankSprites(String name, String imageFileName, boolean show) {
        this.name = name;
        this.imageFileName = imageFileName;
        this.show = show;
    }

    public BufferedImage readImage() {
        try {
            BufferedImage image;
            image = ImageIO.read(new File(imageFileName));
            this.setImage(image);
            return image;
        }
        catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    public void drawTank(Graphics g){
        while(true)
            g.drawImage(image, 100, 100, null, null);
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
