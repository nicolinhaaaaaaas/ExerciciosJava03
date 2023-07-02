import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		int opcao2 = 0;
		
		
		
		System.out.print("Bom dia, qual exercicio/classe deseja acessar? (28 pra frente) ");
		opcao = scanner.nextInt();
		
		switch(opcao) {
		case 28:
			time flamengo = new time();
		break;
		
		case 31:
			Elevador elevador = new Elevador();
		break;
		
		case 33:
			Lampada lampada = new Lampada();
		break;
		
		
		default:
			System.out.println("Opcao invalida");
		}
		
	}

}
