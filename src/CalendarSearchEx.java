import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//년,월,일을 입력하면 해당 월 달력을 보여주는 프로그램
//https://hyeonstorage.tistory.com/205  ,참조
public class CalendarSearchEx extends JFrame{
	
	
	static int startDay=3;
	static int lastDay=31;
	
	public CalendarSearchEx(int startDay, int lastDay) {
		
		this.startDay=startDay;
		this.lastDay=lastDay;
		
		setTitle("원하는 날짜를 입력하세요>>>");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		//입력창
		c.add(new PanelA(), BorderLayout.NORTH);
		
		//달력표시창
		c.add(new PanelB(startDay, lastDay), BorderLayout.CENTER);
		
		/*System.out.println(startDay);
		System.out.println(lastDay);*/
		
		setSize(900, 600);
		setVisible(true);
		//repaint();
		
	}

	public static void main(String[] args) {

		new CalendarSearchEx(startDay, lastDay);
		
	}
}




