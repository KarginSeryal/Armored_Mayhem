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

public class Terrain extends Graphics2D{
    private ArrayList<Integer> cords;
    public Terrain(){
        cords = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            cords.add(15*i);
            cords.add((int) (Math.random()*200)+300);
        }
        System.out.println(cords.size());
    }

    public ArrayList<Integer> getCords() {
        return cords;
    }


    public void drawCords(){
        setColor(Color.WHITE);
        for(int i = 0; i < cords.size()-2; i += 2){
            System.out.println(cords.get(i+1));


            this.drawLine(cords.get(i),cords.get(i+1),cords.get(i+2),cords.get(i+3));
        }
    }
    public void setColor(Color c) {

    }
    public void drawLine(int x1, int y1, int x2, int y2) {

    }
    public Graphics create() {
        return null;
    }

    public void draw(Shape s) {

    }

    public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
        return false;
    }

    public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {

    }

    public void drawRenderedImage(RenderedImage img, AffineTransform xform) {

    }

    public void drawRenderableImage(RenderableImage img, AffineTransform xform) {

    }

    public void drawString(String str, int x, int y) {

    }

    public void drawString(String str, float x, float y) {

    }

    public void drawString(AttributedCharacterIterator iterator, int x, int y) {

    }

    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
        return false;
    }

    public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
        return false;
    }

    public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
        return false;
    }

    public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
        return false;
    }

    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
        return false;
    }

    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
        return false;
    }

    public void dispose() {

    }

    public void drawString(AttributedCharacterIterator iterator, float x, float y) {

    }

    public void drawGlyphVector(GlyphVector g, float x, float y) {

    }

    public void fill(Shape s) {

    }

    public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
        return false;
    }

    public GraphicsConfiguration getDeviceConfiguration() {
        return null;
    }

    public void setComposite(Composite comp) {

    }

    public void setPaint(Paint paint) {

    }

    public void setStroke(Stroke s) {

    }

    public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {

    }

    public Object getRenderingHint(RenderingHints.Key hintKey) {
        return null;
    }

    public void setRenderingHints(Map<?, ?> hints) {

    }

    public void addRenderingHints(Map<?, ?> hints) {

    }

    public RenderingHints getRenderingHints() {
        return null;
    }

    public void translate(int x, int y) {

    }

    public Color getColor() {
        return null;
    }



    public void setPaintMode() {

    }

    public void setXORMode(Color c1) {

    }

    public Font getFont() {
        return null;
    }

    public void setFont(Font font) {

    }

    public FontMetrics getFontMetrics(Font f) {
        return null;
    }

    public Rectangle getClipBounds() {
        return null;
    }

    public void clipRect(int x, int y, int width, int height) {

    }

    public void setClip(int x, int y, int width, int height) {

    }

    public Shape getClip() {
        return null;
    }

    public void setClip(Shape clip) {

    }

    public void copyArea(int x, int y, int width, int height, int dx, int dy) {

    }



    public void fillRect(int x, int y, int width, int height) {

    }

    public void clearRect(int x, int y, int width, int height) {

    }

    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

    }

    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

    }

    public void drawOval(int x, int y, int width, int height) {

    }

    public void fillOval(int x, int y, int width, int height) {

    }

    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

    }

    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

    }

    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

    }

    public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {

    }

    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {

    }

    public void translate(double tx, double ty) {

    }

    public void rotate(double theta) {

    }

    public void rotate(double theta, double x, double y) {

    }

    public void scale(double sx, double sy) {

    }

    public void shear(double shx, double shy) {

    }

    public void transform(AffineTransform Tx) {

    }

    public void setTransform(AffineTransform Tx) {

    }

    public AffineTransform getTransform() {
        return null;
    }

    public Paint getPaint() {
        return null;
    }

    public Composite getComposite() {
        return null;
    }

    public void setBackground(Color color) {

    }

    public Color getBackground() {
        return null;
    }

    public Stroke getStroke() {
        return null;
    }

    public void clip(Shape s) {

    }

    public FontRenderContext getFontRenderContext() {
        return null;
    }


}
