import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
//////////////////////////////////////////////////////////////// class DragDemo
/** This is an application because it has a main method.
 It's also an applet because it extends JApplet.
 */
public class DragDemo extends JApplet {
    //============================================================= method main
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Drag Demo");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new DragBallPanel());
        window.pack();
        window.setVisible(true);
    }//end main

    //====================================================== applet constructor
    public DragDemo() {
        this.setContentPane(new DragBallPanel());
    }
}