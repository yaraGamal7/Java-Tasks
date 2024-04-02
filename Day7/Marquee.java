    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
    import javax.swing.Timer;

    import java.awt.BorderLayout;
    import java.awt.Graphics;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.Date;

    class Marquee extends JPanel {
        int x = 0, y = 100;
        int delay = 200;
        Timer timer;

        public Marquee() {
            timer = new Timer(delay, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x += 10;
                    if (x >= getParent().getWidth()) {
                        x = 0;
                    }
                    repaint();
                }
            });
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (x + 50 > getParent().getWidth()) {
                g.drawString("YARA JAMAL", x - getParent().getWidth(), y);
            }
            g.drawString("YARA JAMAL", x, y);
        }

        public static void main(String[] args) {
        
            JFrame frame = new JFrame();
            frame.add(new Marquee());
            frame.setBounds(210, 310, 600, 400);
            frame.setVisible(true);
        }
    }
