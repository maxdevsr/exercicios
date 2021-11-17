package problema3numeros;

import java.util.Scanner;

public class maiordos3num {

	public static void main(String[] args) {
		// codigo para ver o maior numero dos 3 que o usuario digitar

		Scanner sc = new Scanner(System.in);

		System.out.println("Enger three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// criando novas classes para chamar funcoes primeira vez
		
		int higher = max(a, b, c);
		
		showResult(higher);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
