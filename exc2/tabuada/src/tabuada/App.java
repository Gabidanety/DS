package tabuada;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class App {

	public static void main(String[] args) {
		
		Tabuada tab = new Tabuada();
			Scanner in =new Scanner (System.in);
			
			int numero,intervalo;
			
			System.out.println("Digite o numero da tabua que deseja: ");
				numero = in.nextInt();
			System.out.println("Digite ate onde deseja que a tabuada va: ");
				intervalo = in.nextInt();
			
			tab.calculando(numero,intervalo);
			System.out.println();

	}

}
