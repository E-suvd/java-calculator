package suvd2;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;


public class borderlayout {
	private static void createIU(final JFrame frame) {
		JButton b1 = new JButton("btn1");
		JButton b2 = new JButton("btn2");
		JButton b3 = new JButton("btn3");
		JButton b4 = new JButton("btn4");
		JButton b5 = new JButton("btn5");
		JButton b6 = new JButton("btn6");
		JButton b7 = new JButton("btn7");
		JButton b8 = new JButton("btn8");
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new FlowLayout());
		centerPanel.add(b6);
		centerPanel.add(b7);
		centerPanel.add(b8);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(centerPanel, BorderLayout.NORTH);
		panel.add(b2, BorderLayout.WEST);
		panel.add(b3, BorderLayout.EAST);
		panel.add(b4, BorderLayout.SOUTH);
		panel.add(b5, BorderLayout.CENTER);
		frame.add(panel);
	}
	
	private static void createFrame() {
		JFrame frame = new JFrame("BorderLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		createIU(frame);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		createFrame();
	}

}
