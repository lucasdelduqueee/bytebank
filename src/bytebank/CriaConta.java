package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.saldo = 200;
		System.out.println("Primeira " + c.saldo);

		c.saldo += 100;
		// System.out.println(c.saldo);

		Conta c1 = new Conta();
		c1.saldo = 50;
		System.out.println("Segunda " + c1.saldo);

		System.out.println(c.agencia);

		if (c == c1) {
			System.out.println("mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}

	}

}
