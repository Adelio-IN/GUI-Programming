package ex09_02;
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); // FlowLayout은 왼쪽부터 순차적으로 넣으라는 의미임.
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150); // 프레임 크기 설정
		setVisible(true); // 화면에 프레임 출력
		
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
