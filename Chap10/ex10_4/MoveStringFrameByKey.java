package ex10_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveStringFrameByKey extends JFrame {
	private JLabel label = new JLabel("Love Java", SwingConstants.CENTER);

	public MoveStringFrameByKey() {
		setTitle("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 150);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		label.setFont(new Font("Gothic", Font.PLAIN, 20));
		c.add(label, BorderLayout.NORTH);

		c.setFocusable(true);
		c.requestFocus();

		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					String text = label.getText();
					if (text.length() > 1) {
						label.setText(text.substring(1) + text.charAt(0));
					}
				}
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new MoveStringFrameByKey();
	}
}
