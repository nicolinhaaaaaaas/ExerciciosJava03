import java.util.*;

public class Lampada {
	Scanner scanner = new Scanner(System.in);
	int opcao2 = 0;
	
	String estadoDaLampada;
	boolean lampada = false;
	String escolha;
	int escolha2 = 0;
	int contar = 0;
	int vezes = 0;
	
	Lampada(){
		
		while(true) {
			escolhas();
			opcao2 = scanner.nextInt();
			
			switch(opcao2) {
				case 1:
					acende();
				break;
				
				case 2:
					apaga();
				break;
				
				case 3:
					mostraEstado();
				break;
				
				case 4:
					estaLigada();
				break;
				
				case 5:
					contador();
				break;
				
				case 0:
					System.out.println("Encerrando o programa...");
				return;
				
				default:
					System.out.println("Opcao invalida.");
				break;
					
			}
		}
	}
	
	void escolhas() {
		System.out.println("Voce escolheu o exercicio sobre o LAMPADA, o que deseja fazer?");
		System.out.print("(1)- Acender ; (2)- Apagar ; (3)- Mostrar o estado ; (4)- V ou F ; (5)- Contador ; (0)-SAIR ");
		System.out.println("");
	}
	
	void acende() {
		System.out.print("Deseja acender a lampada? ");
		escolha = scanner.next();
		if(escolha != "não") {
			if(lampada != true) {
				lampada = true;
				System.out.println("Voce acendeu a lampada!");
				contar++;
			}
			else {
				System.out.println("A lampada ja esta acesa.");
			}
		}
		System.out.println("");
	}
	
	void apaga() {
		System.out.print("Deseja apagar a lampada? ");
		escolha = scanner.next();
		if(escolha != "não") {
			if(lampada != false) {
				lampada = false;
				System.out.println("Voce apagou a lampada!");
			}
			else {
				System.out.println("A lampada ja esta apagada.");
			}
		}
		System.out.println("");
	}
	
	void mostraEstado() {
		if(lampada == true) {
			System.out.println("A lampada esta acesa!");
		}
		else {
			System.out.println("A lampada esta apagada!");
		}
		System.out.println("");
	}
	
	void estaLigada() {
		System.out.println(lampada);
	}
	
	void contador() {
		System.out.println("A lampada foi acesa "+contar+" vezes.");
		
		System.out.println("O que deseja fazer? (1)- incrementar ; (2)- zerar ; (0)- nada");
		escolha2 = scanner.nextInt();
		
		if(escolha2 == 1) {
			System.out.print("Quantas vezes deseja acender a lampada? ");
			vezes = scanner.nextInt();
			contar = contar+vezes;
		} else if(escolha2 == 2) {
			contar = 0;
			System.out.println("Voce zerou o contador.");
		} else if(escolha2 == 0) {
			System.out.println("Ok");
		} else {
			System.out.println("Opcao invalida.");
		}
		System.out.println("");
	}
}
