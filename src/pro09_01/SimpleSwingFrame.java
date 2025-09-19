package pro09_01;

import java.awt.*;
import javax.swing.*;

public class SimpleSwingFrame extends JFrame {
	public SimpleSwingFrame() {
		super("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane(); // 프레임으로부터 컨텐트팬 알아내기
		c.setLayout(new BorderLayout());
		setVisible(true);
		setSize(400, 200);

		c.setLayout(new BorderLayout(5, 7));
		c.setBackground(Color.YELLOW);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
	}

	public static void main(String[] args) {
		new SimpleSwingFrame();
	}
}
