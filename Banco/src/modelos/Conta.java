package modelos;

public class Conta {

	double  saldo;
	String Conta ;
	
	public Conta (String Conta) {
		saldo = 0;
		this.Conta = Conta;
	}
	public void depositar (double deposito) {
		saldo += deposito;
	}
	public void sacar (double sacar) {
		if(sacar > saldo) {
			System.out.println("erro");
		}
		else {
			saldo-= sacar;
		}
	}
	public String toString() {
		return "saldo:" + saldo;
	}
}
