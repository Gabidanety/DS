
package revisao;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double ha,am,sl,d,inss;
		
		System.out.println("Digite o valor da hora aula:");
		ha = in.nextDouble();
		System.out.println("Digite o numero de aula dadas no mes:");
		am = in.nextDouble();
		sl = am*ha;
		if(sl<=1212) {
			inss = sl-750/100;
		}else if(sl>1212.01 && sl<2427.35) {
			inss = sl - 900/100;
		}else if (sl>2427.36 && sl<3641.03) {
			inss = sl - 1200/100;
		}else if (sl>3641.04 && sl<7087.22) {
			inss = sl-1400/100;
		    
		}else if(sl>7087.23 && sl<12136.791) {
			inss = sl-1450/100;
			
		}else if(sl>12136.80 && sl<24273.57) {
			inss = sl-1650/100;
			
		}else if(sl>24273.58 && sl<47333.46) {
			inss = sl-1900/100;
			
		}else {
			inss = sl-2200/100;
		}
		
		System.out.println("O salario é:"+inss);
	}

}
