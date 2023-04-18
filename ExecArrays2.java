package Arrays;

import java.util.Scanner;

public class ExecArrays2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] num = new int[10];
		int x;
		float somatt = 0, mediatt = 0;

		for (x = 0; x <num.length; x++) {
			System.out.println("Entre com o " + (x + 1) + " número");
			num[x] = leia.nextInt();

			somatt += num[x];
		}

		mediatt = somatt / 10;
		// elementos pares //
		System.out.println("Elementos pares :");
		for (x = 0; x < num.length; x++) {
			if (num[x] % 2 == 0) {
				System.out.print(num[x] + " ");
			}

		}

		System.out.println("\nElementos Indices impares");
		for (x = 0; x <num.length; x++) {
			if (x % 2 != 0) {
				System.out.print(num[x] + " ");
			}
		}

		System.out.printf("\nA Soma de todos os elementos do vetor: " + somatt);
		System.out.printf("\nA Média de todos os elementos do vetor: " + mediatt);

	}
}
