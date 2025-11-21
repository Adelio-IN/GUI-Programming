package pro11_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldAndComboBoxFrame extends JFrame {

	private JTextField textField;
	private JComboBox<String> comboBox;

	public TextFieldAndComboBoxFrame() {
		setTitle("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		textField = new JTextField(10);
		comboBox = new JComboBox<>();

		textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().trim();
				if (!text.isEmpty()) {
					comboBox.addItem(text);
					textField.setText("");
				}
			}
		});
		c.add(textField);
		c.add(comboBox);

		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldAndComboBoxFrame();
	}
}
