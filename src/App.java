
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Window;
/**
 * Created by zhangxiao
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Created by zhangxiao
 */

public class App {
	public static JButton easy;
	public static JButton medium;
	public static JButton hard;
	public App() {
		JFrame select=new JFrame("选择难易度");
		easy=new JButton("容易");
		medium=new JButton("中等");	
		hard=new JButton("困难");
		//屏幕的中间
		select.setLocationRelativeTo(null);
		
		select.setLayout( new GridLayout(3,1));
		select.setLocation(400,150);
		select.setSize(400,400);
		select.add(easy);
		select.add(medium);
		select.add(hard);
		select.setVisible(true);
		select.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]) {
		
		App a=new App();
		easy.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				new UI(1);
			}
		});
		
		medium.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new UI(2);
			}
		});
		
		hard.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new UI(3);
			}
		});
        System.out.println("游戏开始");
    }
}
