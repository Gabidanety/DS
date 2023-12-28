package View;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.event.*;

//banco
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

public class Categoria extends JDialog {

	JLabel lbtitulo;
	JLabel lbcat;
	
	JLabel lbPesquisa;
	JTextField txPesquisa;

	JComboBox cbCat;
	
	JTextField txCat;
	
	JButton btEnviar;
	JButton btAlterar;
	JButton btExcluir;
	JButton btPesquisa;

	int idCate=0;
	String cat=null;
	String txAlter = null;
	
	public Categoria() {
		
		Color c = new Color(78, 107, 156);

		this.setTitle("Categoria");
		this.setSize(600,400);
		this.setModal(true);
		this.setLocationRelativeTo(null);
		//this.setDefaultCloseOperation(EXIT_ON_CLOS-E);
		this.getContentPane().setBackground(c);
		
		Color cb = new Color(111, 126, 158);
		
		lbtitulo = new JLabel();
		lbtitulo.setBounds(200,20,200,30);
		lbtitulo.setText("Gerenciar Categoria");
		lbtitulo.setForeground(Color.white);
		lbtitulo.setFont(new Font("Arial", Font.BOLD,20));
		add(lbtitulo);
		
		lbPesquisa = new JLabel();
		lbPesquisa.setBounds(167,70,200,30);
		lbPesquisa.setText("Categoria");
		lbPesquisa.setForeground(Color.white);
		add(lbPesquisa);
		

		cbCat = new JComboBox<>();
		cbCat.setBounds(230,72,130,23);
		cbCat.setBackground(Color.WHITE);
		cbCat.setForeground(Color.black);
		cbCat.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));
		add(cbCat);
		cbCat.setVisible(true);

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

		btPesquisa = new JButton ();
		btPesquisa.setBounds(370,72,32,25);
		btPesquisa.setText("+");
		btPesquisa.setBackground(Color.WHITE);
		btPesquisa.setForeground(Color.black);
		btPesquisa.setFont(new Font("Arial", Font.BOLD,30));
		btPesquisa.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  cb));
		add(btPesquisa);
		

		txCat = new JTextField();
	
		txCat.setBounds(230,75,130,20);
		txCat.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
		txCat.setVisible(false);
		add(txCat);

		
		btEnviar = new JButton ();
		btEnviar.setBounds(100,155,100,25);
		btEnviar.setText("Inserir");
		btEnviar.setBackground(cb);
		btEnviar.setForeground(Color.WHITE);
		btEnviar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));
		add(btEnviar);
		btEnviar.setEnabled(true);

		
		btAlterar = new JButton ();
		btAlterar.setBounds(210,155,150,25);
		btAlterar.setText("Alterar");
		btAlterar.setBackground(cb);
		btAlterar.setForeground(Color.WHITE);
		btAlterar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));
		add(btAlterar);
		btAlterar.setEnabled(false);

		
		btExcluir = new JButton ();
		btExcluir.setBounds(370,155,100,25);
		btExcluir.setText("Excluir");
		btExcluir.setBackground(cb);
		btExcluir.setForeground(Color.WHITE);
		btExcluir.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));
		add(btExcluir);
		btExcluir.setEnabled(false);

		
			btEnviar.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {

							Statement state;

							ResultSet resultset;
							
							Conexao conex = new Conexao();     

							String sql = "insert into tbcategoria values(null,'"+txCat.getText()+"')";	

							conex.conectar();      

							try {
								
								state = (Statement) Conexao.con.createStatement();
								
								state.executeUpdate(sql);

								JOptionPane.showMessageDialog(null, "Categoria cadastrada!");

								
							}catch(SQLException erro){
								
								System.out.println("Nao foi possivel  realizar a consulta");
							}
							
							conex.desconectar();

						}

						
					}
			);
			
			cbCat.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							
							btExcluir.setEnabled(true);

							btAlterar.setEnabled(true);
							
							btEnviar.setEnabled(false);

							txAlter = (String) cbCat.getSelectedItem();
							
							txCat.setText(txAlter);
							
							txCat.setVisible(true);
							
							cbCat.setVisible(false);


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
									
								}else {
									System.out.println("categoria nao exixte no banco");
								}
								
							}catch(SQLException erro){
								
								System.out.println("Nao foi possivel  realizar a consulta");
							}
							
							conex.desconectar();

							
						}
					
					});
			
			btPesquisa.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							
						
							txCat.setText(" ");

							txCat.setVisible(true);
							cbCat.setVisible(false);
							
							btExcluir.setEnabled(false);

							btAlterar.setEnabled(false);
							
							btEnviar.setEnabled(true);

						}
					
					});
			
			btAlterar.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {

							
							Statement state;

							ResultSet resultset;
							
							Conexao conex = new Conexao(); 
							
							String sql = "UPDATE `tbcategoria` SET `categoria`='"+txCat.getText()+"' WHERE idCategoria = '"+idCate+"'";	
							//update
							conex.conectar();      

							try {
								
								state = (Statement) Conexao.con.createStatement();
								
								state.executeUpdate(sql);

								JOptionPane.showMessageDialog(null, "Categoria Alterada!");
							//	System.out.println(idCate);

								
							}catch(SQLException erro){
								
								System.out.println("Nao foi possivel  realizar a consulta");
							}
							
							conex.desconectar();

						}
					
					});
			
			btExcluir.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							
							
							Statement state;

							ResultSet resultset;
							
							Conexao conex = new Conexao();    
														
							String sql = "select COUNT(Produto) FROM `tbproduto` WHERE idCategoria = '"+idCate+"'";
						
							conex.conectar();      

							try {
								
								
								state = (Statement) Conexao.con.createStatement();
								
								resultset = state.executeQuery(sql);

								
								if(resultset.next()) {
								
									int results = Integer.parseInt(resultset.getString(1));

									if(results==0) {
										
										String delt = "DELETE FROM `tbcategoria` WHERE idCategoria = '"+idCate+"' ";

										state.executeUpdate(delt);

										JOptionPane.showMessageDialog(null, "Categoria Deletada!");
										
									}else {
									
								    	int delet = JOptionPane.showConfirmDialog(null,"Impossível excluir a categoria! A categoria está associada a "+resultset.getString(1)+" "
								    										+ "produtos. Deseja deletar tanto a categoria quanto os produtos?","Delete", JOptionPane.YES_NO_CANCEL_OPTION);
	
										if(delet==0) {
											
											String deltProd = "DELETE FROM `tbproduto` WHERE idCategoria ='"+idCate+"'";
											
											String delt = "DELETE FROM `tbcategoria` WHERE idCategoria = '"+idCate+"'";
											
											try {
												
												state = (Statement) Conexao.con.createStatement();
												
												state.executeUpdate(deltProd);
	
												
											}catch(SQLException erro){
												
												System.out.println("Nao foi possivel  realizar a consulta 2");
											}
											
											state.executeUpdate(delt);			
	
											JOptionPane.showMessageDialog(null, "Categoria e Produto Deletado!");
										
											}
									}

									
								}
								setVisible(false);

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
