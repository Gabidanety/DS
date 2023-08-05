package tabuada;

public class Tabuada {

	public int n;
	public int inter;
	public int result;
	public int i;
	public int j;

	
	public void calculando(int numero , int intervalo ){
		n = numero;
		inter = intervalo;
		
		do {
			
			for(i=0;i<=10;i++) {
				result =numero*i;
				System.out.println(numero+"x"+i+"="+result);
			}
	
				numero++;
				System.out.println(" ");
		}while (numero<=inter);
		
		
	}
}
