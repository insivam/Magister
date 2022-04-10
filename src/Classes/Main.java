package Classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Professor professor = new Professor();

		while (true) {

			int opcao;
			System.out.print("\033[1;36m");
			System.out.println("==============================");
			System.out.println("|            MENU            |");
			System.out.println("==============================");
			System.out.println(" Qual você quer acessar?      ");
			System.out.println("  1. Professor                ");
			System.out.println("  2. Responsavel              ");
			System.out.println("  3. Sair                     ");

			do { // Verifica se o usuario digitou um número válido
				System.out.print("\033[1;33m");
				System.out.print(" Selecione uma opção: ");
				opcao = leia.nextInt();

				if (opcao < 1 || opcao > 3) {
					System.out.println("\033[1;31m Selecione uma opção válida!\033[m\n");

				}
			} while (opcao < 1 || opcao > 3);

			if (opcao == 1) {
				if (professor.login()) {
					System.out.println("\033[1;32m Entrando no Sistema...\n");
					Desempenho.calculaDesempenho();
				} else {
					System.exit(0);
				}
			} else if (opcao == 2) {
				Desempenho.mostraMatriz();
			} else if (opcao == 3) {
				System.out.println("\033[1;32m\n Obrigado por usar o sistema!\n\033[1;37m");
				System.out.println("=============DEVS=============");
				System.out.println("         ALINES RASCHE        ");
				System.out.println("          DAYANA TITO         ");
				System.out.println("           IGOR NUNES         ");
				System.out.println("        MILENA OLIVEIRA       ");
				System.out.println("        VITOR RODRIGUES       ");
				System.out.println("            YASMIN            ");
				System.out.println("         WILLIAM SILVA        ");
				System.out.println("==============================");
				System.out.println("\033[m");

				System.exit(0);
			}
		}
	}
}
