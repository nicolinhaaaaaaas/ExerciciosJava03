package exercicio03;
import java.util.*;

public class matriz {

	Scanner scanner = new Scanner(System.in);
	
	float[][] matriz = new float[2][2];
	
	float valor1, valor2, valor3, valor4;
	float det1, det2, detFinal;
	int opcao;
	
	matriz() {
		while(true) {
			escolhas();
			
			opcao = scanner.nextInt();
			switch(opcao) {
			case 1:
				inserir();
			break;
			case 2:
				determinante();
			break;
			case 3:
				impressao();
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
		System.out.println("Voce escolheu a tarefa 39, o que deseja fazer: ");
		System.out.println("(1)- Inserir os valors ; (2)- Calcular a determinante ; (3)- Imprimir a matriz ; (0)- Sair.");
	}
	
	void inserir() {
		System.out.print("Insira o primeiro valor: ");
		valor1 = scanner.nextFloat();
		matriz [0][0] = valor1;
		System.out.print("Insira o segundo valor: ");
		valor2 = scanner.nextFloat();
		matriz [0][1] = valor2;
		System.out.print("Insira o terceiro valor: ");
		valor3 = scanner.nextFloat();
		matriz [1][0] = valor3;
		System.out.print("Insira o quarto valor: ");
		valor4 = scanner.nextFloat();
		matriz [1][1] = valor4;
	}
	
	void determinante() {
		if(matriz != null) {
			det1 = matriz[0][0] * matriz[1][1];
			det2 = matriz[0][1] * matriz[1][0];
			
			detFinal = det1 - det2;
			System.out.println("A determinante eh: "+detFinal);
		}
	}
	
	void impressao() {
		System.out.println(valor1+" | "+valor2);
		System.out.println("");
		System.out.println(valor3+" | "+valor4);
	}
}
