import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private JLabel label;
    private int result;

    public Main(){
        result = 0;
        JPanel panel = new JPanel();
        JButton btn;
        
        this.getContentPane().setLayout(new BorderLayout());
		this.add(panel);

        label = new JLabel();
        label.setFont(label.getFont().deriveFont(18.0f));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        this.add(label, BorderLayout.CENTER);

        btn = new JButton("Start");
        btn.addActionListener(new MyActionListener());
        this.add(btn, BorderLayout.PAGE_END);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 250);
		this.setVisible(true);
    }

    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            for(int i=0; i<=500; i++){
                result += i;
                label.setText("" + result);
            }
        }
    }

    public static void main(String[] args){
        new Main();
    }
}