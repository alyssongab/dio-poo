package bancoPOO;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int digito, Cliente cliente) {
		super(agencia, digito, cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===== Extrato da Conta Corrente =====");
		super.imprimirInfo();
	}
}
