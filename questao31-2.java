public class questao31 {
	
	public static void main(String[] args) {
		Elevador elevador = new Elevador(10, 12);
		
		elevador.entra();
		elevador.entra();
		elevador.entra();
		
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		
		elevador.sai();
	}

}

class Elevador{
	
	private int andarAtual = 0;
	private int andares;
	private int capacidade;
	private int pessoasPresente = 0;
	
	Elevador(int capacidade, int andares){
		this.capacidade = capacidade;
		this.andares = andares;
	}
	
	public void entra() {
		if(pessoasPresente < capacidade) { // testando se n ta cheio o elevador
			System.out.println("mais uma pessoa entrou");
			pessoasPresente++;
			System.out.println("Pessoas: "+pessoasPresente);
		}
		else{
			System.out.println("Elevador cheio");
		}
	}
	
	public void sai() {
		if(pessoasPresente > 0) { // testando se n ta vazio o erlevador
			System.out.println("Saiu uma pessoa");
			pessoasPresente--;
			System.out.println("Pessoas: "+pessoasPresente);
		}
		else{
			System.out.println("Elevador vazio");
		}
	}
	
	public void sobe() {
		if(andarAtual < andares) {
			System.out.println("Subindo 1 andar");
			andarAtual++;
			System.out.println("Andar: "+andarAtual);
		}
		else {
			System.out.println("ja ta no ultimo andar lol");
		}
	}
	
	public void desce() {
		if(andarAtual > 0) {
			System.out.println("Descendo 1 andar");
			andarAtual--;
			System.out.println("Andar: "+andarAtual);
		}
		else {
			System.out.println("tamo no terreo");
		}
	}

	public int getPessoasPresente() {
		return pessoasPresente;
	}

	public void setPessoasPresente(int pessoasPresente) {
		this.pessoasPresente = pessoasPresente;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	
	
}
