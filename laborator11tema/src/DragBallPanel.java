import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener {

    private static final int BALL_DIAMETER = 40; // Diameter of ball
    private int _ballX = 50;   // x coord - set from drag
    private int _ballY = 50;   // y coord - set from drag
    private int _dragFromX = 0;    // pressed this far inside ball's
    private int _dragFromY = 0;    // bounding box.
    private boolean _canDrag = false;
    private boolean _autoMove = false;
    private Color _ballColor = Color.yellow;

    public DragBallPanel() {
        setPreferredSize(new Dimension(300, 300));
        setBackground(Color.blue);
        setForeground(_ballColor);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Display current coordinates in the top-left corner
        g.setColor(Color.white);
        g.drawString("Coordinates: (" + _ballX + ", " + _ballY + ")", 10, 20);

        // Draw the ball
        g.setColor(_ballColor);
        g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);
    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) &&
                y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
            _canDrag = true;
            _dragFromX = x - _ballX;
            _dragFromY = y - _ballY;
        } else {
            _canDrag = false;
        }
    }

    public void mouseDragged(MouseEvent e) {
        if (_canDrag) {
            _ballX = e.getX() - _dragFromX;
            _ballY = e.getY() - _dragFromY;

            // Ensure the ball stays within the panel
            _ballX = Math.max(_ballX, 0);
            _ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);
            _ballY = Math.max(_ballY, 0);
            _ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);

            this.repaint();
        }
    }

    public void mouseExited(MouseEvent e) {
        if (_autoMove) {
            _ballX = e.getX();
            _ballY = e.getY();
            _ballX = Math.max(_ballX, 0);
            _ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);
            _ballY = Math.max(_ballY, 0);
            _ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);
            this.repaint();
        }
        _canDrag = false;
    }

    public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            _autoMove = !_autoMove;
            if (_autoMove) {
                autoMove();
            }
        } else if (SwingUtilities.isRightMouseButton(e)) {
            setRandomColor();
            this.repaint();
        }
    }

    private void autoMove() {
        new Thread(() -> {
            while (_autoMove) {
                _ballX += 5;
                if (_ballX + BALL_DIAMETER >= getWidth() || _ballX <= 0) {
                    _ballX = Math.max(0, Math.min(getWidth() - BALL_DIAMETER, _ballX));
                }

                this.repaint();

                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }

    private void setRandomColor() {
        _ballColor = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    }

    public void mouseMoved(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
