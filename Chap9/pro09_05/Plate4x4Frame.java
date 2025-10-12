package pro09_05;

import java.awt.*;
import javax.swing.*;

public class Plate4x4Frame extends JFrame {
	private Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
			Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK, Color.BLACK, Color.ORANGE, Color.BLUE,
			Color.MAGENTA };

	public Plate4x4Frame() {
		super("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JPanel gridPanel = new JPanel(new GridLayout(4, 4));
		Container c = getContentPane();

		JLabel[] label = new JLabel[16];
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel(Integer.toString(i), SwingConstants.CENTER);
			label[i].setOpaque(true);
			label[i].setBackground(color[i]);
			gridPanel.add(label[i]);
		}

		JPanel panel = new JPanel();
		JButton checkBox = new JButton("색상 확인");
		JTextField textField = new JTextField(10);

		panel.add(checkBox);
		panel.add(textField);

		add(gridPanel, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);

		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Plate4x4Frame();
	}
}
