import java.util.*;
public class time {
	
	int opcao = 0;
	int opcao2 = 0;
	
	Random random;
	Scanner scanner = new Scanner(System.in);
	int time1 = 0;
	int time2 = 0;
	String eu;
	String opp;
	String local;
	String sim;
	int jogadores = 11;
	int apostar = 0;
	double quantia = 0.00;
	
	time(){
		random = new Random();
		
		while(true) {
			escolhas();
			opcao2 = scanner.nextInt();
			
			switch(opcao2) {
				case 1:
					jogar();
				break;
				
				case 2:
					aposta();
				break;
				
				case 3:
					jogadores();
				break;
				
				case 0:
					System.out.println("Encerrando o programa...");
					return;
					
				default:
					System.out.println("Opcao invalida");
			}
			
		}
	}
	
	void escolhas() {
		System.out.println("Voce escolheu o exercicio sobre time de futebol, o que deseja fazer?");
		System.out.print("(1)- Jogar ; (2)- Apostar ; (3)- Jogadores ");
		System.out.println("");
	}
	
	void jogar(){
		
		System.out.print("Que time voce escolhe? ");
		eu = scanner.next();
		System.out.print("Contra quem o time vai jogar? ");
		opp = scanner.next();
		System.out.print("Em qual estadio? ");
		local = scanner.next();
		
		time1 = random.nextInt(6)+1;
		time2 = random.nextInt(6)+1;
		
		if(time1 > time2) {
			System.out.println(eu+" venceu de "+time1+" a "+time2+" contra o "+opp+" no estadio "+local);
		} else if(time2 > time1) {
			System.out.println(opp+" venceu de "+time2+" a "+time1+" contra o "+eu+" no estadio "+local);
		} else if(time1 == time2) {
			System.out.println(eu+" empatou de "+time1+" a "+time2+" contra o "+opp+" no estadio "+local);
		} else {
			System.out.println("Fodase");
		}
		System.out.println("");
	}
	
	void aposta() {
		System.out.print("Em qual time deseja apostar? ");
		eu = scanner.next();
		System.out.println("Digite a quantia que deseja apostar em R$ ");
		quantia = scanner.nextDouble();
		
		apostar = random.nextInt(2)+1;
		
		if(apostar == 1) {
			quantia = quantia*2;
			System.out.println("Voce ganhou e recebeu R$ "+quantia);
		} else {
			quantia = 0;
			System.out.println("Voce perdeu tudo e o agiota vai lhe buscar");
		}
		System.out.println("");
	}
	
	void jogadores() {
		System.out.println("O time possui "+jogadores+" jogadores");
		System.out.print("Deseja contratar algum jogador? ");
		sim = scanner.next();
		
		if(sim != "nao") {
			System.out.print("Que jogador deseja contratar? ");
			eu = scanner.next();
			System.out.println("Agora "+eu+" faz parte do time. Parabéns pela contratacao");
		} else {
			System.out.println("Vai toma no cu entao");
		}
		System.out.println("");
	}

}
