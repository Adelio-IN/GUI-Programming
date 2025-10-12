package pro09_10;

import javax.swing.*;
import java.awt.*;

public class WestButtonsFrame extends JFrame {

	private Color[] color = { Color.RED, Color.LIGHT_GRAY, Color.BLUE, Color.YELLOW, Color.CYAN, Color.GRAY, Color.PINK,
			Color.GREEN, Color.ORANGE, Color.MAGENTA };

	public WestButtonsFrame() {
		super("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new WestPanel(), BorderLayout.WEST);
		c.add(new CenterPanel(), BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);
	}

	class WestPanel extends JPanel {
		public WestPanel() {
			setLayout(new GridLayout(color.length, 1));
			for (Color c : color) {
				JButton btn = new JButton();
				btn.setBackground(c);
				btn.setOpaque(true);
				btn.setBorderPainted(false);
				add(btn);
			}
		}
	}

	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(null);
			String[] num = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

			for (String text : num) {
				JLabel label = new JLabel(text);

				int x = 50 + (int) (Math.random() * 150);
				int y = 50 + (int) (Math.random() * 150);

				label.setLocation(x, y);
				label.setSize(20, 20);
				label.setForeground(Color.RED);
				add(label);
			}
		}
	}

	public static void main(String[] args) {
		new WestButtonsFrame();
	}
}
