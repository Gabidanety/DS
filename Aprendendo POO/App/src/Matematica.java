	import java.util.Scanner;

public class Matematica {
	
						
			//Atributos
			public int resultado;
			public int numero1;
			public int numero2;
			
			//metodos
			public void lerNumero() {
				Scanner sc = new Scanner (System.in);
				
				System.out.println(" Digite o primeiro numero para operacao que deseja:");
				 numero1 = sc.nextInt();
				 System.out.println(" Digite o segundo numero para operacao que deseja:");
				 numero2 = sc.nextInt();

			}
			
			 public void fazerSoma(){
				lerNumero();
				
				resultado = numero1+numero2;
				 System.out.println(numero1+" + "+numero2+" = "+resultado);
			 }
			public void fazerSubtracao(){
				lerNumero();

				 resultado = numero1-numero2;
				 System.out.println(numero1+" - "+numero2+" = "+resultado);

			}
			public void fazerMultiplicacao(){
				lerNumero();

				resultado = numero1*numero2;
				 System.out.println(numero1+" x "+numero2+" = "+resultado);

			}
			public void fazerDivisao(){
				lerNumero();

				 resultado = numero1/numero2;
				 System.out.println(numero1+" / "+numero2+" = "+resultado);

			}
		
			

	
	
}
