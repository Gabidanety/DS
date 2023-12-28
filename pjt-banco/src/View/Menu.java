package View;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

	private JTabbedPane jogo;
    JLabel imagemCarro;

	public Menu() {
		
		Color c = new Color(72, 88, 115);
		Color cb = new Color(78, 107, 156);//cor da barra
		
		this.setTitle("Etec - HOME");
		this.setSize(1000,900);
		this.setExtendedState(JFrame. MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(c);
		//	
		JMenu av = new JMenu ("Arquivo");
		JMenu cd = new JMenu ("Cadastra");
		JMenu vz = new JMenu("Visualizar");
		JMenu aj = new JMenu ("Ajuda");
		
		JMenuItem sair = new JMenuItem ("Sair");
		
		JMenuItem categoria = new JMenuItem ("Categoria");
		JMenuItem produto = new JMenuItem("Produto");
		
		JMenuItem cats = new JMenuItem ("Visualizar Categorias");
		JMenuItem prods = new JMenuItem("Visualizar Produtos");
		
		JMenuItem sobre = new JMenuItem("Sobre");
		
		
		cd.add(categoria);
		cd.add(produto);
		
		vz.add(cats);
		vz.add(prods);
		
		aj.add(sobre);
		av.add(sair);
		

		
		JMenuBar bar = new JMenuBar();
		bar.setBackground(cb);
		
		setJMenuBar(bar);

		bar.add(av);
		bar.add(cd);
		bar.add(vz);
		bar.add(aj);
		
		sair.addActionListener(
				new ActionListener() {

					public void actionPerformed(ActionEvent event) {
						System.exit(0);						
					}

					
				}
		);
		
		categoria.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						Categoria ct = new Categoria();
						
						ct.setVisible(true);

					}

					
				}
		);
		
	
		
		produto.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						Produto pd = new Produto();
						
						pd.setVisible(true);

					}

					
				}
		);
		
		sobre.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						Sobre sb = new Sobre();
						
						sb.setVisible(true);

					}

					
				}
		);
		
		prods.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						ViewProd vp = new ViewProd();
						
						vp.setVisible(true);

					}

					
				}
		);
		
		cats.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						ViewCate vct = new ViewCate();
						
						vct.setVisible(true);

					}

					
				}
		);
		
		this.setVisible(true);

	}
}
