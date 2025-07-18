
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class PaintAppWithEraser extends JFrame {

    public PaintAppWithEraser() {
        setTitle("Simple Paint App with Eraser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        DrawArea drawArea = new DrawArea();

        JButton colorButton = new JButton("Color");
        colorButton.addActionListener(e -> {
            Color newColor = JColorChooser.showDialog(null, "Choose Brush Color", drawArea.getBrushColor());
            if (newColor != null) {
                drawArea.setBrushColor(newColor);
            }
        });

        String[] sizes = { "2", "4", "8", "16", "32" };
        JComboBox<String> sizeBox = new JComboBox<>(sizes);
        sizeBox.setSelectedIndex(2);
        sizeBox.addActionListener(e -> {
            int size = Integer.parseInt((String) sizeBox.getSelectedItem());
            drawArea.setBrushSize(size);
        });

        JToggleButton eraserButton = new JToggleButton("Eraser");
        eraserButton.addActionListener(e -> {
            drawArea.setEraserMode(eraserButton.isSelected());
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> drawArea.clear());

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> drawArea.saveImage());

        JPanel controls = new JPanel();
        controls.add(colorButton);
        controls.add(new JLabel("Brush Size:"));
        controls.add(sizeBox);
        controls.add(eraserButton);
        controls.add(clearButton);
        controls.add(saveButton);

        add(controls, BorderLayout.NORTH);
        add(drawArea, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintAppWithEraser();
    }
}

class DrawArea extends JPanel {

    private BufferedImage canvas;
    private Graphics2D g2d;
    private int brushSize = 8;
    private Color brushColor = Color.BLACK;
    private boolean eraserMode = false;
    private Color savedColor = Color.BLACK;

    public DrawArea() {
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                draw(e.getX(), e.getY());
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                draw(e.getX(), e.getY());
            }
        });
    }

    public void setBrushSize(int size) {
        this.brushSize = size;
    }

    public void setBrushColor(Color color) {
        this.brushColor = color;
        this.savedColor = color;
    }

    public Color getBrushColor() {
        return brushColor;
    }

    public void setEraserMode(boolean mode) {
        this.eraserMode = mode;
        if (mode) {
            brushColor = Color.WHITE;
        } else {
            brushColor = savedColor;
        }
    }

    protected void paintComponent(Graphics g) {
        if (canvas == null) {
            canvas = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            g2d = canvas.createGraphics();
            g2d.setPaint(Color.WHITE);
            g2d.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
            g2d.setPaint(brushColor);
        }
        g.drawImage(canvas, 0, 0, null);
    }

    private void draw(int x, int y) {
        if (g2d != null) {
            g2d.setPaint(brushColor);
            g2d.fillOval(x - brushSize / 2, y - brushSize / 2, brushSize, brushSize);
            repaint();
        }
    }

    public void clear() {
        g2d.setPaint(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        repaint();
    }

    public void saveImage() {
        try {
            File output = new File("paint_output.png");
            ImageIO.write(canvas, "png", output);
            JOptionPane.showMessageDialog(this, "Image saved: " + output.getAbsolutePath());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
