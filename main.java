import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		int opcao2 = 0;
		
		
		
		// eu queria fazer com que pudesse logo escolher qual classe eu quero usar, mas acho que não tem como
		
		System.out.print("Bom dia, qual exercicio/classe deseja acessar? (28 pra frente) ");
		opcao = scanner.nextInt();
		
		switch(opcao) {
		case 28:
			time flamengo = new time();
		break;
		
		case 31:
			Elevador elevador = new Elevador();
		break;
		
		
		default:
			System.out.println("Opcao invalida");
		}
		
	}

}
