package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {

		Conta p1 = new Conta();

		p1.saldo = 300;
		System.out.println("Saldo primeira conta " + p1.saldo);

		Conta p2 = p1;
		System.out.println("Saldo da segunda conta " + p2.saldo);

		p2.saldo += 100;
		System.out.println("saldo segunda conta " + p2.saldo);

		System.out.println("Primeira Conta" + p1.saldo);

		if (p1 == p2) {
			System.out.println("Mesma Conta ");

		}

		System.out.println(p1);
		System.out.println(p2);
	}

}
