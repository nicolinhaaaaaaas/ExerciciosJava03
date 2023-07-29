import java.util.Scanner;

public class questao32 {

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		
		contador.imprimir();
		
		contador.incrementar();
		
		contador.imprimir();
		
		contador.decrementar();
		
		contador.imprimir();
		
		contador.zerar();
		
		contador.imprimir();

	}

}

class Contador{
	
	private int contador;
	
	public void zerar() {
		setContador(0);
	}
	
	public void incrementar() {
		Scanner scanner = new Scanner(System.in); // to colocando esse scanner so pra ser diferente um pouco
		
		System.out.print("Quanto deseja aumentar no contador: ");
		int incrementar = scanner.nextInt();
		setContador(getContador() + incrementar);
	}
	
	public void decrementar() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quanto deseja diminuir no contador: ");
		int decrementar = scanner.nextInt();
		setContador(getContador() - decrementar);
	}
	
	public void imprimir() {
		System.out.println(getContador());
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	
}
