import java.util.*;
public class Elevador {
	Scanner scanner = new Scanner(System.in);
	int opcao = 0;
	int opcao2 = 0;

	int andar =0;
	int totalAndar = 35;
	int capacidade = 12;
	int presentes = 0;
	
	String escolha;
	
	
	Elevador(){
		
		while (true) {
			escolhas();
			opcao2 = scanner.nextInt();
			
			switch(opcao2) {
			case 1:
				construtor();
			break;
			
			case 2:
				entra();
			break;
			
			case 3:
				sai();
			break;
			
			case 4:
				sobe();
			break;
			
			case 5:
				desce();
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
			
		System.out.println("Voce escolheu o exercicio sobre o ELEVADOR, o que deseja fazer?");
		System.out.print("(1)- Construtor ; (2)- Entrar ; (3)- Sair ; (4)- Subir ; (5)- Descer ; (0)-SAIR ");
	}

  //Tô tendo dificuldade em fazer os métodos funcionarem, mas dps eu arrumo
	
	void construtor() {
		System.out.println("O elevador tem a capacidade de suportar "+capacidade+" pessoas.");
		System.out.println("O predio tem o total de "+totalAndar+" andares");
	}
	
	void entra() {
		System.out.println("O elevador possui "+presentes+" pessoas presentes.");
		System.out.print("Deseja que uma pessoa ENTRE no elevador? ");
		escolha = scanner.next();
		while(escolha != "nao") {
			if(presentes <= capacidade) {
				System.out.println("Mais uma pessoa entrou no elevador.");
				presentes++;
			} else {
				System.out.println("O elevador esta lotado.");
			}
		}
	}
	
	void sai() {
		System.out.println("O elevador possui "+presentes+" pessoas presentes.");
		System.out.print("Deseja que uma pessoa SAIA do elevador? ");
		escolha = scanner.next();
		while(escolha != "nao") {
			if(presentes != 0) {
				System.out.println("Uma pessoa saiu do elevador.");
				presentes--;
			} else {
				System.out.println("Nao tem ninguem no elevador.");
			}
		}
	}
	
	void sobe() {
		System.out.println("O elevador esta no andar "+andar);
		System.out.print("Deseja SUBIR um andar? ");
		escolha = scanner.next();
		while(escolha != "nao") {
			if(andar < totalAndar) {
				andar++;
				System.out.println("Voce subiu para o andar "+andar);
			} else {
				System.out.println("Voce esta no ultimo andar, nao eh possivel subir mais.");
			}
		}
	}
	
	void desce() {
		System.out.println("O elevador esta no andar "+andar);
		System.out.print("Deseja DESCER um andar? ");
		escolha = scanner.next();
		while(escolha != "nao") {
			if(andar > 0) {
				andar--;
				System.out.println("Voce desceu para o andar "+andar);
			} else {
				System.out.println("Voce esta no terreo, nao eh possivel descer mais.");
			}
		}
	}
}
