import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.util.Date;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class DateApp {

    public DateApp(){
        JFrame frame = new JFrame("Date App");
        frame.setBounds(210, 310, 600, 400);

        JLabel timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(timeLabel, BorderLayout.CENTER);
        frame.add(panel);

        Timer timer = new Timer(1000, e -> {
            Date d = new Date();
            timeLabel.setText(d.toString());
        });
        timer.start();

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DateApp());
    }
}
