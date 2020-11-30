
public class BubbleSort {
		
	public static void main(String[] args) {
				
		int [] vet = {9,10,4,5,2};
		int aux = 0;
		int i = 0;
		
		
		System.out.println("Vetor desordenado: ");
		for (i = 0; i<5;i++) {
			System.out.println("" + vet[i]);			
		}
		
		System.out.println(" ");
		
		for(i=0;i<5;i++) {
			for(int j = 0; j<4;j++) {
				if(vet[j] > vet[j+1]) {
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}		
		
		System.out.println("Vetor Organizado: ");
		for(i = 0; i<5;i++) {
			System.out.println("" + vet[i]);
		}
		
	}
	
	

}
