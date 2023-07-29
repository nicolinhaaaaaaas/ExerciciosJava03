public class questao29 {

	public static void main(String[] args) {
		
		Fatura compra1 = new Fatura();
		// nao pediu que passasse nada no construtor...
		
		compra1.setNumeroIdentificacao(12);
		compra1.setDescricao("Uma caixa de leite desnatado");
		compra1.setQuantidade(5);
		compra1.setPreco(7.8);
		
		System.out.println(compra1.getDescricao());
		System.out.println("Numero: "+compra1.getNumeroIdentificacao());
		System.out.println("Preco: "+ compra1.getPreco());
		System.out.println("Quantidade: "+ compra1.getQuantidade()+"\n");

		compra1.calculaTotal();
	}

}

class Fatura{
	
	private int numeroIdentificacao;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public void calculaTotal() {
		double total;
		
		total = (double)quantidade * preco;
		
		System.out.println("O preco final da compra eh: "+total);
	}
	
	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		int quantidadeFinal = quantidade;
		if(quantidadeFinal < 0) {
			quantidadeFinal = 0;
		}
		return quantidadeFinal;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		double precoFinal = preco;
		if(precoFinal < 0.0) {
			precoFinal = 0.0;
		}
		return precoFinal;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
