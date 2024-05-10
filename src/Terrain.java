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
    private ArrayList<Integer> cordsX;
    private ArrayList<Integer> cordsY;
    private ArrayList<Point> hitMap;
    public Terrain(){
        cordsX = new ArrayList<Integer>();
        cordsY = new ArrayList<Integer>();
        cordsX.add(0);
        cordsY.add((int) (Math.random()*100)+400);
        int avgX = 0;
        int avgY;
        for(int i = 1; i < 2000; i++){
            cordsX.add(i * 1);
            cordsY.add(cordsY.get(i-1) - (int) ((Math.random()*((int) (Math.random()*((int) (Math.random()*9)-4))-((int) (Math.random()*9)-4)))-((int) (Math.random()*((int) (Math.random()*9)-4))-((int) (Math.random()*9)-4))));
        }
        for(int i = 0; i < 500; i+=4){
            for(int j = 0; j < 4; j++){
                avgX += cordsX.get(j);         //average out the x and y cords every 4x and add as Point to hitMap for a hitbox
            }
        }
    }

    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        float[] color1 = new float[3];
        float[] color2 = new float[3];
        Color.RGBtoHSB(35, 130, 59, color1);
        Color.RGBtoHSB(59, 45, 18, color2);
        for(int j = 0; j <500; j+=3) {
            for (int i = 0; i < cordsX.size() - 1; i++) {
                g.setColor(Color.getHSBColor(color2[0], color2[1], color2[2]));
                g2.setStroke(new BasicStroke(3));
                g2.drawLine(cordsX.get(i), cordsY.get(i) + 10+j, cordsX.get(i + 1), cordsY.get(i + 1) + 10+j);
            }
        }
        for(int j = 0; j < 10; j++) {
            for (int i = 0; i < cordsX.size() - 1; i++) {
                g.setColor(Color.getHSBColor(color1[0], color1[1], color1[2]));
                g2.setStroke(new BasicStroke(3));
                g2.drawLine(cordsX.get(i), cordsY.get(i)+j, cordsX.get(i + 1), cordsY.get(i + 1)+j);
            }
        }
    }


}
