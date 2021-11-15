package WhileExemplo;

public class DowhileExemplo2 {

	public static void main(String[] args) {

		int r = 0;

		do {

			System.out.println("Valor aleatorio (randomico): " + Math.random() * r);
			r++;

		} while (r <= 10);
		System.out.println("Total acumulado: " + r);

	}

}
