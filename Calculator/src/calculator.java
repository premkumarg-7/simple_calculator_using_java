import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculator implements ActionListener {
	
	JLabel displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton dotbutton;
	JButton equalbutton;
	JButton dividebutton;
	JButton multiplybutton;
	JButton addbutton;
	JButton zerobutton;
	JButton subbutton;
	JButton clearbutton;
	JButton backbutton;
	
	boolean isOperatorClicked=false;
	String oldValue;
	char Calc;
	
	public calculator() {
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(305,480);
		jf.setLocation(350,100);
		jf.getContentPane().setLayout(null);
		jf.getContentPane().setBackground(Color.BLACK);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		displaylabel =new JLabel();
		displaylabel.setBounds(10, 60, 270, 40);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setBackground(Color.WHITE);
		displaylabel.setForeground(Color.BLACK);
		displaylabel.setFont(new Font("Arial",Font.BOLD,20));
		displaylabel.setOpaque(true);
		jf.add(displaylabel);
		
		sevenbutton = new JButton("7");
		sevenbutton.setBounds(10, 190, 60, 40);
		sevenbutton.addActionListener(this);
		jf.add(sevenbutton);
		
		eightbutton = new JButton("8");
		eightbutton.setBounds(80, 190, 60, 40);
		eightbutton.addActionListener(this);
		jf.add(eightbutton);
		
		ninebutton = new JButton("9");
		ninebutton.setBounds(150, 190, 60, 40);
		ninebutton.addActionListener(this);
		jf.add(ninebutton);
		
		fourbutton = new JButton("4");
		fourbutton.setBounds(10, 250, 60, 40);
		fourbutton.addActionListener(this);
		jf.add(fourbutton);
		
		fivebutton = new JButton("5");
		fivebutton.setBounds(80, 250, 60, 40);
		fivebutton.addActionListener(this);
		jf.add(fivebutton);
		
		sixbutton = new JButton("6");
		sixbutton.setBounds(150, 250, 60, 40);
		sixbutton.addActionListener(this);
		jf.add(sixbutton);
		
		onebutton = new JButton("1");
		onebutton.setBounds(10, 310, 60, 40);
		onebutton.addActionListener(this);
		jf.add(onebutton);
		
		twobutton = new JButton("2");
		twobutton.setBounds(80, 310, 60, 40);
		twobutton.addActionListener(this);
		jf.add(twobutton);
		
		threebutton = new JButton("3");
		threebutton.setBounds(150, 310, 60, 40);
		threebutton.addActionListener(this);
		jf.add(threebutton);
		
		dotbutton = new JButton(".");
		dotbutton.setBounds(10,370, 60, 40);
		dotbutton.addActionListener(this);
		jf.add(dotbutton);
		
		zerobutton = new JButton("0");
		zerobutton.setBounds(80,370, 60, 40);
		zerobutton.addActionListener(this);
		jf.add(zerobutton);
		
		equalbutton = new JButton("=");
		equalbutton.setBounds(150, 370, 130, 40);
		equalbutton.addActionListener(this);
		jf.add(equalbutton);
		
		dividebutton = new JButton("%");
		dividebutton.setBounds(220, 130, 60, 40);
		dividebutton.addActionListener(this);
		dividebutton.setBackground(Color.ORANGE);
		jf.add(dividebutton);
		
		multiplybutton = new JButton("X");
		multiplybutton.setBounds(220, 190, 60, 40);
		multiplybutton.addActionListener(this);
		multiplybutton.setBackground(Color.ORANGE);
		jf.add(multiplybutton);
		
		subbutton = new JButton("-");
		subbutton.setBounds(220, 250, 60, 40);
		subbutton.addActionListener(this);
		subbutton.setBackground(Color.ORANGE);
		jf.add(subbutton);
		
		addbutton = new JButton("+");
		addbutton.setBounds(220, 310, 60, 40);
		addbutton.addActionListener(this);
		addbutton.setBackground(Color.ORANGE);
		jf.add(addbutton);
		
		clearbutton = new JButton("C");
		clearbutton.setBounds(80, 130, 60, 40);
		clearbutton.setBackground(Color.RED);
		clearbutton.addActionListener(this);
		jf.add(clearbutton);
		
		backbutton = new JButton("DEL");
		backbutton.setBounds(150, 130, 60, 40);
		backbutton.addActionListener(this);
		backbutton.setBackground(Color.RED);
		jf.add(backbutton);
		
	}
	public static void main(String[] args) {
		new calculator();
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenbutton) {
			if(isOperatorClicked) {
				displaylabel.setText("7");
				isOperatorClicked=false;
				}else {
					displaylabel.setText(displaylabel.getText()+"7");
				}
			
		}else if(e.getSource()==eightbutton) {
			if(isOperatorClicked) {
				displaylabel.setText("8");
				isOperatorClicked=false;
				}else {
			displaylabel.setText(displaylabel.getText()+"8");
				}
			
	}else if(e.getSource()==ninebutton){
		if(isOperatorClicked) {
			displaylabel.setText("9");
			isOperatorClicked=false;
			}else {
		displaylabel.setText(displaylabel.getText()+ "9");
			}
		
	}else if(e.getSource()==fourbutton) {
		if(isOperatorClicked) {
			displaylabel.setText("4");
			isOperatorClicked=false;
			}else {
		displaylabel.setText(displaylabel.getText()+"4");
			}
		
	}else if(e.getSource()==fivebutton) {
		if(isOperatorClicked) {
			displaylabel.setText("5");
			isOperatorClicked=false;
			}else {
		displaylabel.setText(displaylabel.getText()+"5");
			}
		
	}else if(e.getSource()==sixbutton) {
		if(isOperatorClicked) {
			displaylabel.setText("6");
			isOperatorClicked=false;
			}else {
		displaylabel.setText(displaylabel.getText()+"6");
			}
		
	}else if(e.getSource()==onebutton) {
		if(isOperatorClicked) {
			displaylabel.setText("1");
			isOperatorClicked=false;
			}else {
		displaylabel.setText(displaylabel.getText()+"1");
			}
	}else if(e.getSource()==twobutton) {
		if(isOperatorClicked) {
			displaylabel.setText("2");
			isOperatorClicked=false;
			}else {
		displaylabel.setText(displaylabel.getText()+"2");
			}
		
	}else if(e.getSource()==threebutton) {
		if(isOperatorClicked) {
			displaylabel.setText("3");
			isOperatorClicked=false;
			}else {
		displaylabel.setText(displaylabel.getText()+"3");
			}
	}else if(e.getSource()==dotbutton) {
		displaylabel.setText(displaylabel.getText()+".");
		
	}else if(e.getSource()==zerobutton) {
		if(isOperatorClicked) {
			displaylabel.setText("0");
			isOperatorClicked=false;
			}else {
		displaylabel.setText(displaylabel.getText()+"0");
			}
	}else if(e.getSource()==dividebutton) {
		isOperatorClicked=true;
		Calc='/';
		oldValue=displaylabel.getText();
		
		
	}else if(e.getSource()==multiplybutton) {
		isOperatorClicked=true;
		Calc='*';
		oldValue=displaylabel.getText();
		
	}else if(e.getSource()==addbutton)
	{
		isOperatorClicked=true;
		Calc='+';
		oldValue=displaylabel.getText();
		
	}else if(e.getSource()==subbutton) {
		isOperatorClicked=true;
		Calc='-';
		oldValue=displaylabel.getText();
		
	}else if(e.getSource()==clearbutton) {
		displaylabel.setText(" ");
		
	}else if(e.getSource()==backbutton) {
		int length = displaylabel.getText().length();
		int number = length-1;
		if(length>0) {
			StringBuilder back = new StringBuilder(displaylabel.getText());
			back.deleteCharAt(number);
			displaylabel.setText(back.toString());
		}if(displaylabel.getText().endsWith(""));
		
	}else if(e.getSource()==equalbutton)
	{
		String newvalue=displaylabel.getText();
		double oldvalueF=Float.parseFloat(oldValue);
		double newvalueF=Float.parseFloat(newvalue);
		double Result =0;
		
		switch (Calc) {
		case '/' :
			Result =oldvalueF/newvalueF;
			break;

		case '*' :
			Result =oldvalueF*newvalueF;
			break;
			
		case '+' :
			Result =oldvalueF+newvalueF;
			break;
			
		case '-' : 
			Result =oldvalueF-newvalueF;
			break;
		}
		
		displaylabel.setText(Result+" ");
		
	}
}
}
