package View;


import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.awt.*;
import java.awt.event.*;

public class Sobre extends JDialog {

	JLabel lbNome1;
	JLabel  lbEmail1;
	
	JLabel lbNome2;
	JLabel  lbEmail2;

	JLabel imgProgramador1;
	JLabel imgProgramador2;

	
	ButtonGroup bgNomeEmail;
	  
	public Sobre () {
		
		Color c = new Color(78, 107, 156);
		
		this.setTitle("Sobre");
		this.setSize(800,600);
		this.setModal(true);
		this.setLocationRelativeTo(null);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(c);
		
		
        
		imgProgramador1 = new JLabel();
        imgProgramador1.setBounds(30,30,200,200);
        add(imgProgramador1);
        setLayout(null);
        
        ImageIcon imagem = new ImageIcon(getClass().getResource("image/gaby.png"));
        imgProgramador1.setIcon(imagem);
        add(imgProgramador1);
        
        lbNome1 = new JLabel();
        lbNome1.setBounds(250,30,200,30);
        lbNome1.setText("Gabrielly de Souza");
        lbNome1.setForeground(Color.white);
        lbNome1.setFont(new Font("Arial", Font.BOLD,20));
		add(lbNome1);
		
		lbEmail1 = new JLabel();
		lbEmail1.setBounds(250,60,400,30);
		lbEmail1.setText("Gabinete878@gmail.com");
		lbEmail1.setForeground(Color.white);
		lbEmail1.setFont(new Font("Arial", Font.BOLD,20));
			add(lbEmail1);
			
		imgProgramador1 = new JLabel();
        imgProgramador1.setBounds(130,130,200,200);
        add(imgProgramador1);
        setLayout(null);
	        
        ImageIcon imagem1 = new ImageIcon(getClass().getResource("image/felipe.jpeg"));
        imgProgramador2.setIcon(imagem1);
        add(imgProgramador2);
	        
	        lbNome2 = new JLabel();
	        lbNome2.setBounds(250,30,200,30);
	        lbNome2.setText("FElipe Tavares");
	        lbNome2.setForeground(Color.white);
	        lbNome2.setFont(new Font("Arial", Font.BOLD,20));
			add(lbNome2);
			
			lbEmail2 = new JLabel();
			lbEmail2.setBounds(250,60,400,30);
			lbEmail2.setText("email");
			lbEmail2.setForeground(Color.white);
			lbEmail2.setFont(new Font("Arial", Font.BOLD,20));
				add(lbEmail2);
        
        setResizable(true);
		this.setLayout(null);				

	}
	
	
	
}
