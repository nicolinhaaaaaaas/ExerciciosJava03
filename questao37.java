package exercicio03;

import java.util.*;

public class generico {
	Scanner scanner = new Scanner(System.in);
	
	int nmr1;
	int nmr2;
	int nmr3;
	
	public generico(int nmr1, int nmr2, int nmr3){
		this.nmr1 = nmr1;
		this.nmr2 = nmr2;
		this.nmr3 = nmr3;
		comparar();
		
		scanner.close();
	}
	
	void comparar() {
		System.out.println("Voce escolheu o exercicio de comparacao");
		System.out.println("Insira 3 numeros");
		System.out.print("Primeiro numero: ");
		nmr1 = scanner.nextInt();
		System.out.print("Segundo numero: ");
		nmr2 = scanner.nextInt();
		System.out.print("Terceiro numero: ");
		nmr3 = scanner.nextInt();
		
		imprime();
		
		if(nmr1 == nmr2 ) {
			if(nmr1 == nmr3) {
				System.out.println("Os numeros "+nmr1+", "+nmr2+" e "+nmr3+" sao iguais.");
			} else {
				System.out.println("Os numeros "+nmr1+" e "+nmr2+" sao iguais.");
			}
			
		} else if(nmr1 == nmr3) {
			if(nmr1 == nmr2) {
				System.out.println("Os numeros "+nmr1+", "+nmr2+" e "+nmr3+" sao iguais.");
			} else {
				System.out.println("Os numeros "+nmr1+" e "+nmr3+ " sao iguais");
			}
		}
	}
	
	
	
	void imprime() {
		System.out.println("Voce escolheu os numeros: "+nmr1+", "+nmr2+" e "+nmr3);
	}
	
	
	
}
