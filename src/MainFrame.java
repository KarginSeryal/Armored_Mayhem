import javax.swing.JFrame;

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel p;
    private TankSprites t;
    private Thread windowThread;
    private Tank tank;
    private Terrain map;

    public MainFrame(String display) {
        super(display);
        int frameWidth = 1500;
        int frameHeight = 1000;
        p = new DrawPanel();
        tank = new Tank(100, 100);
        t = new TankSprites("tank", "sprites/tank_1.png", true, tank);
        map = new Terrain();
        this.add(t);
        this.addKeyListener(tank);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(frameWidth, frameHeight);
        this.setLocation(200, 20);
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
            t.repaint();
        }
    }
}



