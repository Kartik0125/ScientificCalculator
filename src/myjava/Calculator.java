package myjava;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	Double first;
	Double second;
	Double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		ImageIcon logoIcon = new ImageIcon("calculator-2020-02-06 (1).png");
	    frame.setIconImage(logoIcon.getImage());
	    frame.setTitle("Scientific Calculator");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().setBackground(new Color(255, 128, 0));
		frame.setBounds(100, 100, 543, 665);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setBounds(127, 10, 325, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn = new JButton("\u221A");
		btn.setEnabled(false);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn.setBackground(new Color(175, 238, 238));
		btn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn.setBounds(31, 142, 85, 55);
		frame.getContentPane().add(btn);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 21));
		textField.setBounds(31, 42, 466, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDiv = new JButton("1/x");
		btnDiv.setEnabled(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnDiv.setBackground(new Color(175, 238, 238));
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnDiv.setBounds(31, 208, 85, 55);
		frame.getContentPane().add(btnDiv);
		
		JButton btnxy = new JButton("x^y");
		btnxy.setEnabled(false);
		btnxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnxy.setForeground(new Color(0, 0, 0));
		btnxy.setBackground(new Color(175, 238, 238));
		btnxy.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnxy.setBounds(31, 273, 85, 55);
		frame.getContentPane().add(btnxy);
		
		JButton btnCube = new JButton("x^3");
		btnCube.setEnabled(false);
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a=Double.parseDouble(textField.getText());
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCube.setBackground(new Color(175, 238, 238));
		btnCube.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCube.setBounds(31, 338, 85, 55);
		frame.getContentPane().add(btnCube);
		
		JButton btnExp = new JButton("e^x");
		btnExp.setEnabled(false);
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a=Math.exp((Double.parseDouble(textField.getText())));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnExp.setBackground(new Color(175, 238, 238));
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnExp.setBounds(127, 142, 85, 55);
		frame.getContentPane().add(btnExp);
		
		JButton btnLog = new JButton("log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a=Math.log10((Double.parseDouble(textField.getText())));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setBackground(new Color(175, 238, 238));
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnLog.setBounds(127, 208, 85, 55);
		frame.getContentPane().add(btnLog);
		
		JButton btnModulo = new JButton("%");
		btnModulo.setEnabled(false);
		btnModulo.setBackground(new Color(175, 238, 238));
		btnModulo.setForeground(new Color(0, 0, 0));
		btnModulo.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnModulo.setBounds(127, 273, 85, 55);
		frame.getContentPane().add(btnModulo);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBackground(new Color(175, 238, 238));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(127, 338, 85, 55);
		frame.getContentPane().add(btn7);
		
		JButton btnSin = new JButton("sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double degrees=Double.parseDouble(textField.getText());
				double radians = degrees * (Math.PI / 180); 
				Double a=Math.sin((radians));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setBackground(new Color(175, 238, 238));
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnSin.setBounds(222, 142, 85, 55);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double inputValue = Double.parseDouble(textField.getText());
			    
				if (inputValue >= -1.0 && inputValue <= 1.0) {
			        double result = Math.toDegrees(Math.asin(inputValue)); 
			        textField.setText("");
			        textField.setText(textField.getText() + result);
			    }
			}
		});
		btnSinh.setBackground(new Color(175, 238, 238));
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnSinh.setBounds(222, 208, 85, 55);
		frame.getContentPane().add(btnSinh);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				first=0.0;
			}
		});
		btnClear.setBackground(new Color(175, 238, 238));
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnClear.setBounds(222, 273, 85, 55);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBackground(new Color(175, 238, 238));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(222, 338, 85, 55);
		frame.getContentPane().add(btn8);
		
		JButton btnCos = new JButton("cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double degrees=Double.parseDouble(textField.getText());
				double radians = degrees * (Math.PI / 180); 
				Double a=Math.cos((radians));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setBackground(new Color(175, 238, 238));
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCos.setBounds(317, 142, 85, 55);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                double inputValue = Double.parseDouble(textField.getText());
			    
				if (inputValue >= -1.0 && inputValue <= 1.0) {
			        double result = Math.toDegrees(Math.acos(inputValue)); 
			        textField.setText("");
			        textField.setText(textField.getText() + result);
			    }
			}
		});
		btnCosh.setBackground(new Color(175, 238, 238));
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCosh.setBounds(317, 208, 85, 55);
		frame.getContentPane().add(btnCosh);
		
		JButton btnBC = new JButton("\uF0E7");
		btnBC.setEnabled(false);
		btnBC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(str.length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBC.setBackground(new Color(175, 238, 238));
		btnBC.setForeground(new Color(0, 0, 0));
		btnBC.setFont(new Font("Wingdings", Font.PLAIN, 21));
		btnBC.setBounds(317, 273, 85, 55);
		frame.getContentPane().add(btnBC);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBackground(new Color(175, 238, 238));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(317, 338, 85, 55);
		frame.getContentPane().add(btn9);
		
		JButton btnTan = new JButton("tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double degrees=Double.parseDouble(textField.getText());
				double radians = degrees * (Math.PI / 180); 
				Double a=Math.tan((radians));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setBackground(new Color(175, 238, 238));
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnTan.setBounds(412, 142, 85, 55);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                double inputValue = Double.parseDouble(textField.getText());
			    
				if (inputValue >= -1.0 && inputValue <= 1.0) {
			        double result = Math.toDegrees(Math.atan(inputValue)); 
			        textField.setText("");
			        textField.setText(textField.getText() + result);
			    }
			}
		});
		btnTanh.setBackground(new Color(175, 238, 238));
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnTanh.setBounds(412, 208, 85, 55);
		frame.getContentPane().add(btnTanh);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setEnabled(false);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setBackground(new Color(175, 238, 238));
		btnPlus.setForeground(new Color(0, 0, 0));
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnPlus.setBounds(412, 273, 85, 55);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setEnabled(false);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMinus.setBackground(new Color(175, 238, 238));
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnMinus.setBounds(412, 338, 85, 55);
		frame.getContentPane().add(btnMinus);
		
		JButton btnSqr = new JButton("x^2");
		btnSqr.setEnabled(false);
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a=Double.parseDouble(textField.getText());
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSqr.setBackground(new Color(175, 238, 238));
		btnSqr.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnSqr.setBounds(31, 404, 85, 55);
		frame.getContentPane().add(btnSqr);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBackground(new Color(175, 238, 238));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(127, 404, 85, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBackground(new Color(175, 238, 238));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(222, 404, 85, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBackground(new Color(175, 238, 238));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(317, 404, 85, 55);
		frame.getContentPane().add(btn6);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setBackground(new Color(175, 238, 238));
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnDivide.setBounds(412, 469, 85, 55);
		frame.getContentPane().add(btnDivide);
		
		JButton btnFact = new JButton("n!");
		btnFact.setEnabled(false);
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1.0;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnFact.setBackground(new Color(175, 238, 238));
		btnFact.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnFact.setBounds(31, 469, 85, 55);
		frame.getContentPane().add(btnFact);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBackground(new Color(175, 238, 238));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(127, 469, 85, 55);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBackground(new Color(175, 238, 238));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(222, 469, 85, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBackground(new Color(175, 238, 238));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(317, 469, 85, 55);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setBackground(new Color(175, 238, 238));
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnMul.setBounds(412, 404, 85, 55);
		frame.getContentPane().add(btnMul);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setBackground(new Color(175, 238, 238));
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnPlusMinus.setBounds(31, 534, 85, 55);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBackground(new Color(175, 238, 238));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(127, 534, 180, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setBackground(new Color(175, 238, 238));
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnDot.setBounds(317, 534, 85, 55);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				switch(operation)
				{
				case "+":result=first+second;
				answer=String.format("%.2f",result);
				break;
				case "-":result=first-second;
				answer=String.format("%.2f",result);
				break;
				case "*":result=first*second;
				answer=String.format("%.2f",result);
				break;
				case "/":result=first/second;
				answer=String.format("%.2f",result);
				break;
				case "%":result=first%second;
				answer=String.format("%.2f",result);
				break;
				case "X^Y":
				Double resultt=1.0;
				for(int i=0;i<second;i++)
				resultt=first*resultt;
				answer=String.format("%.2f",resultt);
				break;
				}
				textField.setText(answer);
			}
		});
		btnEqual.setBackground(new Color(175, 238, 238));
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnEqual.setBounds(412, 534, 85, 55);
		frame.getContentPane().add(btnEqual);
		
		JRadioButton ONButton = new JRadioButton("ON");
		ONButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnPlus.setEnabled(true);
				btnMinus.setEnabled(true);
				btnMul.setEnabled(true);
				btnDivide.setEnabled(true);
				btnModulo.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnDot.setEnabled(true);
				btnSqr.setEnabled(true);
				btn.setEnabled(true);
				btnDiv.setEnabled(true);
				btnxy.setEnabled(true);
				btnCube.setEnabled(true);
				btnFact.setEnabled(true);
				btn.setEnabled(true);
				btnEqual.setEnabled(true);
				btnExp.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnLog.setEnabled(true);
				btnClear.setEnabled(true);
				btnBC.setEnabled(true);
			}
		});
		buttonGroup.add(ONButton);
		ONButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		ONButton.setBackground(new Color(255, 128, 0));
		ONButton.setBounds(31, 113, 85, 29);
		frame.getContentPane().add(ONButton);
		
		JRadioButton OFFButton = new JRadioButton("OFF");
		OFFButton.setSelected(true);
		OFFButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(false);
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnPlus.setEnabled(false);
				btnMinus.setEnabled(false);
				btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				btnModulo.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnDot.setEnabled(false);
				btnSqr.setEnabled(false);
				btn.setEnabled(false);
				btnDiv.setEnabled(false);
				btnxy.setEnabled(false);
				btnCube.setEnabled(false);
				btnFact.setEnabled(false);
				btn.setEnabled(false);
				btnEqual.setEnabled(false);
				btnExp.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnLog.setEnabled(false);
				btnClear.setEnabled(false);
				btnBC.setEnabled(false);
				textField.setText(null);

			}
		});
		buttonGroup.add(OFFButton);
		OFFButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		OFFButton.setBackground(new Color(255, 128, 0));
		OFFButton.setBounds(127, 113, 85, 29);
		frame.getContentPane().add(OFFButton);
	}
}
