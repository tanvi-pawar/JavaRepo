import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SimplePaint extends JFrame {

    DrawArea drawArea = new DrawArea();

    public SimplePaint() {
        setTitle("Simple Paint Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> drawArea.clear());

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(drawArea, BorderLayout.CENTER);
        panel.add(clearButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimplePaint();
    }

    class DrawArea extends JPanel {

        private final ArrayList<Point> points = new ArrayList<>();

        public DrawArea() {
            setBackground(Color.BLACK);

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    points.add(e.getPoint());
                    repaint();
                }
            });

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    points.add(e.getPoint());
                }
            });
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.WHITE);
            for (int i = 1; i < points.size(); i++) {
                Point p1 = points.get(i - 1);
                Point p2 = points.get(i);
                if (p1 != null && p2 != null)
                    g.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }

        public void clear() {
            points.clear();
            repaint();
        }
    }
}
