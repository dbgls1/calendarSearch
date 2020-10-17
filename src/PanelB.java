import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class PanelB extends JPanel{
	
	static int startDay;
	static int lastDay;
	
	public PanelB(int startDay, int lastDay) {
		this.startDay=startDay;
		this.lastDay=lastDay;
		
		setLayout(new GridLayout(0,7,50,40));
		setBackground(new Color(0,0,0,30));//투명도 설정
		
		String str[] = {"일","월","화","수","목","금","토"};
		
		for(int i=0; i< 7; i++) {
			
			JLabel la = new JLabel(str[i]);
			la.setFont(new Font("아리", Font.ROMAN_BASELINE, 40));
			la.setHorizontalAlignment(SwingConstants.CENTER);
			la.setVerticalAlignment(SwingConstants.CENTER);
			la.setBackground(new Color(0,0,0,30));//투명도 설정
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
			la.setFont(new Font("아리", Font.ROMAN_BASELINE, 30));
			la.setHorizontalAlignment(SwingConstants.CENTER);
			la.setVerticalAlignment(SwingConstants.CENTER);
			la.setBackground(new Color(0,0,0,30));//투명도 설정
			la.setForeground(Color.white);
			la.setOpaque(true);
			add(la);
		}
	}
}
