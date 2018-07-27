package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(200);
		System.out.println("Saldo Paulo" + conta.saldo);

		boolean conseguiuRetirar = conta.sacar(50);
		System.out.println("Testando alteração no git" + conta.saldo);
		System.out.println("Consegui Retirar = " + conseguiuRetirar);


		
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);

		if (conta2.transfere(3000, conta)) {
			System.out.println("Trasferencia com sucesso!");
		} else {
			System.out.println("Faltou dinheiro! ");
		}
        System.out.println(conta.saldo);
        System.out.println(conta2.saldo);
        
        conta.titular = "Paulo";
        System.out.println(conta.titular);
	}
	
}
