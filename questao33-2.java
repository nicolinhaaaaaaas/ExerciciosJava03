public class questao33 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		// disse que era pra implementar a classe contador junto, mas n tava ficando daora entao deixei assim msm
		
		lampada.acende();
		lampada.apaga();
		lampada.acende();
		lampada.acende();
		
		lampada.mostraEstado();
		
		System.out.println("A lampada foi acesa: "+lampada.getContador()+" vezes");
		

	}

}

class Lampada{
	
	private boolean estadoDaLampada = false;
	private int contador;
	
	public void acende() {
		if(estadoDaLampada == false) {
			System.out.println("Voce acendeu a lampada");
			estadoDaLampada = true;
			contador++;
		}
		else {
			System.out.println("A lampada ja ta acesa");
		}
	}
	
	public void apaga() {
		if(estadoDaLampada == true) {
			System.out.println("Voce apagou a lampada");
			estadoDaLampada = false;
		}
		else {
			System.out.println("A lampada ja ta apagada");
		}
	}
	
	public void mostraEstado() {
		if(estadoDaLampada == false) {
			System.out.println("a lampada esta apagada");
		}
		else if(estadoDaLampada == true) {
			System.out.println("A lampada ta acesa");
		}
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
}
