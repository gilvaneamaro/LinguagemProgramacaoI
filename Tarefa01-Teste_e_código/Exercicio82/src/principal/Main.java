// Ler  um  vetor  A  de  10  números.  Após,  ler  mais  um  número  e  guardar  em  uma  variável  X.
// Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X.
// Logo após, imprimir o vetor M. 

package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] vectA = new Integer[10];
		Integer[] vectM = new Integer[10];
		int x;
		
		for (int i = 0; i<vectA.length; i++) {
	
			System.out.println("Insira o " + (i + 1) +"º valor: ");
			vectA[i] = sc.nextInt();
			sc.nextLine();		
		}
		
		System.out.println("Insira o valor de X:");
		x = sc.nextInt();
		sc.nextLine();
		
		for(int i =0; i < vectM.length; i++) {
			vectM[i] = vectA[i] * x;	
			
		}
		
		System.out.println("Os valores do vetor A multiplicado por " + x + " serão:" );
		for(int i =0; i < vectM.length; i++) {
				System.out.print(vectM[i] + " ");		
		}		
		
		
		sc.close();
		

	}

}
