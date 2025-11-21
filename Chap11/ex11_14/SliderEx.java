package ex11_14;

import java.awt.*;
import javax.swing.*;

public class SliderEx extends JFrame {

	public SliderEx() {
		setTitle("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setPaintTrack(true);
		s.setMajorTickSpacing(50);
		s.setMinorTickSpacing(10);

		c.add(s);

		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SliderEx();
	}

}
