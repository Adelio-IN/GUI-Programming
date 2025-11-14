package ex11_06;

import java.awt.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("라디오 버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon cherryIcon = new ImageIcon(
				"C:\\Users\\SAMSUNG Galaxy\\Desktop\\Gui_Programming\\Chap11\\images\\cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon(
				"C:\\Users\\SAMSUNG Galaxy\\Desktop\\Gui_Programming\\Chap11\\images\\selectedCherry.jpg");

		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);

		g.add(apple);
		g.add(pear);
		g.add(cherry);

		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
