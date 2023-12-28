package View;


import javax.swing.*;
import javax.swing.event.AncestorListener;

import com.mysql.jdbc.Statement;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Produto extends JDialog{

	JLabel lbtitulo;

	JLabel lbProduto;
	JTextField txProduto;
	
	JLabel lbValor;
	JTextField txValor;
	
	JLabel lbIdCategoria;
	JTextField txidCategoria;
	
	JComboBox cbCat;
	JComboBox cbPod;

	//int idCat=0;
	int idCate=0;
	String cat=null;
	String txCat = null;
	
	JLabel lbDescProduto;
	JTextField txDescProduto;
	
	JLabel lbQuant;
	JTextField txQuant;
	
	JButton btEnviar;
	JButton btVw;

	public Produto() {
		
		Color c = new Color(78, 107, 156);
		
		this.setTitle("Produto");
		this.setSize(600,400);
		this.setModal(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(c);
		
		lbtitulo = new JLabel();
		lbtitulo.setBounds(200,20,200,30);
		lbtitulo.setText("Produto");
		lbtitulo.setForeground(Color.white);
		lbtitulo.setFont(new Font("Arial", Font.BOLD,20));
		add(lbtitulo);
		
		lbProduto = new JLabel();
		lbProduto.setBounds(100,60,200,30);
		lbProduto.setText("Produto");
		lbProduto.setForeground(Color.white);
		add(lbProduto);
		
		txProduto = new JTextField();
		txProduto.setBounds(150,63,130,20);
		txProduto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
		add(txProduto);
		
		lbValor = new JLabel();
		lbValor.setBounds(100,100,200,30);
		lbValor.setText("Valor");
		lbValor.setForeground(Color.white);
		add(lbValor);
		
		txValor = new JTextField();
		txValor.setBounds(135,103,130,20);
		txValor.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
		add(txValor);
		
		lbIdCategoria = new JLabel();
		lbIdCategoria.setBounds(100,140,200,30);
		lbIdCategoria.setText("Id Categoria:");
		lbIdCategoria.setForeground(Color.white);
		add(lbIdCategoria);
		
		cbCat = new JComboBox<>();
		cbCat.setBounds(180,140,150,30);
		cbCat.setBackground(Color.WHITE);
		cbCat.setForeground(Color.black);
		add(cbCat);
		
		
		//idCtaegoria
		Statement state;

		ResultSet resultset;

		
		Conexao conex = new Conexao();     

		String sql = "select categoria from tbcategoria order by categoria";	
		

		conex.conectar();      

		cbCat.addItem("Categoria");
		
		try {
			
			state = (Statement) Conexao.con.createStatement();
			
			resultset = state.executeQuery(sql);

			while(resultset.next()) {
				
				cbCat.addItem(resultset.getString(1));


			}
			
			
			
		}catch(SQLException erro){
			
			System.out.println("Nao foi possivel  realizar a consulta");
		}
		
		conex.desconectar();
    
		//fim

		lbDescProduto = new JLabel();
		lbDescProduto.setBounds(100,180,300,30);
		lbDescProduto.setText("Descricao do Produto");
		lbDescProduto.setForeground(Color.white);
		add(lbDescProduto);
		
		txDescProduto = new JTextField();
		txDescProduto.setBounds(230,183,130,20);
		txDescProduto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
		add(txDescProduto);
		
		lbQuant = new JLabel();
		lbQuant.setBounds(100,220,200,30);
		lbQuant.setText("Quantidade");
		lbQuant.setForeground(Color.white);
		add(lbQuant);
		
		txQuant = new JTextField();
		txQuant.setBounds(170,223,130,20);
		txQuant.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
		add(txQuant);
		
		Color cb = new Color(111, 126, 158);
		
		btEnviar = new JButton ();
		btEnviar.setBounds(200,260,100,25);
		btEnviar.setText("Enviar");
		btEnviar.setBackground(cb);
		btEnviar.setForeground(Color.WHITE);
		btEnviar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));

		add(btEnviar);
		
		btVw = new JButton ();
		btVw.setBounds(320,260,100,25);
		btVw.setText("Visuzlizar");
		btVw.setBackground(cb);
		btVw.setForeground(Color.WHITE);
		btVw.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));

		add(btVw);
		
		cbCat.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						
						txCat = (String) cbCat.getSelectedItem();

						
						Statement state;

						ResultSet resultset;
						
						Conexao conex = new Conexao();     

						String sql = "select idCategoria from tbcategoria where categoria = '"+txCat+"' ";	

						conex.conectar();      

						
						try {
							
							state = (Statement) Conexao.con.createStatement();
							
							resultset = state.executeQuery(sql);

							if(resultset.next()) {
								
								cat = (resultset.getString("idCategoria"));

								idCate = Integer.parseInt(cat);
								
							}else {
								System.out.println("categoria n�o exixte no banco");
							}
							
						}catch(SQLException erro){
							
							System.out.println("Nao foi possivel  realizar a consulta");
						}
						
						conex.desconectar();

						

					}

					
				}
		);
		
		
		btEnviar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						Statement state;

						ResultSet resultset;
						
						Conexao conex = new Conexao();     
					//	
						String sql = "insert into tbproduto values(null,'"+txProduto.getText()+"','"+txValor.getText()+"','"+idCate+"','"+txDescProduto.getText()+"','"+txQuant.getText()+"')";	

						conex.conectar();      

						try {
							
							
							state = (Statement) Conexao.con.createStatement();
							
							state.executeUpdate(sql);

							JOptionPane.showMessageDialog(null, "Produto cadastrada!");

							
							
						}catch(SQLException erro){
							
							System.out.println("Nao foi possivel  realizar a consulta");
						}
						
						conex.desconectar();

						reset();
					}

					
				}
		);
		
		btVw.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {

						ViewProd vp = new ViewProd();
						
						vp.setVisible(true);

					}
				}
		);
		this.setLayout(null);				

	}
	
	public void reset() {
		
		
		txProduto.setText("");
		txValor.setText("");
		txDescProduto.setText("");									
		txQuant.setText("");

	}
}

