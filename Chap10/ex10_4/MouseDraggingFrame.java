package ex10_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseDraggingFrame extends JFrame {
	JPanel contentPane = new JPanel();

	MouseDraggingFrame() {
		this.setTitle("2024011862 이인");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(contentPane);
		contentPane.setBackground(Color.GREEN);

		JButton btn = new JButton("종료");
		contentPane.add(btn);
		btn.addActionListener(new MyActionListener());

		contentPane.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				contentPane.setBackground(Color.YELLOW);
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				contentPane.setBackground(Color.GREEN);
			}
		});

		this.setSize(250, 150);
		this.setVisible(true);
	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new MouseDraggingFrame();
	}
}