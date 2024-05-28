import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

public class Tank implements KeyListener{
    private int health;
    private int speed;
    private int x;
    private Terrain map;
    private Cannon cannon;
    private boolean shoot;

    public Tank(int health, int speed, Terrain map, Cannon cannon) {
        this.health = health;
        this.speed = speed;
        x = 0;
        this.map = map;
        this.cannon = cannon;
        shoot = false;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getX() {
        return (int) map.getHitMap().get(this.x).getX();
    }

    public boolean isShoot() {
        return shoot;
    }

    public void setShoot(boolean shoot) {
        this.shoot = shoot;
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
                if(x>0){
                    x--;
                }
            }
            case KeyEvent.VK_D -> {
                if(x < 2000){
                    x++;
                }

            }
            case KeyEvent.VK_K -> {
                if(cannon.getDeg()>0){
                    cannon.setDeg(cannon.getDeg()- 1);
                    System.out.println("biden");

                }
            }
            case KeyEvent.VK_J -> {
                if(cannon.getDeg() < 2000){
                    cannon.setDeg(cannon.getDeg() + 1);
                    System.out.println("joe");
                }
            }
            case KeyEvent.VK_SPACE -> {

            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
