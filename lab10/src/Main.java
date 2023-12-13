import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
            JFrame frame = new JFrame ("Simple Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 120);

           // JPanel wrapperPanel = new JPanel();
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();

            JLabel l = new JLabel ("Username ");

            JTextField tf = new JTextField("");
            tf.setColumns(20);
            panel1.add(l);
            panel1.add(tf);
            panel1.setLayout(new FlowLayout());

            JLabel l2 = new JLabel ("Password ");
            JTextField tf2= new JTextField("");
            tf2.setColumns(20);
            panel2.add(l2);
            panel2.add(tf2);

            JPanel p = new JPanel();
            p.add(panel1);
            p.add(panel2);
            p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

            JCheckBox c = new JCheckBox("Terms & Conditions");
            p.add(c);



            JButton b = new JButton("Log in");
            b.addActionListener(new LoginListener());
            p.add(b);
            JLabel verif = new JLabel("Not logged in");
            p.add(verif);
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    verif.setText("Successfully logged in");
                }
            });

            frame.setContentPane(p);
            frame.setVisible(true);

        }
}