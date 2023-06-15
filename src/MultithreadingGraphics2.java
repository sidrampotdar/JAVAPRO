import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultithreadingGraphics2 extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int SLEEP_TIME = 50; // milliseconds
    private final int NUM_SHAPES = 30;
    private Shape[] shapes;
    private Thread thread;
    private Random random;

    public MultithreadingGraphics2() {
        shapes = new Shape[NUM_SHAPES];
        random = new Random();
        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int size = random.nextInt(50) + 20;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            shapes[i] = new Shape(x, y, size, color);
        }
        thread = new Thread(this);
        thread.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Multithreading Graphics 2");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MultithreadingGraphics2());
        frame.setVisible(true);
    }

    public void run() {
        while (true) {
            for (int i = 0; i < NUM_SHAPES; i++) {
                shapes[i].move(WIDTH, HEIGHT);
            }
            repaint();
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < NUM_SHAPES; i++) {
            shapes[i].draw(g);
        }
    }

    private class Shape {
        private int x;
        private int y;
        private int size;
        private Color color;
        private int xDirection;
        private int yDirection;

        public Shape(int x, int y, int size, Color color) {
            this.x = x;
            this.y = y;
            this.size = size;
            this.color = color;
            xDirection = random.nextInt(3) - 1; // -1, 0, or 1
            yDirection = random.nextInt(3) - 1;
            while (xDirection == 0 && yDirection == 0) {
                xDirection = random.nextInt(3) - 1;
                yDirection = random.nextInt(3) - 1;
            }
        }

        public void move(int width, int height) {
            if (x + size + xDirection > width || x + xDirection < 0) {
                xDirection = -xDirection;
            }
            if (y + size + yDirection > height || y + yDirection < 0) {
                yDirection = -yDirection;
            }
            x += xDirection;
            y += yDirection;
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, size, size);
            g.setColor(Color.BLACK);
            g.drawOval(x, y, size, size);
        }
    }
}
