package FrontEnd;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import BackEnd.Calculator;
public class CalculatorScreen extends JFrame implements ActionListener {
	JTextField arg1;
	JTextField arg2;
	JTextField resp;
	JLabel result;
	JButton add;
	JButton sub;
	JButton multiply;
	JButton divide;
	JButton back ;
	public CalculatorScreen() {
		this.setTitle("CALCULATOR");
		arg1 = new JTextField(25);arg1.setBounds(100, 100, 150, 50);add(arg1);
	    arg2 = new JTextField(25);arg2.setBounds(350, 100, 150, 50);add(arg2);
	    resp = new JTextField(25);resp.setBounds(350, 160, 150, 50);add(resp);
		result = new JLabel();result.setBounds(275, 100, 250, 50);add(result);
		add = new JButton("ADD");add.setBounds(50, 250, 90, 40);add(add);
		sub = new JButton("SUB");sub.setBounds(160, 250, 90, 40);add(sub);
		multiply = new JButton("MULTIPLY");multiply.setBounds(270, 250, 90, 40);add(multiply);
		divide = new JButton("DIVIDE");divide.setBounds(380, 250, 90, 40);add(divide);
		back = new JButton("BACK");back.setBounds(100, 320, 90, 40);add(back);
		add.addActionListener(this);
		sub.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		back.addActionListener(this);
		setVisible(true);
		setSize(600, 750);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent operationType) {
		// TODO Auto-generated method stub
		String ans="",operation = "" ;
		if(operationType.getSource()== add ) {
			ans = Calculator.add(arg1.getText(), arg2.getText());
			operation="+";
		}
		else if (operationType.getSource()== sub ) {
			ans = Calculator.sub(arg1.getText(), arg2.getText());
			operation="-";
		}
		else if (operationType.getSource()== multiply ) {
			ans = Calculator.multiply(arg1.getText(), arg2.getText());
			operation="*";
		}
		else if (operationType.getSource()== divide ) {
			ans = Calculator.divide(arg1.getText(), arg2.getText());
			operation="/";
		}
		else if (operationType.getSource()== back ) {
			
			new MainScreenFrame("AMDOCS TOOL");
			this.dispose();
			
		}
		result.setText(operation); 
		resp.setText(ans);
	}
}
