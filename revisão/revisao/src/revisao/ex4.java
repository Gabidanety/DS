package revisao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
			
		//p = custo
		//m = margem de lucro
		//pv = preco de venda
		int i=1,r;
		double p,m,pv;
		
		do {
		System.out.println("Digite o preco do produto:");
			p = in.nextDouble();
		System.out.println("Digite a margem de lucro:");
			m = in.nextDouble();
			pv = ((m/100)*p)+p;
		System.out.println("O preco de venda e: "+pv);
		
		System.out.println("Deseja continuar? sim=1 nao=2 ");
	
		r = in.nextInt();
	
			if(r<2) {
				i=i+0;
			}else {
				i++;
			}
			
		}while(i<2);
	}
	
	
}
