package exercicio03;
import java.util.*;

public class Contador {

	Scanner scanner = new Scanner(System.in);
	
	private int valor;
	int opcao2;
	
	Contador(){
		
		while(true) {
			escolhas();
			opcao2 = scanner.nextInt();
			
			switch(opcao2) {
			case 1:
				incrementar();
			break;
			
			case 2: 
				decrementar();
			break;
			
			case 3:
				imprimir(this.valor);
			break;
			
			case 4:
				zerar();
			break;
			
			case 0:
				return;
			
			default:
				System.out.println("Opcao invalida");
			break;
			
			}
		}
	}
	
	void escolhas(){
		System.out.println("Voce escolheu a classe sobre contador. o que deseja fazer: ");
		System.out.println("(1)- incrementar ; (2)- Decrementar ; (3)- Imprimir ; (4)- Zerar ; (0)- Sair");
	}
	
	void zerar() {
		this.valor = 0;
		System.out.println("Voce zerou o contador");
		System.out.println("");
	}
	
	void incrementar() {
		this.valor++;
		System.out.println("Voce acrescentou +1 no contador");
		System.out.println("");
	}
	
	void decrementar() {
		this.valor--;
		System.out.println("Voce decrementou -1 no contador");
		System.out.println("");
	}
	
	void imprimir(int valor) {
		System.out.println("Valor no contador: "+this.valor);
		System.out.println("");
	}
}
