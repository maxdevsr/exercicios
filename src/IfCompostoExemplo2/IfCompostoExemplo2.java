package IfCompostoExemplo2;

import java.util.Scanner;

public class IfCompostoExemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int media;
		System.out.println("Digite sua nota");
		media = sc.nextInt();

		String status;
		if (media >= 6) {
			status = "Aprovado";
		} else {
			status = "Reprovado";
		}
		System.out.println(status);

		sc.close();
	}

}
