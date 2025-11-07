package pro11_1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxPracticeFrame extends JFrame {
	private JCheckBox[] selects = new JCheckBox[2];
	private String[] names = { "버튼 비활성화", "버튼 감추기" };
	private JLabel sumLabel;
	private JButton b1;

	public CheckBoxPracticeFrame() {
		setTitle("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		b1 = new JButton("test button");
		c.setLayout(new FlowLayout());
		c.add(new JLabel(""));

		ImageIcon cherryIcon = new ImageIcon(
				"C:\\Users\\SAMSUNG Galaxy\\Desktop\\Gui_Programming\\Chap11\\images\\cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon(
				"C:\\Users\\SAMSUNG Galaxy\\Desktop\\Gui_Programming\\Chap11\\images\\selectedCherry.jpg");

		MyItemListener listener = new MyItemListener();
		for (int i = 0; i < selects.length; i++) {
			selects[i] = new JCheckBox(names[i]);
			selects[i].setBorderPainted(true);
			c.add(selects[i]);
			selects[i].addItemListener(listener);
		}
		c.add(b1);
		setSize(250, 200);
		setVisible(true);
		JCheckBox cherry = new JCheckBox(cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		c.add(cherry);

	}

	class MyItemListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getItem() == selects[0]) {
					b1.setEnabled(false);
				} else if (e.getItem() == selects[1]) {
					b1.setVisible(false);
				}
			} else {
				if (e.getItem() == selects[0]) {
					b1.setEnabled(true);
				} else if (e.getItem() == selects[1]) {
					b1.setVisible(true);
				}
			}
		}
	}

	public static void main(String[] args) {
		new CheckBoxPracticeFrame();
	}
}
