package ex10_07;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();

	public KeyCodeEx() {
		setTitle("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.addKeyListener(new MyKeyListener());
		c.add(la);

		setSize(300, 150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container) e.getSource();
			la.setText(e.getKeyText(e.getKeyCode()));

			for (int i = KeyEvent.VK_F1; i <= KeyEvent.VK_F12; i++) {
				if (e.getKeyCode() == i) {
					switch (i) {
					case KeyEvent.VK_F1:
						contentPane.setBackground(Color.GREEN);
						break;
					case KeyEvent.VK_F2:
						contentPane.setBackground(Color.ORANGE);
						break;
					case KeyEvent.VK_F3:
						contentPane.setBackground(Color.YELLOW);
						break;
					case KeyEvent.VK_F4:
						contentPane.setBackground(Color.RED);
						break;
					case KeyEvent.VK_F5:
						contentPane.setBackground(Color.CYAN);
						break;
					case KeyEvent.VK_F6:
						contentPane.setBackground(Color.BLUE);
						break;
					case KeyEvent.VK_F7:
						contentPane.setBackground(Color.MAGENTA);
						break;
					case KeyEvent.VK_F8:
						contentPane.setBackground(Color.PINK);
						break;
					case KeyEvent.VK_F9:
						contentPane.setBackground(Color.LIGHT_GRAY);
						break;
					case KeyEvent.VK_F10:
						contentPane.setBackground(Color.GRAY);
						break;
					case KeyEvent.VK_F11:
						contentPane.setBackground(Color.DARK_GRAY);
						break;
					case KeyEvent.VK_F12:
						contentPane.setBackground(Color.WHITE);
						break;
					}
					return;
				}
				if (e.getKeyChar() == '%') {
					contentPane.setBackground(Color.YELLOW);
				}
			}
		}
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}
}
