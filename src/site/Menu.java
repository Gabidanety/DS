package site;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.event.*;

public class Menu extends JDialog {

	private JTabbedPane jogo;
    JLabel imagemCarro;

	public Menu() {
		
		Color c = new Color(58, 62, 107);
		Color cb = new Color(133, 152, 204);//cor da barra
		
		this.setTitle("Or�amento");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(c);
		
		imagemCarro = new JLabel();
        imagemCarro.setBounds(600,80,800,600);
        add(imagemCarro);
        
		ImageIcon imagem = new ImageIcon(getClass().getResource("image/caoNerd.jpg"));
		imagemCarro.setIcon(imagem);
        add(imagemCarro);
        
        setResizable(true);
		
		
		JMenu mn = new JMenu ("Menu");
		JMenu gm = new JMenu ("Gamer");
		JMenu orcm = new JMenu("Orcamento");
		JMenu cal = new JMenu ("Calculadora");
		
		JMenuItem sair = new JMenuItem ("Sair");
		JMenuItem jogo = new JMenuItem ("Jogo");
		JMenuItem or = new JMenuItem("Orcamento");
		JMenuItem cl = new JMenuItem("Calcular");
		
		orcm.add(or);
		cal.add(cl);
		mn.add(sair);
		gm.add(jogo);

		
		JMenuBar bar = new JMenuBar();
		bar.setBackground(cb);
		
		setJMenuBar(bar);
		
		bar.add(mn);
		bar.add(orcm);
		bar.add(cal);
		bar.add(gm);
		
		sair.addActionListener(
				new ActionListener() {

					public void actionPerformed(ActionEvent event) {
						System.exit(0);						
					}

					
				}
		);
		
		or.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						FormsOrcamento fo = new FormsOrcamento();
						
						fo.setVisible(true);
					}

					
				}
		);
		
		cl.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						Calculadora cal = new Calculadora();
						
						cal.setVisible(true);
					}

					
				}
		);
	

		jogo.addActionListener(
				 new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						GamerJTabbedPane gm = new GamerJTabbedPane ();
						gm.setVisible(true);
					}
				}
			);
		this.setVisible(true);

	}
}
