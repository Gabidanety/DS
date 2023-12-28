package View;

import javax.swing.*;
import javax.swing.event.AncestorListener;

import com.mysql.jdbc.Statement;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewCate extends JDialog {

	JLabel lbtitulo;
	JLabel lbcat;
	
	JLabel lbPesquisa;
	JLabel lbProduto;

	JComboBox cbCat;
	JComboBox cbPod;

	
	int idpod=0;
	String pod=null;

	JTextField txCat;

	int idCate=0;
	String cat=null;
	String txAlter = null;
	
	
	public ViewCate() {
		Color c = new Color(78, 107, 156);
		
		this.setTitle("Visualizacao das Categorias");
		this.setSize(700,400);
		this.setModal(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(c);
		
		Color cb = new Color(111, 126, 158);
		
		lbtitulo = new JLabel();
		lbtitulo.setBounds(200,20,400,30);
		lbtitulo.setText("Consulta das Categorias");
		lbtitulo.setForeground(Color.white);
		lbtitulo.setFont(new Font("Arial", Font.BOLD,25));
		add(lbtitulo);
		
		lbPesquisa = new JLabel();
		lbPesquisa.setBounds(140,75,200,30);
		lbPesquisa.setText("Categoria");
		lbPesquisa.setForeground(Color.white);
		lbPesquisa.setFont(new Font("Arial", Font.BOLD,17));
		add(lbPesquisa);

		cbCat = new JComboBox<>();
		cbCat.setBounds(140,105,130,23);
		cbCat.setBackground(Color.WHITE);
		cbCat.setForeground(Color.black);
		cbCat.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));
		cbCat.setFont(new Font("Arial", Font.BOLD,15));

		add(cbCat);

		//Categorias
		
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
		//
		
		lbProduto = new JLabel();
		lbProduto.setBounds(140,150,400,30);
		lbProduto.setText("Produtos associado a categoria:");
		lbProduto.setForeground(Color.white);
		lbProduto.setFont(new Font("Arial", Font.BOLD,17));

		add(lbProduto);
		
		cbPod = new JComboBox<>();
		cbPod.setBounds(140,180,130,20);
		cbPod.setBackground(Color.WHITE);
		cbPod.setForeground(Color.black);
		cbPod.setFont(new Font("Arial", Font.BOLD,15));

		add(cbPod);
		
	/*	btEnviar = new JButton ();
		btEnviar.setBounds(100,155,100,25);
		btEnviar.setText("Inserir");
		btEnviar.setBackground(cb);
		btEnviar.setForeground(Color.WHITE);
		btEnviar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));
		add(btEnviar);
		btEnviar.setEnabled(true);*/


			
			cbCat.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {

							txAlter = (String) cbCat.getSelectedItem();
							
						
							
							Statement state;

							ResultSet resultset;
							
							Conexao conex = new Conexao();     

							String sql = "select idCategoria from tbcategoria where categoria = '"+txAlter+"' ";	

							conex.conectar();      

							
							try {
								
								state = (Statement) Conexao.con.createStatement();
								
								resultset = state.executeQuery(sql);

								if(resultset.next()) {
									
									cat = (resultset.getString("idCategoria"));

									idCate = Integer.parseInt(cat);
									//System.out.println(idCate);
									
									String pod = "select Produto FROM `tbproduto` WHERE idCategoria = '"+idCate+"'";	
									
									cbPod.addItem("Produtos");
									
									try {
										
										
										resultset = state.executeQuery(pod);

										while(resultset.next()) {
											
											cbPod.addItem(resultset.getString("Produto"));
			
										}
			
									}catch(SQLException erro){
										
										System.out.println("Nao foi possivel  realizar a consulta 2");
									}
									
								}else {
									System.out.println("categoria nao exixte no banco");
								}
								
							}catch(SQLException erro){
								
								System.out.println("Nao foi possivel  realizar a consulta");
							}
							
		
							conex.desconectar();

						}
					
					});
			
			
			
			
	//	this.setVisible(true);
		this.setLayout(null);
	}


	
	
}
