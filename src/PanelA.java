import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class PanelA extends JPanel{
	
	JButton b;
	JLabel la1;
	
	public PanelA() {
				
		Calendar cal = Calendar.getInstance();
		
		setBackground(Color.BLACK);
		
		//검색날짜표시창
		la1 = new JLabel("원하는 날짜를 입력하세요"+"   ");
		la1.setFont(new Font("아리", Font.PLAIN, 30));
		la1.setHorizontalAlignment(SwingConstants.LEFT);
		la1.setForeground(Color.white);
		add(la1);
		
		//검색날짜 입력창 모음
		String str1[] = {"년 ", "월 ", "일 "};
		JTextField str2[] = new JTextField[3];
				
		for(int i=0; i<str1.length -1; i++) {
			
			JLabel la = new JLabel(str1[i]);
			la.setFont(new Font("아리", Font.PLAIN, 30));
			la.setVerticalAlignment(SwingConstants.TOP);
			la.setForeground(Color.white);
			JTextField tf = new JTextField(5);
			str2[i]=tf;
			
			add(str2[i]);
			add(la);
		}
		
		//확인하기 버튼
		b = new JButton("확인하기");
		add(b);
		//버튼에 리스너 부착
		b.addMouseListener(new MouseAdapter() {
						
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//원하는 날짜로 cal객체 설정하고
				int year=Integer.parseInt(str2[0].getText());
				cal.set(Calendar.YEAR, year);
				
				int month=Integer.parseInt(str2[1].getText());
				cal.set(Calendar.MONTH, month-1);
				
				/*int day=Integer.parseInt(str2[2].getText());
				cal.set(Calendar.DATE, day);*/
				
				//해당 월의 첫 시작 요일 가져오기
				int startDay = cal.get(Calendar.DAY_OF_WEEK)-2+7;
				//해당 월의 마지막 날짜 가져오기
				int lastDay = cal.getActualMaximum(Calendar.DATE);
				
				//검색날짜표시창에 입력한 날짜 세팅하기
				//날짜가 새로 뜨는 창에 안붙고 이전 창에 붙임
				la1.setText(year+"년 "+month+"월 달력     ");
				
				new ResultWinodw(startDay, lastDay);
				
			}
		});
		//리스너 부착
		str2[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				b.doClick();
				
			}
		});
	}
}











