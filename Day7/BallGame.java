import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class BallGame extends JPanel implements ActionListener {
    private int x = 0;
    private int y = 0;
    private int xSpeed = 2;
    private int ySpeed = 2;
    private final int DIAMETER = 30;

    public BallGame() {
        Timer timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }
/*
    @Override
    public void actionPerformed(ActionEvent e) {
        if (x + xSpeed < 0 || x + xSpeed >= getWidth() - DIAMETER) {
            xSpeed = -xSpeed;
        }
        if (y + ySpeed < 0 || y + ySpeed >= getHeight() - DIAMETER) {
            ySpeed = -ySpeed;
        }
        x += xSpeed;
        y += ySpeed;
        repaint();
    }
*/
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(new BallGame());
        frame.setVisible(true);
    }
}
