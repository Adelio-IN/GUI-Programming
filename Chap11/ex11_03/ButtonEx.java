package ex11_03;

import java.awt.*;
import javax.swing.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normallcon = new ImageIcon(
				"C:\\Users\\SAMSUNG Galaxy\\Desktop\\GUI-Programming-main\\Chap11\\images\\normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon(
				"C:\\Users\\SAMSUNG Galaxy\\Desktop\\GUI-Programming-main\\Chap11\\images\\rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon(
				"C:\\Users\\SAMSUNG Galaxy\\Desktop\\GUI-Programming-main\\Chap11\\images\\pressedIcon.gif");

		JButton btn = new JButton("call~~", normallcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);

		c.add(btn);
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}

}
