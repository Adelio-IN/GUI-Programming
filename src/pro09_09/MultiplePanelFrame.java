package pro09_09;

import javax.swing.*;
import java.awt.*;

public class MultiplePanelFrame extends JFrame {
	public MultiplePanelFrame() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);

		for (int i = 1; i < 15; i++) {
			JLabel label = new JLabel("*");
			label.setForeground(Color.RED);

			int x = (int) (Math.random() * 240) + 10;
			int y = (int) (Math.random() * 240) + 10;

			label.setSize(10, 10);
			label.setLocation(x, y);
			c.add(label);
		}

		setSize(300, 300);
		setVisible(true);
	}

	class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
			setLayout(new FlowLayout());
			add(new JLabel("별 개수"));
			add(new TextField(10));
			add(new JButton("별 만들기"));
		}
	}

	class CenterPanel extends JPanel {
		public CenterPanel() {
			add(new JButton("Refresh"));
		}
	}

	class SouthPanel extends JPanel {
		public SouthPanel() {
			setBackground(Color.YELLOW);
			setLayout(new FlowLayout());
			add(new JLabel());
			add(new JButton("Exit"), BorderLayout.CENTER);
		}
	}

	public static void main(String[] args) {
		new MultiplePanelFrame();
	}
}
