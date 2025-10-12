package pro09_07;

import javax.swing.*;
import java.awt.*;

public class SwingCalculator extends JFrame {
	public SwingCalculator() {
		super("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5, 5));

		Container c = getContentPane();
		GridLayout grid = new GridLayout();
		grid.setVgap(5);

		c.add(new North(), BorderLayout.NORTH);
		c.add(new South(), BorderLayout.SOUTH);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5, 4, 5, 5));

		String[] buttons = { "c", "UN", "BK", "/", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "0", ".",
				"=", "%" };

		for (String text : buttons) {
			JButton button = new JButton(text);
			if (text.equals("=")) {
				button.setBackground(Color.CYAN);
				button.setOpaque(true);
			}
			p.add(button);
		}
		add(p, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	class North extends JPanel {
		public North() {
			setBackground(Color.LIGHT_GRAY);
			setLayout(new FlowLayout());
			add(new JLabel("수식"));
			add(new TextField(20));
		}
	}

	class South extends JPanel {
		public South() {
			setBackground(Color.YELLOW);
			setLayout(new FlowLayout());
			add(new JLabel("계산 결과"));
			add(new TextField(20));
		}
	}

	public static void main(String[] args) {
		new SwingCalculator();
	}
}
