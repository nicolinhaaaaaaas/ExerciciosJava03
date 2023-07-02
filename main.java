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

		//não sei se é assim que faz, provavelmente é, mas não sei se gostei
		case 30:
			Aluno aluno = new Aluno(opcao2, null, opcao2, opcao2, opcao2);
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
