import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

public class Tank implements KeyListener{
    private int health;
    private int speed;
    private int x;
    private Terrain map;

    public Tank(int health, int speed, Terrain map) {
        this.health = health;
        this.speed = speed;
        x = 0;
        this.map = map;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getX() {
        return map.getHitMap().get(x).x;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getY() {
        return map.getHitMap().get(x).y;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_A -> {
                if(x < 2000){
                    x++;
                }
            }
            case KeyEvent.VK_D -> {
                if(x>0){
                    x--;
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
