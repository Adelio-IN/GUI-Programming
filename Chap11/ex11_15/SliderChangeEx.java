package ex11_15;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderChangeEx extends JFrame {

	private JLabel valueLabel;

	public SliderChangeEx() {
		setTitle("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		valueLabel = new JLabel("100");
		valueLabel.setOpaque(true);
		valueLabel.setBackground(Color.GREEN);
		valueLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		valueLabel.setPreferredSize(new Dimension(30, 20));

		JSlider s = new JSlider(JSlider.HORIZONTAL, 100, 200, 100);
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setPaintTrack(true);
		s.setMajorTickSpacing(20);

		s.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int val = s.getValue();
				valueLabel.setText(Integer.toString(val));
			}
		});

		c.add(s);
		c.add(valueLabel);

		setSize(330, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SliderChangeEx();
	}
}
