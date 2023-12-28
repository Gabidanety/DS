package View;


import javax.swing.*;
import javax.swing.event.AncestorListener;

import com.mysql.jdbc.Statement;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewProd extends JDialog{

		JLabel lbtitulo;

		JLabel lbProduto;
		JTextField txProd;

		
		JLabel lbValor;
		JTextField txValor;
		
		JLabel lbIdCategoria;
		JTextField txidCat;
		JTextField txNomeCat;
		//JComboBox cbCat;
		JComboBox cbPod;

		//int idCat=0;
		int idpod=0;
		String pod=null;
		String txPod = null;
		String txAlter=null;
		
		JLabel lbDescProduto;
		JTextField txDescProduto;
		
		JLabel lbQuant;
		JTextField txQuant;
		
		JButton btEnviar;
		JButton btDelete;
		JButton btVw;

		public ViewProd() {
			
			Color c = new Color(78, 107, 156);
			
			this.setTitle("Visualizacao dos Produtos");
			this.setSize(700,400);
			this.setModal(true);
			this.setLocationRelativeTo(null);
			this.getContentPane().setBackground(c);
			
			lbtitulo = new JLabel();
			lbtitulo.setBounds(200,20,400,30);
			lbtitulo.setText("Consulta de Produtos");
			lbtitulo.setForeground(Color.white);
			lbtitulo.setFont(new Font("Arial", Font.BOLD,20));
			add(lbtitulo);
			
			lbProduto = new JLabel();
			lbProduto.setBounds(100,60,200,30);
			lbProduto.setText("Produto:");
			lbProduto.setForeground(Color.white);
			add(lbProduto);
			
			txProd = new JTextField();
			txProd.setBounds(150,65,130,20);
			txProd.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
			add(txProd);
			txProd.setVisible(false);
			
			cbPod = new JComboBox<>();
			cbPod.setBounds(150,65,130,20);
			cbPod.setBackground(Color.WHITE);
			cbPod.setForeground(Color.black);
			add(cbPod);
			
			//idProduto
			Statement state;

			ResultSet resultset;
			
			Conexao conex = new Conexao();     
			
			String sql = "select Produto from tbproduto order by Produto";	

			conex.conectar();      

			cbPod.addItem("Produtos");
			
			try {
				
				state = (Statement) Conexao.con.createStatement();
				
				resultset = state.executeQuery(sql);

				while(resultset.next()) {
					
					cbPod.addItem(resultset.getString(1));


				}
				
				
				
				
			}catch(SQLException erro){
				
				System.out.println("Nao foi possivel  realizar a consulta");
			}
			
			conex.desconectar();
	    
			//fim
			
			lbValor = new JLabel();
			lbValor.setBounds(100,100,200,30);
			lbValor.setText("Valor:");
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
			
			txidCat = new JTextField();
			txidCat.setBounds(175,145,33,20);
			txidCat.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
			add(txidCat);
			
			Color cb = new Color(111, 126, 158);
			
			txNomeCat = new JTextField();
			txNomeCat.setBounds(220,145,100,20);
			txNomeCat.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
			txNomeCat.setBackground(cb);

			add(txNomeCat);
			txNomeCat.setEnabled(false);

			lbDescProduto = new JLabel();
			lbDescProduto.setBounds(100,180,300,30);
			lbDescProduto.setText("Descricao do Produto:");
			lbDescProduto.setForeground(Color.white);
			add(lbDescProduto);
			
			txDescProduto = new JTextField();
			txDescProduto.setBounds(230,183,130,20);
			txDescProduto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
			add(txDescProduto);
			
			lbQuant = new JLabel();
			lbQuant.setBounds(100,220,200,30);
			lbQuant.setText("Quantidade:");
			lbQuant.setForeground(Color.white);
			add(lbQuant);
			
			txQuant = new JTextField();
			txQuant.setBounds(170,223,130,20);
			txQuant.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white));
			add(txQuant);
			
			
			
			btEnviar = new JButton ();
			btEnviar.setBounds(200,260,100,25);
			btEnviar.setText("Editar");
			btEnviar.setBackground(cb);
			btEnviar.setForeground(Color.WHITE);
			btEnviar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));
			add(btEnviar);
			btEnviar.setEnabled(false);
			
			btVw = new JButton ();
			btVw.setBounds(320,260,100,25);
			btVw.setText("Visuzlizar");
			btVw.setBackground(cb);
			btVw.setForeground(Color.WHITE);
			btVw.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));
			add(btVw);
			btVw.setEnabled(false);
		
			btDelete = new JButton ();
			btDelete.setBounds(440,260,100,25);
			btDelete.setText("Deletar");
			btDelete.setBackground(cb);
			btDelete.setForeground(Color.WHITE);
			btDelete.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,  Color.white));
			add(btDelete);
			btDelete.setEnabled(false);

			
			
			cbPod.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
						
							btDelete.setEnabled(true);

							btVw.setEnabled(true);
							
							btEnviar.setEnabled(true);

							txPod = (String) cbPod.getSelectedItem();
							
							txProd.setVisible(true);
							cbPod.setVisible(false);
							
						
							
							Statement state;

							ResultSet resultset;
							
							Conexao conex = new Conexao();     
							
							String sql = "SELECT tbProduto.idProduto, tbProduto.Produto, tbProduto.valor, tbProduto.idCategoria, tbProduto.descricao, tbProduto.quant, tbCategoria.categoria \r\n"
									+ "							FROM tbProduto\r\n"
									+ "							INNER JOIN tbCategoria ON tbProduto.idCategoria = tbCategoria.idCategoria\r\n"
									+ "							WHERE tbProduto.Produto = 	'"+txPod+"' ";	

							conex.conectar();      

						
							try {
								
								state = (Statement) Conexao.con.createStatement();
								
								resultset = state.executeQuery(sql);

								if(resultset.next()) {
									
									pod = (resultset.getString("idProduto"));

									txProd.setText(resultset.getString(2));
									txValor.setText(resultset.getString(3));
									txidCat.setText(resultset.getString(4));	
									txDescProduto.setText(resultset.getString(5));									
									txQuant.setText(resultset.getString(6));									
									txNomeCat.setText(" "+resultset.getString(7));
									
									idpod = Integer.parseInt(pod);
									
								}else {
									System.out.println("Produto n�o exixte no banco");
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
							
							String sql = "UPDATE `tbproduto` SET `Produto`='"+txProd.getText()+"',`valor`='"+txValor.getText()+"',`idCategoria`='"+txidCat.getText()+"',"
										+ "`descricao`='"+txDescProduto.getText()+"',`quant`='"+txQuant.getText()+"' WHERE idProduto = '"+idpod+"'";	
							//update
							conex.conectar();      

							try {
								
								state = (Statement) Conexao.con.createStatement();
								
								state.executeUpdate(sql);

								JOptionPane.showMessageDialog(null, "Produto Alterado!");

								
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

							Statement state;

							ResultSet resultset;
							
							Conexao conex = new Conexao();     

							String sql = "select idProduto,Produto,valor,idCategoria,descricao,quant from tbproduto where idproduto = '"+idpod+"'";	

							conex.conectar();      

							try {
								
								state = (Statement) Conexao.con.createStatement();
								
								resultset = state.executeQuery(sql);

								while(resultset.next()) {
									
									JOptionPane.showMessageDialog(null,"Id: "+resultset.getString(1)+"\n"+"Nome: "+resultset.getString(2)+
																		"\n "+"Valor: "+resultset.getString(3)+"\n "+"id da Categoria: "+resultset.getString(4)+"\n "
																		+"Descricao: "+resultset.getString(5)+"\n "+"Quantidade: "+resultset.getString(6)+"\n");	
								}
								
							}catch(SQLException erro){
								
								System.out.println("Nao foi possivel  realizar a consulta");
							}
							
							conex.desconectar();

							reset();
							
						}

						
					}
			);
			
			btDelete.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							
							Statement state;

							ResultSet resultset;
							
							Conexao conex = new Conexao(); 
							
							String sql = "DELETE FROM `tbproduto` WHERE idproduto = '"+idpod+"' ";	
					
							conex.conectar();      

							try {
								
								state = (Statement) Conexao.con.createStatement();
								
								state.executeUpdate(sql);

								JOptionPane.showMessageDialog(null, "Prodduto Deletado!");

								
							}catch(SQLException erro){
								
								System.out.println("Nao foi possivel  realizar a consulta");
							}
							
							conex.desconectar();

							reset();
							setVisible(false);
						}
					
					});
			this.setLayout(null);				

		}
		
		public void reset() {
			
			btDelete.setEnabled(false);

			btVw.setEnabled(false);
			
			btEnviar.setEnabled(false);
			
			txProd.setVisible(false);
			cbPod.setVisible(true);
			
			txProd.setText("");
			txValor.setText("");
			txidCat.setText("");	
			txDescProduto.setText("");									
			txQuant.setText("");
			txNomeCat.setText("");

		}
	}


	
	

