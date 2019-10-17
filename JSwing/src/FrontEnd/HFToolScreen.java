package FrontEnd;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HFToolScreen extends JFrame implements ActionListener {
	JButton back;
	public HFToolScreen() {
		this.setTitle("HF CREATOR");
		back = new JButton("BACK");add(back);
		back.addActionListener(this);
		
		
		
		
		setVisible(true);
		setSize(600, 750);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent button) {
		// TODO Auto-generated method stub
		if (button.getSource()== back ) {
			new MainScreenFrame("AMDOCS TOOL");
			this.dispose();
		}
	}
}
