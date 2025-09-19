package ex09_07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MultiplePanelEx extends JFrame {
	public MultiplePanelEx() {
		super("2024011862 이인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // 프레임으로부터 컨텐트팬 알아내기
		c.setLayout(new BorderLayout()); // 컨텐트팬의 배치 관리자 BorderLayout

		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.BLUE);
			setLayout(new FlowLayout()); // FlowLayout 배치 관리자 지정
			add(new JButton("Open"));
			add(new JButton("Read"));
			add(new JButton("Close"));
		}
	}

	class CenterPanel extends JPanel {
		private JLabel[] labels = { new JLabel("Hello"), new JLabel("Java"), new JLabel("Love"), new JLabel("이인") };

		public CenterPanel() {
			setLayout(null); // 배치 관리자 삭제, 절대 위치에 컴포넌트 삽입
			setBackground(Color.GREEN);
			for (int i = 0; i < labels.length; i++) {
				int x = (int) (Math.random() * 200); // 0 ~ 200 미만의 랜덤 정수
				int y = (int) (Math.random() * 200); // 0 ~ 200 미만의 랜덤 정수
				labels[i].setLocation(x, y);
				labels[i].setSize(100, 20);
				add(labels[i]); // JLabel을 CenterPanel에 부착
			}
		}
	}

	public static void main(String[] args) {
		new MultiplePanelEx();
	}
}
