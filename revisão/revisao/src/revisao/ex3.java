package revisao;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
 
		final int TAM = 3;
	
		int n,i=0,r=0,a[];
		a = new int [TAM];
		
		System.out.println("Digite um numero de tres algarismo:");
		n = in.nextInt();

		while(i<TAM) {
			r = n%10;
			a[i] = r;
			n = n/10;
			i++;
		}
		System.out.print("O inverso e: ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}
