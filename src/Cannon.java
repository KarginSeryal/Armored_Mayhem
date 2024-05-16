import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Cannon{

    private BufferedImage image;
    private String imageFileName;


    public Cannon(String imageFileName) {
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

    public BufferedImage getImage() {
        return image;
    }
}
