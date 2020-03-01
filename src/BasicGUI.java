import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BorderFactory;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

/**
 * Basic GUI in Java
 * Program keeps track of how many times the button has been clicked.
 */

public class BasicGUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public BasicGUI() {

        frame = new JFrame();

        JButton button = new JButton("Click here");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 25));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Basic GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new BasicGUI();
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        count ++;
        label.setText("Number of clicks: " + count);
    }
}
