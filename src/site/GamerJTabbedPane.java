package site;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;

public class GamerJTabbedPane extends JDialog {

    private JLabel lbNome;
    private JTextField txNome;
    
    private JLabel lbNome2;
    private JTextField txNome2;
    
    private JButton btCadastra;
    private JButton btCadastra2;
    private JButton btCancelar;
    
    private JLabel lbLetra;
    private JLabel lbLetra2;
    
    private JLabel lbJg1;
    private JLabel lbJg2;
    
    private JLabel lbpy1;
    private JLabel lbpy2;

    private JRadioButton rdX;
    private	JRadioButton rdO;
    
    private JRadioButton rdX2;
    private	JRadioButton rdO2;
	
    private ButtonGroup bgXO;
    private ButtonGroup bgXO2;

    private String letra;
    
    
    private String player1=null;
    private String player2=null;
    
    private String nomeJ1;
    private String nomeJ2;

    //jogo da velha
    private static final long serialVersionUID = 1L;
	JButton[][] bt = new JButton[3][3];
	
	JLabel pontosX = new JLabel ("X: 0");
	JLabel pontosO = new JLabel ("O: 0");
	int PX = 0;
	int PO = 0;
	String xo = "X";
	boolean[][] click = new boolean[3][3];
	String ganhador;

	//contrutor
    public GamerJTabbedPane() {
        Color c = new Color(133, 152, 204); // cor de fundo

        this.setTitle("Jogo da Velha");
        this.setSize(500, 470);
        this.setModal(true);
        this.setResizable(false);

        // Abas
        Container janelacalc = this.getContentPane();
        setLocationRelativeTo(janelacalc);
        janelacalc.setLayout(null);
        janelacalc.setBackground(c);

        JTabbedPane tabbedpane = new JTabbedPane();

        tabbedpane.setBounds(0, 0, 500, 470);

        //jogador 1 
        Color cp1 = new Color(99, 128, 143); // cor do painel 1

        JPanel painel1 = new JPanel();
        painel1.setBackground(cp1);
        painel1.setLayout(null);
        
        lbJg1 = new JLabel("PLAYER 1");
        lbJg1.setFont(new Font("Arial", Font.BOLD,15));
        lbJg1.setBounds(200, 10, 200, 20);
        lbJg1.setForeground(Color.WHITE);

        painel1.add(lbJg1);


        lbNome = new JLabel("Apelido: ");
        lbNome.setBounds(15, 40, 100, 20);
        lbNome.setForeground(Color.WHITE);
        painel1.add(lbNome);

        txNome = new JTextField();
        txNome.setBounds(70, 45, 100, 15); 
		txNome.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        painel1.add(txNome);
        
        lbLetra = new JLabel("Escolha: ");
        lbLetra.setBounds(15, 80, 80, 20);
        lbLetra.setForeground(Color.WHITE);
        painel1.add(lbLetra);
        
        rdX = new JRadioButton();
        rdX.setBounds(70,80,50,20);
        rdX.setText("X");
        rdX.setForeground(Color.WHITE);
        rdX.setBackground(cp1);
        painel1.add(rdX);
	
		rdO = new JRadioButton();
		rdO.setBounds(130,80,50,20);
		rdO.setForeground(Color.WHITE);
		rdO.setText("O");
		rdO.setBackground(cp1);
		 painel1.add(rdO);
		 
		 bgXO = new ButtonGroup();
		 bgXO.add(rdO);
		 bgXO.add(rdX);

		 Color cb =new Color (182, 203, 214);//cor butao
		 
        btCadastra = new JButton("CADASTRAR");
        btCadastra.setBounds(15, 130, 100, 25);
        btCadastra.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        btCadastra.setBackground(cb);
        painel1.add(btCadastra);
        
        btCancelar = new JButton("CANCELAR");
        btCancelar.setBounds(130, 130, 100, 25);
        btCancelar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        btCancelar.setBackground(cb);
        painel1.add(btCancelar);

        btCadastra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               String nome=" ";
               
               nome = txNome.getText();
                txNome.setEditable(false);
                rdX.setEnabled(false);
                rdO.setEnabled(false);
                btCadastra.setEnabled(false);

                if (rdX.isSelected()) {
					 
                    letra = rdX.getText();
                    
              } else if (rdO.isSelected()) {
                	
                	letra = rdO.getText();
                	
              }
                player1=letra;
                nomeJ1 = nome;
                JOptionPane.showMessageDialog(null, "Nome: " +nome +"\nJogador 1: "+letra);

            }
        });
        
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               
               setVisible(false);
            }
        });
 
        tabbedpane.addTab("Jogador 1", null, painel1, "primeiro painel");

        //aba 2 jogador 2
        Color cp2 = new Color(108, 99, 143); //cor do painel 2
        
        JPanel painel2 = new JPanel();
        painel2.setBackground(cp2);
        painel2.setLayout(null);

        
        lbJg2 = new JLabel("PLAYER 2");
        lbJg2.setBounds(200, 10, 100, 20);
        lbJg2.setFont(new Font("Arial", Font.BOLD,15));
        lbJg2.setForeground(Color.WHITE);
        painel2.add(lbJg2);


        lbNome2 = new JLabel("Apelido: ");
        lbNome2.setBounds(15, 40, 100, 20);
        lbNome2.setForeground(Color.WHITE);
        painel2.add(lbNome2);

        txNome2 = new JTextField();
        txNome2.setBounds(70, 45, 100, 15); 
		txNome2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        painel2.add(txNome2);
        
        lbLetra2 = new JLabel("Escolha: ");
        lbLetra2.setBounds(15, 80, 80, 20);
        lbLetra2.setForeground(Color.WHITE);
        painel2.add(lbLetra2);
        
        rdX2 = new JRadioButton();
        rdX2.setBounds(70,80,50,20);
        rdX2.setText("X");
        rdX2.setForeground(Color.WHITE);
        rdX2.setBackground(cp2);
        painel2.add(rdX2);
	
		rdO2 = new JRadioButton();
		rdO2.setBounds(130,80,50,20);
		rdO2.setForeground(Color.WHITE);
		rdO2.setText("O");
		rdO2.setBackground(cp2);
		painel2.add(rdO2);

		 bgXO2 = new ButtonGroup();
		 bgXO2.add(rdO2);
		 bgXO2.add(rdX2);

		 Color cb2 =new Color (194, 182, 214);//cor butao
		 
		 btCadastra2 = new JButton("CADASTRAR");
	        btCadastra2.setBounds(15, 130, 100, 25);
	        btCadastra2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
	        btCadastra2.setBackground(cb2);
	        painel2.add(btCadastra2);
	        
	        btCancelar = new JButton("CANCELAR");
	        btCancelar.setBounds(130, 130, 100, 25);
	        btCancelar.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
	        btCancelar.setBackground(cb2);
	        painel2.add(btCancelar);
        
       btCadastra2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               String letra2 = " ",nome2=" ";
               
               nome2 = txNome2.getText();
                txNome2.setEditable(false);
                rdX2.setEnabled(false);
                rdO2.setEnabled(false);
                btCadastra2.setEnabled(false);


                if(letra == rdX.getText()  ) {
                	letra2 = "O";
                }else if(letra == rdO.getText()) {
                	letra2 = "X";
                }
                
                player2=letra2;
                nomeJ2 = nome2;

                JOptionPane.showMessageDialog(null, "Nome: " +nome2 +"\nJogador 2: "+letra2);

            }
        });
        
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               
               setVisible(false);
            }
        });
        
        tabbedpane.addTab("Jogador 2", null, painel2, "Segundo painel");

        
        
        //aba 3 jogo
		 Color cp3 =new Color (143, 99, 111);//cor de fundo painel 3

        JPanel painel3 = new JPanel();
        painel3.setBackground(cp3);

        painel3.setLayout(null);

       //jogo da velha
		 Color cb3 =new Color (214, 182, 185);//cor butoes

		JButton novo = new JButton("Novo Jogo");
        novo.setBounds(350, 100, 120, 30);
        novo.setForeground(Color.WHITE);
        novo.setBorder(BorderFactory.createMatteBorder(2, 3, 3, 2, Color.WHITE));
        novo.setBackground(cb3);
        painel3.add(novo);
        
    	JButton zerar = new JButton("Zerar");
        zerar.setBounds(350, 140, 120, 30);
        zerar.setForeground(Color.WHITE);
        zerar.setBorder(BorderFactory.createMatteBorder(2, 3, 3, 2, Color.WHITE));
        zerar.setBackground(cb3);
        painel3.add(zerar);
        
    	JLabel placar = new JLabel ("Placar");
        placar.setBounds(390, 40, 100, 30);
        placar.setForeground(Color.WHITE);
        painel3.add(placar);
        
        pontosX.setBounds(380, 65, 100, 30);
        pontosX.setForeground(Color.WHITE);
        painel3.add(pontosX);
        
        pontosO.setBounds(420, 65, 100, 30);
        pontosO.setForeground(Color.WHITE);
        painel3.add(pontosO);
       
        btCancelar = new JButton("Voltar ao Menu");
        btCancelar.setBounds(350, 180, 120, 30);
        btCancelar.setBorder(BorderFactory.createMatteBorder(2, 3, 3, 2, Color.WHITE));
        btCancelar.setForeground(Color.WHITE);
        btCancelar.setBackground(cb3);
        painel3.add(btCancelar);
        
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               
               setVisible(false);
            }
        });
        
		novo.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				limpar();
			}
		});
		
		zerar.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				PO = 0;
				PX = 0;
				atualizar ();
			}
		});
   
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j++) {
				bt[i][j] = new JButton();
				bt [i][j].setBounds((100 * i)+ 20, (100 * j) + 25, 100,100);
				bt[i][j].setFont(new Font("Arial", Font.BOLD,40));
				bt[i][j].setBackground(cp3);
				 painel3.add (bt[i][j]);
			}

		}
		
		bt[0][0].setBorder(BorderFactory.createMatteBorder(0, 0, 5, 5, cb3));
		bt[0][1].setBorder(BorderFactory.createMatteBorder(5, 0, 5, 5, cb3));
		bt[0][2].setBorder(BorderFactory.createMatteBorder(5, 0, 0, 5, cb3));
		bt[1][0].setBorder(BorderFactory.createMatteBorder(0, 5, 5, 5, cb3));
		bt[1][1].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, cb3));
		bt[1][2].setBorder(BorderFactory.createMatteBorder(5, 5, 0, 5, cb3));
		bt[2][0].setBorder(BorderFactory.createMatteBorder(0, 5, 5, 0, cb3));
		bt[2][1].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 0, cb3));
		bt[2][2].setBorder(BorderFactory.createMatteBorder(5, 5, 0, 0, cb3));
				
		

			bt[0][0].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
			
					click[0][0] = true;
					mudar (bt[0][0]);

				
			}
		});
		
			bt[0][1].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
					click[0][1] = true;
				
				
				mudar (bt[0][1]);

			}
		});
		
			bt[0][2].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
			
					click[0][2] = true;
				
				mudar (bt[0][2]);
			}
		});
		
			bt[1][0].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
		
					click[1][0] = true;
				
				mudar (bt[1][0]);

			}
		});
		
			bt[1][1].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
					click[1][1] = true;
					
				
				mudar (bt[1][1]);
			}
		});
		
			bt[1][2].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
					click[1][2] = true;
					
				
				mudar (bt[1][2]);
			}
		});
		
		bt[2][0].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
			
					click[2][0] = true;
					
				
				mudar (bt[2][0]);
			}
		});
		
		bt[2][1].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				
					click[2][1] = true;
					
				
				mudar (bt[2][1]);
			}
		});
		
		bt[2][2].addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
			
					click[2][2] = true;
					
				
				mudar (bt[2][2]);
			}
		});

        //
        
        tabbedpane.addTab("Game", null, painel3, "terceiro painel");

        janelacalc.add(tabbedpane);

		}   // Fim das abas

    // fim do construtor

    public void mudar(JButton btn) {
		if(xo=="O") {
			btn.setText("O");
			xo = "X";
		}else {
			btn.setText("X");
			
			xo = "O";
		}
		btn.setEnabled(false);
	
		ganhou();
		
	}
    
    public void atualizar() {
		pontosX.setText("X " + PX);
		pontosO.setText("O " + PO);
	
	}
    
    public void ganhou() {
   
    	int linha=0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (click[i][j] == true) {
					linha++;
				}
				
		}
	}
		if(player2==null || player1==null) {
			JOptionPane.showMessageDialog(null, "Nao e possivel continuar sem cadastro");	

		}

			if(bt[2][0].getText() == "X"&& bt[2][1].getText() == "X"&& bt[2][2].getText() == "X" ||//verifica linha
				bt[1][0].getText() == "X"&& bt[1][1].getText() == "X"&& bt[1][2].getText() == "X"
				|| bt[0][0].getText() == "X"&& bt[0][1].getText() == "X"&& bt[0][2].getText() == "X" || 
				
				bt[0][2].getText() == "X"&& bt[1][2].getText() == "X"&& bt[2][2].getText() == "X" ||//verifica coluna
				bt[0][1].getText() == "X"&& bt[1][1].getText() == "X"&& bt[2][1].getText() == "X"
				|| bt[0][0].getText() == "X"&& bt[1][0].getText() == "X"&& bt[2][0].getText() == "X" ||
				
				bt [0][0].getText() == "X" && bt [1][1].getText() == "X" && bt [2][2].getText() == "X" || //verifica vertical
				bt [0][2].getText() == "X" && bt [1][1].getText() == "X"&& bt [2][0].getText() == "X") {
						
						if(player1.equalsIgnoreCase("X")) {
							JOptionPane.showMessageDialog(null, txNome.getText()+" ganhou!!");	
						}else if(player2.equalsIgnoreCase("X")){
							JOptionPane.showMessageDialog(null, txNome2.getText()+" ganhou!!");	
						}
						ganhador = "x";
						PX++;
						atualizar();
						limpar();
					
				}else if(bt[2][0].getText() == "O"&& bt[2][1].getText() == "O"&& bt[2][2].getText() == "O" || //verifica linha
						bt[1][0].getText() == "O"&& bt[1][1].getText() == "O"&& bt[1][2].getText() == "O"
						|| bt[0][0].getText() == "O"&& bt[0][1].getText() == "O"&& bt[0][2].getText() == "O" ||
				
						bt[0][2].getText() == "O"&& bt[1][2].getText() == "O"&& bt[2][2].getText() == "O" ||//verifica coluna
						bt[0][1].getText() == "O"&& bt[1][1].getText() == "O"&& bt[2][1].getText() == "O"
						|| bt[0][0].getText() == "O"&& bt[1][0].getText() == "O"&& bt[2][0].getText() == "O" ||
						
						bt [0][0].getText() == "O" && bt [1][1].getText() == "O" && bt [2][2].getText() == "O" ||  //verifica vertical
						bt [0][2].getText() == "O" && bt [1][1].getText() == "O" && bt [2][0].getText() == "O"){
					
							if(player1.equalsIgnoreCase("O")) {
								JOptionPane.showMessageDialog(null, txNome.getText()+" ganhou!!");	
							}else if(player2.equalsIgnoreCase("O")){
								JOptionPane.showMessageDialog(null, txNome2.getText()+" ganhou!!");	
		
							}
							
							ganhador = "o";
							PO++;
							atualizar();
							limpar();
					//empate
				}else if(linha==9){
					JOptionPane.showMessageDialog(null, "Empate!!");	
					limpar();
				}
	}
    
    public void limpar () {
    
		for (int i = 0; i <3; i ++) {
			for(int j=0;j<3;j++) {
				bt[i][j].setEnabled(true);
				bt[i][j].setText("");
				click[i][j] = false;
				
			}
			if(ganhador.equalsIgnoreCase("x")) {
				xo = "X";
			}else {
				xo = "O";
			}
			
			
		}
	}
}
