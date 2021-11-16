package SwitchBreakExemplo;

import java.util.Scanner;

public class SwitchCompostoExemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultado = "";

		int valor = sc.nextInt();

		switch (valor) {

		case 12:
			resultado = "Excelente";
			break;

		case 11:
			resultado = "Otimo";
			break;

		case 10:
			resultado = "Muito bom";
			break;

		case 9:
			resultado = "Bom";
			break;

		case 8:
			resultado = "Satisfatorio";
			break;

		case 7:
			resultado = "Baixo";
			break;

		case 6:
			resultado = "Muito baixo";
			break;

		default:
			resultado = "Insatisfatorio";
			break;

		}
		sc.close();

		System.out.println("Resultado km/1: " + valor + " = " + resultado);

	}
}