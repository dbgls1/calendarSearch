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
	
	//처음 시작화면을 현재 달력으로 표시하려면??
		
	static int startDay;
	static int lastDay=31;
	
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
			
			ImageIcon img = new ImageIcon("img/night.jpg");
			Image im = img.getImage();
			JLabel la = new JLabel(img);
			la.setSize(img.getIconWidth(), img.getIconHeight());
			add(la);
			
		}
		
	}
}




