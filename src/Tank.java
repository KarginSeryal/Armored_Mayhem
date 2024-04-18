import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

public class Tank implements KeyListener{
    private int health;
    private int speed;
    private int x;
    private int y;

    public Tank(int health, int speed) {
        this.health = health;
        this.speed = speed;
        x = 100;
        y = 100;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_A -> x -= 10;
            case KeyEvent.VK_D -> x += 10;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
