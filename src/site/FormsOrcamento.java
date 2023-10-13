package site;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;

public class FormsOrcamento extends JDialog  implements ActionListener{

	JLabel lbNome;
	JTextField txNome;
	
	JLabel lbTel;
	JTextField txTel;
	
	JLabel LdEmail;
	JTextField txEmail;
	
	JLabel lbModelo;

	JComboBox cbModelo;
	JComboBox cbCor;
	
	JLabel lbMarca;
	JLabel lbCor;

	JRadioButton rdTesla;
	JRadioButton rdJeep;
	JRadioButton rdFord;
	JRadioButton rdChevrolet;
	
	ButtonGroup bgMarca;

	//adicionais
	JLabel lbOpcionais;
	
	JCheckBox ckAutomatico;
	JCheckBox ckPcd;
	JCheckBox ckArcondicionado;
	JCheckBox ckHidraulica;
	
	//botao
	JButton btEnviar;
	JButton btCancelar;
	
    JLabel imagemCarro;

	public FormsOrcamento() {
	
			Color cb = new Color(35, 51, 89);
			Color c = new Color(25, 46, 94);
			Color cbt = new Color(7, 16, 41);
			Color cbr= new Color(1, 13, 43);

			this.setTitle("Or�amento");
			this.setSize(900,600);
			this.setModal(true);
			this.setLocationRelativeTo(null);
			//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.getContentPane().setBackground(c);
	
			//nome
			
			lbNome = new JLabel();
			lbNome.setBounds(20,20,140,20);
			lbNome.setText("Digite seu nome:");
			lbNome.setForeground(Color.WHITE);

			add(lbNome);
			
			txNome = new JTextField();
			txNome.setBounds(20,40,140,20);
			add(txNome);
			
			//tel
			lbTel = new JLabel();
			lbTel.setBounds(180,20,140,20);
			lbTel.setText("Digite seu Telefone:");
			lbTel.setForeground(Color.WHITE);

			add(lbTel);
			
			txTel = new JTextField();
			txTel.setBounds(180,40,140,20);
			add(txTel);
			
			//email
			LdEmail = new JLabel();
			LdEmail.setBounds(340,20,140,20);
			LdEmail.setText("Digite seu Email:");
			LdEmail.setForeground(Color.WHITE);

			add(LdEmail);
			
			txEmail = new JTextField();
			txEmail.setBounds(340,40,140,20);
			add(txEmail);
			
			//marca
			lbMarca = new JLabel();
			lbMarca.setBounds(20,80,140,20);
			lbMarca.setText("Marca:");
			lbMarca.setForeground(Color.WHITE);

			add(lbMarca);
			
			rdTesla = new JRadioButton();
				rdTesla.setBounds(80,80,100,30);
				rdTesla.setText("Tesla");
				rdTesla.setForeground(Color.WHITE);
				rdTesla.setBackground(c);
				add(rdTesla);
			
			rdJeep = new JRadioButton();
				rdJeep.setBounds(180,80,100,20);
				rdJeep.setForeground(Color.WHITE);
				rdJeep.setText("Jeep");
				rdJeep.setBackground(c);
				add(rdJeep);
			
				
			rdFord = new JRadioButton();
				rdFord.setBounds(280,80,100,20);
				rdFord.setForeground(Color.WHITE);
				rdFord.setText("Ford");
				rdFord.setBackground(c);
				add(rdFord);
			
				
			bgMarca = new ButtonGroup();
		        bgMarca.add(rdTesla);
		        bgMarca.add(rdJeep);
		        bgMarca.add(rdFord);
				
			rdTesla.addActionListener(this);
			rdJeep.addActionListener(this);
			rdFord.addActionListener(this);
			

			//Modelo
				
			lbModelo = new JLabel();
			lbModelo.setBounds(20,120,140,20);
			lbModelo.setText("Modelo:");
			lbModelo.setForeground(Color.WHITE);

			add(lbModelo);
			
			Color cc = new Color(102, 107, 122);

			cbModelo = new JComboBox<>();
			cbModelo.setBounds(80,120,150,30);
			cbModelo.setBackground(cc);
			cbModelo.setForeground(Color.WHITE);
			add(cbModelo);

	        // cor 
	        lbCor = new JLabel();
			lbCor.setBounds(20,160,140,20);
			lbCor.setForeground(Color.WHITE);
			lbCor.setText("Cor:");
			add(lbCor);
			

			cbCor = new JComboBox();
			cbCor.setBounds(60,160,150,20);
			cbCor.setBackground(cc);
			cbCor.setForeground(Color.WHITE);

			cbCor.addItem("cor");
			cbCor.addItem("Preto");
			cbCor.addItem("Branco");
			cbCor.addItem("Cinza");
	
			add(cbCor);
			
			//opcionais
			lbOpcionais = new JLabel();
			lbOpcionais.setBounds(20,220,140,20);
			lbOpcionais.setText("Itens Opcionais:");
			lbOpcionais.setForeground(Color.WHITE);

			add(lbOpcionais);
			
			ckAutomatico = new JCheckBox();
			ckAutomatico.setBounds(120,220,100,20);
			ckAutomatico.setText("Automatico");
			ckAutomatico.setForeground(Color.WHITE);
			ckAutomatico.setBackground(c);
			add(ckAutomatico);
			
			ckArcondicionado = new JCheckBox();
			ckArcondicionado.setBounds(220,220,120,20);
			ckArcondicionado.setText("Ar-Condicionado");
			ckArcondicionado.setBackground(c);
			ckArcondicionado.setForeground(Color.WHITE);

			add(ckArcondicionado);
			
			ckHidraulica = new JCheckBox();
			ckHidraulica.setBounds(340,220,100,20);
			ckHidraulica.setText("Hidraulica");
			ckHidraulica.setBackground(c);
			ckHidraulica.setForeground(Color.WHITE);

			add(ckHidraulica);
			
			
		        	//imagem teste
			/* ImageIcon imagemIcon = new ImageIcon("../image/Model3-preto.png"); // Substitua pelo caminho da sua imagem
 			
	            JLabel imagemLabel = new JLabel(imagemIcon);
	            imagemLabel.setBounds(300,90,800,600);

	            add(imagemLabel);
 		
	            setVisible(true);*/
		            //	
			
		   btEnviar = new JButton();
			     btEnviar.setBounds(80,280,150,30);
			     btEnviar.setText("Enviar");
			     btEnviar.setBackground(cbt);
			     btEnviar.setForeground(Color.WHITE);
			     btEnviar.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, cbr));
				add(btEnviar);
				
			btCancelar= new JButton();
				btCancelar.setBounds(280,280,150,30);
				btCancelar.setText("Cancelar");
				btCancelar.setBackground(cbt);
				btCancelar.setForeground(Color.WHITE);
				btCancelar.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, cbr));
				add(btCancelar);
				
			imagemCarro = new JLabel();
		        imagemCarro.setBounds(450,80,800,600);
		        add(imagemCarro);

		       
				// botao cancelar
				btCancelar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
							setVisible(false);
						
					}
					
				});
					
					//botao para enviar
				
				btEnviar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
							String nome,tel,email,model="",cor = "",marca="",opcoes="";
						
						nome = txNome.getText();
						tel = txTel.getText();
						email = txEmail.getText();
	
						//modelo e cor
					model = cbModelo.getSelectedItem().toString();
						cor = cbCor.getSelectedItem().toString();
						
						
						//marca
						 if (rdTesla.isSelected()) {
							 
			                    marca = rdTesla.getText();
			                    if(cbModelo.getSelectedIndex()==1) {
			                    	model = "Tesla Model X";
			                    }
			              } else if (rdJeep.isSelected()) {
			                	
			                	marca = rdJeep.getText();
			                	if(cbModelo.getSelectedIndex()==2) {
			                    	model = "RENEGADE";
			                    }
			              } else if (rdFord.isSelected()) {
			                	
			                	marca = rdFord.getText();
			                	if(cbModelo.getSelectedIndex()==3) {
			                    	model = "Ford Bronco Sport";
			                    }
			                	
			              } 
			                
			                if(cbCor.getSelectedIndex()==1) {
				    			cor = "Preto";
				    		}
			                else if(cbCor.getSelectedIndex()==2) {
				    			cor = "Branco";
				    		}
			                else if(cbCor.getSelectedIndex()==3) {
				    			cor = "Cinza";
				    		}else {
				    			cor = "indefinida";
				    		}
			               			                
			                
			                
			                if (ckAutomatico.isSelected()) {
								 
			                	opcoes = opcoes+" "+ckAutomatico.getText();
			                }
			                if (ckPcd.isSelected()) {
								 
			                	opcoes = opcoes+" "+ckPcd.getText();
			                }
			                if (ckArcondicionado.isSelected()) {
								 
			                	opcoes = opcoes+" "+ckArcondicionado.getText();
			                }
			                if (ckHidraulica.isSelected()) {
								 
			                	opcoes = opcoes+" "+ckHidraulica.getText();
			                }
						
						JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nTelefone: "+tel+"\nEmail: "+email+"\nMarca: "+marca+
														"\nModelo: "+model+"\nCor: "+cor+"\nItens adicionais: "+opcoes+" ");
					}
					
					
				});
				
				
				//this.setVisible(true);
				 setLayout(null);
	}//fim construtor


	
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==rdTesla) {

				cbModelo.removeAllItems();
			
				
				cbModelo.addItem("Modelo");
				cbModelo.addItem("Tesla Model X");
				cbModelo.addItem("Model 3");
				cbModelo.addItem("Model Y");
				
				cbCor.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    String itemSelecionado = (String) cbModelo.getSelectedItem();

	                    //marca tesla modelo 1
	                    if("Tesla Model X".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
	                    	
	                    	
	                    	 ImageIcon imagem = new ImageIcon(getClass().getResource("image/teslaModelX-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("Tesla Model X".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/teslaModelX-Branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("Tesla Model X".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/teslaModelX-Cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                         //modelo 2   
		                }else if("Model 3".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Model3-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("Model 3".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Model3-branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("Model 3".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Model3-cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                            //modelo 3
		              }else if("Model Y".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
		                	
		                	ImageIcon imagem = new ImageIcon(getClass().getResource("image/ModelY-preto.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
		                	
		                }else if("Model Y".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                	
		                	ImageIcon imagem = new ImageIcon(getClass().getResource("image/ModelY-branco.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
		                	
		                }else if("Model Y".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                	
		                	ImageIcon imagem = new ImageIcon(getClass().getResource("image/ModelY-cinza.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
		                	
		                }
	                    
	                }
				});
		
				//mudando com modelo
				cbModelo.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    String itemSelecionado = (String) cbModelo.getSelectedItem();

	                    //marca tesla modelo 1
	                    if("Tesla Model X".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
	                    	
	                    	
	                    	 ImageIcon imagem = new ImageIcon(getClass().getResource("image/teslaModelX-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("Tesla Model X".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/teslaModelX-Branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("Tesla Model X".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/teslaModelX-Cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                         //modelo 2   
		                }else if("Model 3".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Model3-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("Model 3".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Model3-branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("Model 3".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Model3-cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                            //modelo 3
		              }else if("Model Y".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
		                	
		                	ImageIcon imagem = new ImageIcon(getClass().getResource("image/ModelY-preto.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
		                	
		                }else if("Model Y".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                	
		                	ImageIcon imagem = new ImageIcon(getClass().getResource("image/ModelY-branco.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
		                	
		                }else if("Model Y".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                	
		                	ImageIcon imagem = new ImageIcon(getClass().getResource("image/ModelY-cinza.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
		                	
		                }
	                    
	                }
				});
		        
				//jeep
			}else if(e.getSource()==rdJeep) {
				
				cbModelo.removeAllItems();
				
				cbModelo.addItem("Modelo");
				cbModelo.addItem("RENEGADE");
				cbModelo.addItem("COMPASS");
				cbModelo.addItem("COMMANDER");
				
				cbCor.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    String itemSelecionado = (String) cbModelo.getSelectedItem();
	                
	                    //marca jeep modelo 1
	                    if("RENEGADE".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
	                    	
	                    	
	                    	 ImageIcon imagem = new ImageIcon(getClass().getResource("image/RENEGADE-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("RENEGADE".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/RENEGADE-branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("RENEGADE".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/RENEGADE-cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                        
	                            //modelo 2   
	                            
		                }else if("COMPASS".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMPASS-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("COMPASS".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMPASS-branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("COMPASS".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMPASS-cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                            //modelo 3
		              }else if("COMMANDER".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMMANDER-preto.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
	                  }else if("COMMANDER".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMMANDER-branco.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
	                  }else if("COMMANDER".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMMANDER-cinzar.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
                            //modelo 3
	              }
	                    
	                }
				});
				
				//mudando modelos
				
				cbModelo.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    String itemSelecionado = (String) cbModelo.getSelectedItem();

	                    //marca tesla modelo 1
	                    if("RENEGADE".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
	                    	
	                    	
	                    	 ImageIcon imagem = new ImageIcon(getClass().getResource("image/RENEGADE-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("RENEGADE".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/RENEGADE-branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("RENEGADE".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/RENEGADE-cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                        
	                            //modelo 2   
	                            
		                }else if("COMPASS".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMPASS-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("COMPASS".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMPASS-branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("COMPASS".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMPASS-cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                            //modelo 3
		              }else if("COMMANDER".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMMANDER-preto.png"));
							imagemCarro.setIcon(imagem);
                           add(imagemCarro);
                           
                           setResizable(true);
	                  }else if("COMMANDER".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMMANDER-branco.png"));
							imagemCarro.setIcon(imagem);
                           add(imagemCarro);
                           
                           setResizable(true);
	                  }else if("COMMANDER".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/COMMANDER-cinzar.png"));
							imagemCarro.setIcon(imagem);
                           add(imagemCarro);
                           
                           setResizable(true);
                           //modelo 3
	                  	}
	                    
	                }
				});
				
				
			}else if(e.getSource()==rdFord) {
				
				cbModelo.removeAllItems();
				
				cbModelo.addItem("Modelo");
				cbModelo.addItem("Ford Bronco Sport");
				cbModelo.addItem("Ford EcoSport");
				cbModelo.addItem("Ford Fusion");

				
				cbCor.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    String itemSelecionado = (String) cbModelo.getSelectedItem();
	                
	                    if("Ford Bronco Sport".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
	                    	
	                    	
	                    	 ImageIcon imagem = new ImageIcon(getClass().getResource("image/BroncoSport-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("Ford Bronco Sport".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/BroncoSport-branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("Ford Bronco Sport".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/Bronco Sport-cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                        
	                            //modelo 2   
	                            
		                }else if("Ford EcoSport".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/EcoSport-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("Ford EcoSport".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/EcoSport-branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("Ford EcoSport".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/EcoSport-cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                            //modelo 3
		              }else if("Ford Fusion".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Fusion-preto.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
	                  }else if("Ford Fusion".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Fusion-branco.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
	                  }else if("Ford Fusion".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Fusion-cinza.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
                          
	              }
	                    
	                }
				});
				
				cbModelo.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    String itemSelecionado = (String) cbModelo.getSelectedItem();
	                
	                    if("Ford Bronco Sport".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
	                    	
	                    	
	                    	 ImageIcon imagem = new ImageIcon(getClass().getResource("image/BroncoSport-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("Ford Bronco Sport".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/BroncoSport-branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                    }else if("Ford Bronco Sport".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                    	
		                    	ImageIcon imagem = new ImageIcon(getClass().getResource("image/Bronco Sport-cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                        
	                            //modelo 2   
	                            
		                }else if("Ford EcoSport".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/EcoSport-preto.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("Ford EcoSport".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/EcoSport-branco.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
		                  }else if("Ford EcoSport".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
		                	  
		                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/EcoSport-cinza.png"));
								imagemCarro.setIcon(imagem);
	                            add(imagemCarro);
	                            
	                            setResizable(true);
	                            //modelo 3
		              }else if("Ford Fusion".equals(itemSelecionado) && cbCor.getSelectedIndex()==1) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Fusion-preto.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
	                  }else if("Ford Fusion".equals(itemSelecionado) && cbCor.getSelectedIndex()==2) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Fusion-branco.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
	                  }else if("Ford Fusion".equals(itemSelecionado) && cbCor.getSelectedIndex()==3) {
	                	  
	                	  ImageIcon imagem = new ImageIcon(getClass().getResource("image/Fusion-cinza.png"));
							imagemCarro.setIcon(imagem);
                            add(imagemCarro);
                            
                            setResizable(true);
                          
	              }
	                    
	                }
				});
			}
			
		
		}

	}


