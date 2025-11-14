package pro11_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoneyChangerFrame extends JFrame {
	private int[] won = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

	private String[] wonLabels = { "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };

	private JTextField inputField;
	private JTextField[] countFields;
	private JButton calcButton;

	public MoneyChangerFrame() {

		setTitle("2024011862 이인");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(new JLabel("금액"));

		inputField = new JTextField(10);
		calcButton = new JButton("계산");

		topPanel.add(inputField);
		topPanel.add(calcButton);
		c.add(topPanel, BorderLayout.NORTH);

		topPanel.setBackground(Color.YELLOW);

		JPanel centerPanel = new JPanel(new GridLayout(8, 2, 10, 5));
		centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));
		centerPanel.setBackground(Color.YELLOW);

		countFields = new JTextField[8];

		for (int i = 0; i < won.length; i++) {
			centerPanel.add(new JLabel(wonLabels[i]));

			countFields[i] = new JTextField(10);
			countFields[i].setEditable(false);
			countFields[i].setHorizontalAlignment(JTextField.CENTER);
			centerPanel.add(countFields[i]);
		}
		c.add(centerPanel, BorderLayout.CENTER);

		calcButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});

		setVisible(true);
	}

	private void calculate() {
		String inputText = inputField.getText();
		int money;

		try {
			money = Integer.parseInt(inputText);
		} catch (NumberFormatException ex) {
			inputField.setText("숫자만 입력하세요");
			for (JTextField field : countFields) {
				field.setText("0");
			}
			return;
		}

		int remain_Money = money;

		for (int i = 0; i < won.length; i++) {

			int count = remain_Money / won[i];

			countFields[i].setText(String.valueOf(count));

			remain_Money = remain_Money % won[i];
		}
	}

	public static void main(String[] args) {
		new MoneyChangerFrame();
	}
}