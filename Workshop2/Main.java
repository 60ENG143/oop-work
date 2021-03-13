import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Main {
	public static void main(String[] args){
		MyFrame frame = new MyFrame("My App");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class MyFrame extends JFrame {
    private static final String[] FACES = new String[]{"+1", "+2", "+3"};
	private JLabel label;
	private Counter counter;
	private JButton btn;

	public MyFrame(String title){
		super(title);

        JPanel facesPanel = new JPanel();
		GridLayout layout = new GridLayout(0, 3);

		facesPanel.setLayout(layout);
		
		for(String face : FACES){
            	btn = new JButton(face);
            	btn.addActionListener(new MyActionListener());
				facesPanel.add(btn);
        }

		this.getContentPane().setLayout(new BorderLayout());

        this.add(facesPanel, BorderLayout.PAGE_END);

		counter = new Counter(1);

		label = new JLabel("" + counter.getValue());
		label.setFont(label.getFont().deriveFont(32.0f));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
		
		this.add(label, BorderLayout.CENTER);

        JButton btn_reset = new JButton("Reset");
		btn_reset.addActionListener(new MyActionReset());
		this.add(btn_reset, BorderLayout.PAGE_START);
    }

	class MyActionReset implements ActionListener{		
        public void actionPerformed(ActionEvent e) { 
            counter.reset();
            label.setText("" + counter.getValue());
        }
    }

    class MyActionListener implements ActionListener{		
        public void actionPerformed(ActionEvent e) {
			counter.count(1);
            label.setText("" + counter.getValue());
        }
    }
}