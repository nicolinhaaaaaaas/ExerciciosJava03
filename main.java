import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		int opcao2 = 0;
		
		time flamengo = new time();

    //pretendo utilizar esse main para acessar todos os exercicios que eu fizer
		
		System.out.print("Bom dia, qual exercicio/classe deseja acessar? (28 pra frente) ");
		opcao = scanner.nextInt();
		
		switch(opcao) {
		case 28:
			System.out.println("Voce escolheu o exercicio sobre time de futebol, o que deseja fazer?");
			System.out.print("(1)- Jogar ; (2)- Apostar ; (3)- Jogadores ");
			opcao2 = scanner.nextInt();
			
			if(opcao2 == 1) {
				flamengo.jogar();
			} else if(opcao2 == 2) {
				flamengo.aposta();
			} else if(opcao2 == 3) {
				flamengo.jogadores();
			} else {
				System.out.println("Opcao invalida");
			}
		break;
		
		
		default:
			System.out.println("Opcao invalida");
		}
		
	}

}
