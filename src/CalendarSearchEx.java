import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//년,월,일을 입력하면 해당 월 달력을 보여주는 프로그램
//https://hyeonstorage.tistory.com/205  ,참조
public class CalendarSearchEx extends JFrame{
	
	static int startDay;
	static int lastDay;
	
	public CalendarSearchEx(int startDay, int lastDay) {
		
		this.startDay=startDay;
		this.lastDay=lastDay;
		
		setTitle("전체화면으로 확인하세요>>>");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		//입력창
		c.add(new PanelA(), BorderLayout.NORTH);
		
		//달력표시창
		c.add(new PanelC(), BorderLayout.CENTER);
		
		setSize(1200, 900);
		setLocation(100, 100);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new CalendarSearchEx(startDay, lastDay);
		
	}
	
	public class PanelC extends JPanel{
		
		public PanelC() {
					
			setBackground(Color.black);
			setLayout(null);
			
			for(int i=0;i<2000;i++) {
				
				int x= (int)(Math.random()*1920);
				int y =(int)(Math.random()*1080);
				
				JLabel la=new JLabel("*");
				la.setBackground(Color.BLACK);
				la.setOpaque(true);
				la.setSize(5, 5);
				la.setLocation(x, y);
				add(la);
				//쓰레드
				flicker f = new flicker(la);
				f.start();				
								
				JLabel la2=new JLabel(".");
				la2.setBackground(Color.BLACK);
				la2.setOpaque(true);
				la2.setSize(5, 5);
				la2.setLocation(x, y);
				add(la2);
				flicker f2 = new flicker(la2);
				f2.start();
				
				JLabel la3=new JLabel("+");
				la3.setBackground(Color.BLACK);
				la3.setOpaque(true);
				la3.setSize(5, 5);
				la3.setLocation(x, y);
				add(la3);
				flicker f3 = new flicker(la3);
				f3.start();
			}
		}
	}
	
	class flicker extends Thread{
		
		JLabel la;
		
		public flicker(JLabel la) {
			this.la=la;
		}
		
		@Override
		public void run() {
			
			int n=0;
			while(true) {
				
				if(n==0) {
					la.setForeground(Color.white);
					n++;
				}else {
					la.setForeground(Color.black);
					n--;
				}
								
				try {
					Thread.sleep(1200);
				} catch (Exception e) {
					return;
				}
				
			}
			
		}
		
	}
}




