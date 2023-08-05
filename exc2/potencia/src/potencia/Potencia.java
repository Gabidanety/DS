package potencia;

public class Potencia {
		public int b;
		public int expo;
		public int i;
		public int result;
		public int num ;
		
		
		public int calculando(int expoente, int base) {
			expo = expoente;
			b = base;
			
			if(expo==0) {
				result = 1;
				return result;
			} else if (expo==1) {
				result = base;
				return result;

			}else {
				num = base;
				for(i=1;i<expo;i++) {
					result = base * num;
					num =result;
				}
				return result;
			
			}
			
			
			
		}
		
}
