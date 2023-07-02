import java.util.*;
public class Aluno {
	Scanner scanner = new Scanner(System.in);
	
	int matricula;
	String nome;
	double notaProva1;
	double notaProva2;
	double notaTrabalho;
	double Media;
	double mediaFinal;
	
	//essa ficou diferente, acho que é a forma certa de se fazer colocando os dados dentro do objeto, mas tanto faz
	
	Aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho){
		this.matricula = matricula;
		this.nome = nome;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
		media();
	}
	
	void media() {
		System.out.print("Nome do aluno: ");
		nome = scanner.next();
    System.out.print("Qual seu numero de matricula: ");
		matricula = scanner.nextInt();
		System.out.print("Qual foi a primeira nota: ");
		notaProva1 = scanner.nextDouble();
		System.out.print("Qual foi a segunda nota: ");
		notaProva2 = scanner.nextDouble();
		System.out.print("Qual foi a nota do trabalho: ");
		notaTrabalho = scanner.nextDouble();
		
		Media = (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho *2)/7;
		
		System.out.println("O aluno "+nome+" ficou com a media: "+Media);
		
		if(Media < 7.00) {
			provaFinal();
		} else {
			
		}
		
		System.out.println("");
	}
	
	void provaFinal() {
		mediaFinal = Media;
		if(mediaFinal < 7) {
			mediaFinal = 10 - mediaFinal;
			System.out.println("O aluno "+ nome+" precisara tirar "+mediaFinal+ " na prova final.");
		}
		else {
			return;
		}
	}
}
