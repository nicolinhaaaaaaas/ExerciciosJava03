import java.util.Scanner;

public class questao30 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		
		System.out.print("Digite o seu numero de matricula: ");
		aluno1.setMatricula(scanner.nextInt());
		System.out.print("Digite o seu nome: ");
		aluno1.setNome(scanner.next());
		System.out.print("Digite sua primeira nota: ");
		aluno1.setNota1(scanner.nextDouble());
		System.out.print("Digite a segunda nota: ");
		aluno1.setNota2(scanner.nextDouble());
		System.out.print("Digite a nota do trabalho: ");
		aluno1.setTrabalho(scanner.nextDouble());
		
		aluno1.media();
		
		aluno1.provaFinal();

	}

}

class Aluno{
	
	private int matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double trabalho;
	
	public void media() {
		double media = 0.0;
		
		media = (nota1 * 2.5 + nota2 * 2.5 + trabalho * 2)/ 3;
		
		System.out.println("\nMedia do aluno: "+ getNome()+ " eh: "+media);
	}
	
	public void provaFinal() {
		double media = 0.0;
		
		media = (nota1 * 2.5 + nota2 * 2.5 + trabalho * 2)/ 3;
		
		if(media < 7.0) {
			double notaFinal = 0.0;
			
			notaFinal = 7.0 - media;
			// seila como descobre qnt precisa na final
			System.out.println("\neh necessario tirar: "+notaFinal+ " para passar na quarta prova");
		}
		else {
			System.out.println("\nta passado ja");;
		}
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}
	
	
}
