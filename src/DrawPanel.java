import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

class DrawPanel extends JPanel implements MouseListener {


    private Rectangle button;
    private Terrain map;
    private BufferedImage image;
    DrawPanel() {
        map = new Terrain();
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        float[] color = new float[3];
        color = Color.RGBtoHSB(35, 130, 59, color);

        for(int i = 0; i < map.getCords().size()-2; i += 2){

            g.setColor(Color.getHSBColor(color[0],color[1],color[2]));
            g2.setStroke(new BasicStroke(5));
            g2.drawLine(map.getCords().get(i),map.getCords().get(i+1),map.getCords().get(i+2),map.getCords().get(i+3));

            g2.setStroke(new BasicStroke(20));
            g.setColor(Color.BLACK);
            g2.drawLine(map.getCords().get(i),map.getCords().get(i+1)+20,map.getCords().get(i+2),map.getCords().get(i+3)+20);
            //g.drawLine(map.getCords().get(i),map.getCords().get(i+1),map.getCords().get(i+2),map.getCords().get(i+3));
        }
    }

    public void setMap(Terrain map) {
        this.map = map;
    }

    public void mousePressed(MouseEvent e) {

        Point clicked = e.getPoint();

        if (e.getButton() == 0) {
            int mouseX = e.getX();
            int mouseY = e.getY();
            button.x = mouseX;
            button.y = mouseY;
        }

        if (e.getButton() == 3) {

        }


    }

    public void setButton() {
    }

    public void mouseReleased(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        button.x = mouseX;
        button.y = mouseY;
    }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mouseClicked(MouseEvent e) { }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}