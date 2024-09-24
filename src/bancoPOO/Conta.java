package bancoPOO;

// Classe abstrata para não ser instanciada
public abstract class Conta implements InterfaceConta {

	protected int agencia;
	protected int digito;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(int agencia, int digito, Cliente cliente) {
		this.agencia = agencia;
		this.digito = digito;
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getDigito() {
		return digito;
	}
	
	protected void imprimirInfo() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("CPF: " + this.cliente.getCpf());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Digito: " + this.digito);
		System.out.println("Saldo: R$" + this.saldo);
	}

	@Override
	public void sacar(double valor) {
		if(valor > this.saldo) {
			System.out.println("Não há saldo suficiente para sacar este valor.");
		} else {
			this.saldo -= valor;
		}
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if(valor > this.saldo) {
			System.out.println("Não há saldo suficiente para transferir este valor.");
			System.out.println("Faça um depósito para usar esta função");
		} else {
			this.saldo -= valor;
			contaDestino.depositar(valor);
			System.out.println("Valor transferido com sucesso!");
		}
		
	}
	
}
