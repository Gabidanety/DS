package site;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Calculadora  extends JDialog {
	
		JLabel lbNum;
		JTextField txNum;
		
		JLabel lbNum2;
		JTextField txNum2;
		
		JButton btSoma;
		JButton btSub;
		JButton btMult;
		JButton btDivs;
		JButton btCancelar;

		
		
		public Calculadora(){

			Color c = new Color(199, 178, 217);
			Color cbt = new Color(100, 55, 247);
			Color cb = new Color(175, 138, 219);


			this.setTitle("Calculos");
			
			this.setSize(633,200);
			this.setModal(true);
			this.setLocationRelativeTo(null);
		//	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.getContentPane().setBackground(c);
			
			lbNum = new JLabel();
				lbNum.setBounds(20,18,100,25);
				lbNum.setText("Numero 1:");
				lbNum.setForeground(cbt);

					add(lbNum);
			
				txNum = new JTextField();
					txNum.setBounds(85,20,140,25);
					txNum.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, cb));

				add(txNum);
				
				//num 2
				lbNum2 = new JLabel();
					lbNum2.setBounds(20,58,100,25);
					lbNum2.setText("Numero 2:");
					lbNum2.setForeground(cbt);

				add(lbNum2);
			
				txNum2 = new JTextField();
					txNum2.setBounds(85,60,140,25);
					txNum2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, cb));

				add(txNum2);
				
				
				//somar
			
			btSoma = new JButton ();
				btSoma.setBounds(20,100,100,25);
				btSoma.setText("Somar");
				btSoma.setBackground(cb);
				btSoma.setForeground(Color.WHITE);
				    //borda                                 //em cima,esquerda,em baixo,direita. cor    
				btSoma.setBorder(BorderFactory.createMatteBorder(0, 4, 4, 0, cbt));

					add(btSoma);
					
				
				//sub
					
				btSub = new JButton ();
					btSub.setBounds(140,100,100,25);
					btSub.setText("Subtrair");
					btSub.setBackground(cb);
					btSub.setForeground(Color.WHITE);
					btSub.setBorder(BorderFactory.createMatteBorder(0, 4, 4, 0, cbt));

						add(btSub);
				
				//mult
						
					btMult = new JButton ();
						btMult.setBounds(260,100,100,25);
						btMult.setText("Multiplicar");
						btMult.setBackground(cb);
						btMult.setForeground(Color.WHITE);
						btMult.setBorder(BorderFactory.createMatteBorder(0, 4, 4, 0, cbt));

							add(btMult);
						
				//divs
							
					btDivs = new JButton ();
						btDivs.setBounds(380,100,100,25);
						btDivs.setText("Divisao");
						btDivs.setBackground(cb);
						btDivs.setForeground(Color.WHITE);
						btDivs.setBorder(BorderFactory.createMatteBorder(0, 4, 4, 0, cbt));

					add(btDivs);
					
					btCancelar= new JButton();
						btCancelar.setBounds(500,100,100,25);
						btCancelar.setText("Cancelar");
						btCancelar.setBackground(cbt);
						btCancelar.setForeground(Color.WHITE);
						btCancelar.setBorder(BorderFactory.createMatteBorder(0, 4, 4, 0, cbt));
					add(btCancelar);
								
					
					btSoma.addActionListener(new ActionListener() {

		
						@Override
						public void actionPerformed(ActionEvent e) {
								
						int n1 = Integer.parseInt(txNum.getText());
							
						int n2 = Integer.parseInt(txNum2.getText());
						
						

						JOptionPane.showMessageDialog(null, "O resultado da soma e: "+(n1+n2));

						}
						
					});
					
					btSub.addActionListener(new ActionListener() {

						
						@Override
						public void actionPerformed(ActionEvent e) {
								
						int n1 = Integer.parseInt(txNum.getText());
							
						int n2 = Integer.parseInt(txNum2.getText());
						
						
						JOptionPane.showMessageDialog(null, "O resultado da Subtracao e: "+(n1-n2));

						}
						
					});
					
					btMult.addActionListener(new ActionListener() {

						
						@Override
						public void actionPerformed(ActionEvent e) {
								
						int n1 = Integer.parseInt(txNum.getText());
							
						int n2 = Integer.parseInt(txNum2.getText());
						
						
						JOptionPane.showMessageDialog(null, "O resultado da Multiplicacao e: "+(n1*n2));

						}
						
					});
					
					btDivs.addActionListener(new ActionListener() {

						
						@Override
						public void actionPerformed(ActionEvent e) {
								
							double n1 = Double.parseDouble(txNum.getText());
								
							double n2 = Double.parseDouble(txNum2.getText());
							
							if(n2==0) {
								
								JOptionPane.showMessageDialog(null, "Nao e possivel executar a divisao ");

							}
							
							JOptionPane.showMessageDialog(null, "O resultado da divisao e: "+(n1/n2));

						}
						
					});
					
					btCancelar.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
								setVisible(false);
							
						}
						
					});
					
					
			this.setLayout(null);				
			this.setVisible(true);
			

			
		}
		
		

	}


