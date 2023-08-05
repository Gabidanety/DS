package potencia;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			Potencia po = new Potencia();
			int base,expoente;
			
			System.out.println("Digite a base: ");
			base = in.nextInt();
			System.out.println("Digite o expoente: ");
			expoente = in.nextInt();
			
			System.out.println("O resultado e :"+po.calculando(expoente, base));
			
	}

}
