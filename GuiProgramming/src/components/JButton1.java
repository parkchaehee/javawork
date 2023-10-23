package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton1{

	public static void main(String[] args) {
		// 프레임 - 윈도우 전체
		JFrame frame = new JFrame("레이아웃 예제");
		frame.setSize(300, 200);
		frame.setLocation(200, 100); //위치
		
		// 버튼 - SOUTH, NORTH - 프레임의 가로크기와 일치
		JButton button1 = new JButton("북");
		JButton button2 = new JButton("남");
		JButton button3 = new JButton("동");
		JButton button4 = new JButton("서");
		JButton button5 = new JButton("중앙");
		
		frame.add(button1, BorderLayout.NORTH);
		frame.add(button2, BorderLayout.SOUTH);
		frame.add(button3, BorderLayout.EAST);
		frame.add(button4, BorderLayout.WEST);
		frame.add(button5, BorderLayout.CENTER);
		
		//윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우 디스플레이
		frame.setVisible(true);
		
	}
}
