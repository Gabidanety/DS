package revisao;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		final int TAM = 10;
		
		int i,a[],b[],c[];
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];

		for(i=0;i<TAM;i++) {
			System.out.println("Digite o numero do "+(i+1)+" vetor A:");
				a[i] = in.nextInt();
		}
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o numero do "+(i+1)+" vetor B:");
			b[i] = in.nextInt();
		}
		for(i=0;i<TAM;i++) {
		c[i] = a[i] + b[i];
		}
		
		System.out.print("A=[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("] ");
		
		System.out.println(" ");
		
		System.out.print("B=[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("] ");
		
		System.out.println(" ");

		System.out.print("C=[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("] ");


	}

}
