package exercicio03;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		int opcao2 = 0;
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		
		
		System.out.print("Bom dia, qual exercicio/classe deseja acessar? (28 pra frente) ");
		opcao = scanner.nextInt();
		
		switch(opcao) {
		case 28:
			time flamengo = new time();
		break;

		case 30:
			Aluno aluno = new Aluno(opcao2, null, opcao2, opcao2, opcao2);
		break;
		
		case 31:
			Elevador elevador = new Elevador();
		break;
		
		case 32:
			Contador contador = new Contador();
		break;
		
		case 33:
			Lampada lampada = new Lampada();
		break;
		
		case 37:
			generico coisa = new generico(a, b, c);
		break;
		
		case 39:
			// fiz errado mas fodase
			matriz Matriz = new matriz();
		break;
		
		default:
			System.out.println("Opcao invalida");
		}
		
	}

}
