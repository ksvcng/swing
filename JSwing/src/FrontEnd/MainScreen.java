package FrontEnd;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainScreen {
	public static void main(String args[]) {
		MainScreenFrame msf = new MainScreenFrame("AMDOCS TOOLS");
		
	}
}

class MainScreenFrame extends JFrame implements ActionListener{
	JButton forCalc ;
	JButton forHF ;
	MainScreenFrame(String header){
	forCalc = new JButton("CALCULATOR");
	forHF = new JButton("HF CREATOR");
	add(forCalc);
	add(forHF);
	forCalc.addActionListener(this);
	forHF.addActionListener(this);
		this.setTitle(header);
		setVisible(true);
		setSize(600, 750);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent type) {
		// TODO Auto-generated method stub
		if(type.getSource()== forCalc ) {
			new CalculatorScreen();
			this.dispose();
		}
		else if (type.getSource()== forHF ) {
			new HFToolScreen();
			this.dispose();
		}
	}
}