package pro09_03;

import java.awt.*;
import javax.swing.*;

public class TenButtonGridLayoutFrame extends JFrame {
	private Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
			Color.GRAY, Color.PINK, Color.LIGHT_GRAY };

	public TenButtonGridLayoutFrame() {
		super("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));

		JButton[] btn = new JButton[10];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		setSize(500, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TenButtonGridLayoutFrame();
	}
}
