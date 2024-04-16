import javax.swing.JFrame;

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel p;
    private TankSprites t;
    private Thread windowThread;

    public MainFrame(String display) {
        super(display);
        int frameWidth = 1500;
        int frameHeight = 1000;
        t = new TankSprites("tank", "sprites/tank_1.png", true);
        this.add(t);
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
            t.repaint();
        }
    }
}



