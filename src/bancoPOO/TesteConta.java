package bancoPOO;

public class TesteConta {
	public static void main(String[] args) {
		
		// Cliente 1
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Alysson");
		cliente1.setCpf("1234567890");
		// Conta corrente do cliente 1
		ContaCorrente cc1 = new ContaCorrente(3, 1, cliente1);
		cc1.depositar(500);
		
		
		// Cliente 2
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Laiza");
		cliente2.setCpf("00011122233");
		// Conta corrente do cliente 2
		ContaCorrente cc2 = new ContaCorrente(4, 5, cliente2);
		
		cc1.transferir(50, cc2);
		System.out.println();
		
		cc2.imprimirExtrato();
	}
}
