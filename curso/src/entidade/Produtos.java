package entidade;

public class Produtos {

	public String nome;
	public double preco;
	public int quantidade;

	public double totalEmStook() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removaProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + quantidade + "units, Total:$"
				+ String.format("%.2f", totalEmStook());
	}
}
