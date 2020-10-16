import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class PanelA extends JPanel{
	
	public PanelA() {
				
		Calendar cal = Calendar.getInstance();
		
		setBackground(Color.BLACK);
		
		String str1[] = {"년 ", "월 ", "일 "};
		JTextField str2[] = new JTextField[3];
				
		for(int i=0; i<str1.length; i++) {
			
			JLabel la = new JLabel(str1[i]);
			la.setFont(new Font("아리", Font.PLAIN, 30));
			la.setVerticalAlignment(SwingConstants.TOP);
			la.setForeground(Color.white);
			JTextField tf = new JTextField(5);
			str2[i]=tf;
			
			add(str2[i]);
			add(la);
		}
		
		JButton b = new JButton("확인하기");
		add(b);
		
		b.addMouseListener(new MouseAdapter() {
						
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int year=Integer.parseInt(str2[0].getText());
				cal.set(Calendar.YEAR, year);
				
				int month=Integer.parseInt(str2[1].getText());
				cal.set(Calendar.MONTH, month-1);
				
				int day=Integer.parseInt(str2[2].getText());
				cal.set(Calendar.DATE, day);
				
				int startDay = cal.get(Calendar.DAY_OF_WEEK);
				//일요일이 1이 아니라 2가 나온다...왜그러지..일단 임시방편으로 -1함.
				int lastDay = cal.getActualMaximum(Calendar.DATE);
				
				//new PanelB(startDay, lastDay);
				new CalendarSearchEx(startDay, lastDay);
				
				/*System.out.println(startDay);
				System.out.println(lastDay);*/
			}
		});
	}
}