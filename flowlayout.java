package suvd2;
import javax.swing.*;
import java.awt.FlowLayout;

public class flowlayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		
		JButton b1 = new JButton("btn1");
		JButton b2 = new JButton("btn2");
		JButton b3 = new JButton("btn3");
		JButton b4 = new JButton("btn4");
		JButton b5 = new JButton("btn5");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		
		frame.add(panel);
		frame.pack();
		
		frame.setVisible(true);

	}

}
