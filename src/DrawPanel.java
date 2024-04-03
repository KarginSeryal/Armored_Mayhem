import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.Font;

class DrawPanel extends JPanel implements MouseListener {


    private Rectangle button;

    public DrawPanel() {
        button = new Rectangle(2000, 400, 400, 400);
        this.addMouseListener(this);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Courier New", Font.BOLD, 20));
        g.drawString("GET NEW CARDS", 150, 120);
        g.drawRect((int)button.getX(), (int)button.getY(), (int)button.getWidth(), (int)button.getHeight());
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

    }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mouseClicked(MouseEvent e) { }
}