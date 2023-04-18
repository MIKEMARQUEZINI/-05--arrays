package Arrays;

import java.util.Scanner;

public class ExecMatrz2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float[][] notas = new float[10][4];
		float somatt = 0;

		float[] medialunos = new float[10];

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("\nDigite as notas dos "+(linha + 1)+" aluno: ");
				notas[linha][coluna] = leia.nextFloat();
				somatt += notas[linha][coluna];
			}

			medialunos[linha] = somatt / 4;
			somatt = 0;

		}

		for (int i = 0; i < medialunos.length; i++) {
			System.out.printf("\nMédia do aluno %d: %.1f", (i + 1), medialunos[i]);

		}
	}
}
