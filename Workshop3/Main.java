import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private JLabel label;

    public Main(){

        JPanel panel = new JPanel();
        JButton btn;
        
        this.getContentPane().setLayout(new BorderLayout());
		this.add(panel);

        label = new JLabel("Text");
        label.setFont(label.getFont().deriveFont(18.0f));
        this.add(label, BorderLayout.PAGE_START);

        btn = new JButton("Start");
        this.add(btn, BorderLayout.PAGE_END);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 250);
		this.setVisible(true);
    }

    public static void main(String[] args){
        new Main();
    }
}