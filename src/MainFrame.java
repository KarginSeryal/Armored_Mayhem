import javax.swing.JFrame;
import java.awt.*;

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel p;
    private Sprites t;
    private Thread windowThread;
    private Tank tank;
    private Terrain map;
    private Cannon cannon;
    private Projectile bullet;

    public MainFrame(String display) {
        super(display);
        int frameWidth = 2000;
        int frameHeight = 1000;
        float[] bgc = new float[3];
        bgc = Color.RGBtoHSB(32,174,199, bgc);
        this.setBackground(Color.getHSBColor(bgc[0],bgc[1],bgc[2]));
        cannon = new Cannon("sprites/cannon_1.png");
        map = new Terrain();
        bullet = new Projectile("sprites/ball.png", map);
        tank = new Tank(100, 100, map, cannon);
        t = new Sprites("tank", "sprites/tank_1.png", tank, cannon, bullet);
        p = new DrawPanel(t);
        p.setMap(map);
        this.add(p);
        this.addKeyListener(tank);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(frameWidth, frameHeight);
        this.setLocation(0, 20);
        this.setVisible(true);
        this.setResizable(false);
        startThread();

    }

    public void startThread() {
        windowThread = new Thread(this);
        windowThread.start();
    }

    public void run() {
        while (true) {
            this.repaint();
            p.repaint();
        }
    }
}



