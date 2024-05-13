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
    private TankSprites tanks;
    DrawPanel(TankSprites tanks) {
        map = new Terrain();
        this.tanks=tanks;
    }

    protected void paintComponent(Graphics g){
        map.draw(g);
        tanks.draw(g);

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