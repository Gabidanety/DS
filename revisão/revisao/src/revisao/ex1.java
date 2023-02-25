package revisao;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int b,h,a,p,i;
		
		System.out.println("Digite a base:");
		b = in.nextInt();
		System.out.println(" Digite a altura:");
		h = in.nextInt();
		a = b*h;
		System.out.println("A Area é: "+a);
		p = b*2+h*2;
		System.out.println(" O perimetro é: "+p);
		
	}

}
