import java.util.*;
public class questao28 {

	public static void main(String[] args) {
		
		time Time = new time("Flamengo");
		
		Time.jogar();
		Time.jogar();
		Time.jogar();
		Time.jogar();
		
		Time.mostrarVitorias();

	}

}

class time{
	
	private String nome;
	private int vitorias = 0;
	private int derrotas = 0;
	private int empates = 0;
	private String colocacao;
	
	time(String nome){
		this.nome = nome;
	}
	
	public void jogar() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Contra que time deseja jogar: ");
		String oponente = scanner.next();
		
		int time1 = random.nextInt(6);
		int time2 = random.nextInt(6);
		
		if(time1 > time2) {
			System.out.println("O time "+getNome()+ " venceu de "+time1+" a "+time2+" contra o time "+oponente);
			vitorias++;
		}
		else if(time2 >time1) {
			System.out.println("O time "+oponente+ " venceu de "+time2+" a "+time1+" contra o time "+getNome());
			derrotas++;
		}
		else if(time1 == time2) {
			System.out.println("O time "+getNome()+ " empatou de "+time1+" a "+time2+" contra o time "+oponente);
			setEmpates(getEmpates() + 1);
		}
		else {
			System.out.println("seila");
		}
		
	}
	
	public void mostrarVitorias() {
		System.out.println("O time "+getNome()+ " teve a seguinte performance:");
		System.out.println("vitorias: "+getVitorias());
		System.out.println("Derrotas: "+getDerrotas());
		System.out.println("Empates: "+getEmpates());
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public String getColocacao() {
		return colocacao;
	}
	public void setColocacao(String colocacao) {
		this.colocacao = colocacao;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
