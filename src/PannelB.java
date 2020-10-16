import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class PanelB extends JPanel{
	
	int startDay;
	int lastDay;
	
	public PanelB(int startDay, int lastDay) {
		this.startDay=startDay;
		this.lastDay=lastDay;
			
		setLayout(new GridLayout(6,7,5,4));
		setBackground(Color.LIGHT_GRAY);
		
		String str[] = {"일","월","화","수","목","금","토"};
		
		for(int i=0; i< 7; i++) {
			
			JLabel la = new JLabel(str[i]);
			la.setFont(new Font("아리", Font.ROMAN_BASELINE, 20));
			la.setHorizontalAlignment(SwingConstants.LEFT);
			la.setVerticalAlignment(SwingConstants.TOP);
			la.setBackground(Color.DARK_GRAY);
			la.setForeground(Color.white);
			la.setOpaque(true);
			add(la);
		}
		
		for(int i=1; i < startDay; i++) {
			JLabel la = new JLabel();
			add(la);
		}
		
		for(int i = 1; i < lastDay+1; i++) {
			
			JLabel la = new JLabel(Integer.toString(i));
			la.setFont(new Font("아리", Font.ROMAN_BASELINE, 20));
			la.setVerticalAlignment(SwingConstants.TOP);
			la.setBackground(Color.white);
			la.setOpaque(true);
			add(la);
		}
		
		/*System.out.println(startDay);
		System.out.println(lastDay);*/
	}
	
}
