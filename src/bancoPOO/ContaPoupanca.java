package bancoPOO;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int digito, Cliente cliente) {
		super(agencia, digito, cliente);
	
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===== Extrato Conta Poupança =====");
		super.imprimirInfo();
		
	}
	
}
