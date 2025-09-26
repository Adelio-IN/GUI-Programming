package pro09_06;

import java.math.*;
import javax.swing.*;
import java.awt.*;

public class RandomLabelFrame extends JFrame {
	public RandomLabelFrame() {
		setTitle("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		for (int i = 1; i < 20; i++) {
			JLabel label = new JLabel();
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			label.setOpaque(true);
			label.setBackground(new Color(r, g, b));

			int x = (int) (Math.random() * 240) + 10;
			int y = (int) (Math.random() * 240) + 10;

			label.setLocation(x, y);
			label.setSize(10, 10);
			c.add(label);
		}

		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new RandomLabelFrame();
	}
}
