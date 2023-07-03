package exercicio03;

// NAO FUNCIONAAAAA

import java.util.*;

public class Fatura {
	Scanner scanner = new Scanner(System.in);
	
	int numero;
	String descricao;
	int quantidade;
	float preco;
	
	String opcao;
	
	int produtos = 0;
	
	public void Fatura(int numero, String descricao, int quantidade, float preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		
		calculaTotal();
	}
	
	public void resultado(String descricao, float preco) {
		this.descricao = descricao;
		this.preco = preco;
	}
	
	List<resultado> produto = new ArrayList<>();
	
	void adicionarProduto() {
		System.out.print("Deseja adicionar um produto ao carrinho? ");
		opcao = scanner.next();
	
		if(opcao != "não") {
			System.out.print("Numero do produto: ");
			numero = scanner.nextInt();
			System.out.print("Descricao do produto: ");
			descricao = scanner.next();
			System.out.print("Preco do produto: ");
			preco = scanner.nextFloat();
			System.out.print("Quantidade de produtos: ");
			quantidade = scanner.nextInt();
			
			preco = preco * quantidade;
			
			produtos = produtos + quantidade;
			
			produto.add(descricao);
			
			System.out.println("Produto(s) adicionado no carrinho.");
		} else {
			System.out.println("Ok.");
		}
	}
	
	void calculaTotal(){
		System.out.println("Voce dese");
	}
	
	void listarProdutos() {
		
	}

}
