package suvd2;
import javax.swing.*;
import java.awt.*;

public class gridlayout {
	private static void createIU(final JFrame frame) {
		JButton b1 = new JButton("btn1");
		JButton b2 = new JButton("btn2");
		JButton b3 = new JButton("btn3");
		JButton b4 = new JButton("btn4");
		JButton b5 = new JButton("btn5");
		JButton b6 = new JButton("btn6");
		
		JPanel panel = new JPanel();
		panel.setLayout (new GridLayout(3, 2)); // mur, baganii too
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		frame.add(panel);
	}
	
	private static void createFrame() {
		JFrame frame = new JFrame("GridLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		createIU(frame);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		createFrame();

	}

}
