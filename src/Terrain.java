import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Map;

public class Terrain {
    private ArrayList<Integer> cords;
    public Terrain(){
        cords = new ArrayList<Integer>();
        for(int i = 0; i < 75; i++){
            cords.add(i * 25);
            cords.add((int) (Math.random()*50)+500);
        }
        System.out.println(cords.size());
    }

    public ArrayList<Integer> getCords() {
        return cords;
    }


    public void drawCords(){

    }

}
