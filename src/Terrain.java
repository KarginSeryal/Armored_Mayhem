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
        hitMap = new ArrayList<Point>();
        cordsX.add(0);
        cordsY.add((int) (Math.random()*100)+400);
        int avgY = 0;
        for(int i = 1; i < 2000; i++){
            cordsX.add(i);
            cordsY.add(cordsY.get(i-1) - (int) ((Math.random()*((int) (Math.random()*((int) (Math.random()*9)-4))-((int) (Math.random()*9)-4)))-((int) (Math.random()*((int) (Math.random()*9)-4))-((int) (Math.random()*9)-4))));
        }
        int temp = 0;
        for(int i: cordsY){
            if(i > temp){
                temp = i;
            }
        }
        cordsY.add(temp); //lowest coordinate of the terrain
        for(int i = 0; i < 500; i+=4){
            for(int j = 0; j < 4; j++){
                avgY += cordsY.get(i*4 + j);
            }
            hitMap.add(new Point(4*i,avgY/4));
            System.out.println(avgY);
            avgY = 0;
        }

        /*int slopeX = 4;
        int slopeY;
        for(int i = 0; i < 2000 ; i+=4){
            slopeY = hitMap.get(i + 1).y - hitMap.get(i).y;
            // slopeX = hitMap.get(i + 1).x - hitMap.get(i).x;
            for(int j = 0; j < 4; j++){
                hitMap.add(i + j, new Point(hitMap.get(i).x + j, hitMap.get(i).y + (Math.round((float) slopeY /slopeX) * j)));
            }
         }*/

    }

    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        float[] grass = new float[3];
        float[] dirt = new float[3];
        Color.RGBtoHSB(35, 130, 59, grass);
        Color.RGBtoHSB(59, 45, 18, dirt);
        g.setColor(Color.getHSBColor(dirt[0], dirt[1], dirt[2]));
        g2.setStroke(new BasicStroke(7));
        for(int j = 0; j < 150; j+=7) {     //brown floor
            for (int i = 0; i < cordsX.size() - 1; i++) {
                g2.drawLine(cordsX.get(i), cordsY.get(i) + 10+j, cordsX.get(i + 1), cordsY.get(i + 1) + 10+j);
            }
        }
        g2.setStroke(new BasicStroke(40));
        for(int j = 0; j < 200; j+=40) {     //brown floor
            for (int i = 0; i < cordsX.size() - 1; i++) {
                g2.drawLine(cordsX.get(i), cordsY.get(i) + 140+j, cordsX.get(i + 1), cordsY.get(i + 1) + 140+j);
            }
        }
        g.fillRect(0, cordsY.get(cordsY.size()-1), 2000, 1000);

        g.setColor(Color.getHSBColor(grass[0], grass[1], grass[2]));
        g2.setStroke(new BasicStroke(3));
        for(int j = 0; j < 10; j++) {     //grass
            for (int i = 0; i < cordsX.size() - 1; i++) {

                g2.drawLine(cordsX.get(i), cordsY.get(i)+j, cordsX.get(i + 1), cordsY.get(i + 1)+j);
            }
        }

//        for (int i = 0; i < hitMap.size() - 1; i++) {  //Floor hitbox
//            g.setColor(Color.gray);
//            g2.setStroke(new BasicStroke(3));
//            g2.drawLine(hitMap.get(i).x, hitMap.get(i).y +5, hitMap.get(i + 1).x, hitMap.get(i + 1).y +5);
//        }

    }

    public ArrayList<Integer> getMap() {
        return cordsY;
    }

    public ArrayList<Point> getHitMap() {
        return hitMap;
    }
}
