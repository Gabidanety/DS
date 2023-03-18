import java.util.Scanner;

public class LendoOperacao {
		
	//Atributos 
	
	public String Res; 

	public void EscolhaOperacao(){
		Matematica mat = new Matematica();
		Scanner sc = new Scanner (System.in);	
			
		System.out.println("qual conta vc desej a fazer?(adicao,subtracao,multiplicacao ou divisao)");

		Res = sc.next();
				
			if(Res.equalsIgnoreCase("Adicao")){
					mat.fazerSoma();
				}else if (Res.equalsIgnoreCase("Subtracao")) {
					mat.fazerSubtracao();
				}else if (Res.equalsIgnoreCase("Multiplicacao")) {
					mat.fazerMultiplicacao();

				}else {
					mat.fazerDivisao();
				}
		

	}

}
