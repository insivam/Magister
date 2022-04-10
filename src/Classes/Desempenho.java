package Classes;

import java.util.Scanner;

public class Desempenho {
    /*
     * IrÃ¡ passar por uma lista de alunos
     * e deixara o professor selecionar um desempenho
     * de uma lista de desempenhos (ex: Bom, Regular, Ruim)
     * O professor tambem pode adicionar uma sugestÃ£o para
     * melhora de desempenho (Não Ã© obrigatorio)
     * 
     * Vai se chamar calculaDesempenho
     * e vai receber a matrizAlunos
     */
    static Alunos alunos = new Alunos();
    static String matrizAlunos[][] = alunos.getMatrizAlunos();

    public static void calculaDesempenho() {
        Scanner entrada = new Scanner(System.in);
        int escolha;
        String observacao = "";

        System.out.print("\033[1;36m");
        System.out.println("==============================");
        System.out.println("|           ALUNOS           |");
        System.out.println("==============================");

        for (int i = 0; i < alunos.getMatrizAlunos().length; i++) {
            System.out.print("\033[1;36m");
            System.out.println("\nQual o Desempenho de " + alunos.getMatrizAlunos()[i][0] + "?");
            System.out.println(" 1. Ruim\n 2. Regular\n 3. Bom\n 4. Muito Bom ");
            do { // Tratamento de erro
                System.out.print("\033[1;33mSelecione uma opção: ");
                escolha = entrada.nextInt();

                if (escolha < 1 || escolha > 4) {
                    System.out.println("\033[1;31mSelecione um número elegível!\033[m");
                }
                System.out.println();
            } while (escolha < 1 || escolha > 4);

            if (escolha == 1) {
                matrizAlunos[i][1] = "Ruim";
            } else if (escolha == 2) {
                matrizAlunos[i][1] = "Regular";
            } else if (escolha == 3) {
                matrizAlunos[i][1] = "Bom";
            } else if (escolha == 4) {
                matrizAlunos[i][1] = "Muito Bom";
            }
            // Coloca o valor da escolha no array

            alunos.setMatrizAlunos(matrizAlunos);

            do { // Tratamento de erro
                System.out.print(
                        "\033[1;36mDeseja fazer uma observação?\n 1. Sim\n 2. Não\n\033[1;33mSelecione uma opção: ");
                escolha = entrada.nextInt();

                if (escolha < 1 || escolha > 2) {
                    System.out.println("\033[1;31mSelecione um número valido!\033[m");

                }
                System.out.println();
            } while (escolha < 1 || escolha > 2);

            if (escolha == 1) {

                entrada.nextLine();// --> como existe muitos nextInt toda vez que a tecla enter � teclada
                System.out.println("\033[1;36mMensagem: \033[1;33m"); // um \n � computado desalinhado o codigo... um
                                                                      // nextLine();
                // a mais �
                // necess�rio.
                observacao = entrada.nextLine();

                // System.out.println(observacao); --> verificar se est� certo
                System.out.println("\n\033[1;32mObrigado pelo feedback :)");

                alunos.getMatrizAlunos()[i][2] = observacao;
            } else if (escolha == 2) {
                System.out.println("Obrigado pelo feedback :)");
            } else {
                System.out.println("Selecione um número elegível!");
            }
            if (i != matrizAlunos.length - 1) {
                System.out.println("\n\033[m==============================");
            }
        }
        return;
    }

    public static void mostraMatriz() {
        Scanner leia = new Scanner(System.in);
        int ra_aluno;
        int c = -1;

        System.out.println("\033[1;36m");
        System.out.println("==============================");
        System.out.println("|         RESPONSÁVEL         |");
        System.out.println("==============================");

        System.out.print("\033[1;33m");
        System.out.print(" Digite o RA do aluno: ");
        ra_aluno = leia.nextInt();

        System.out.print("\033[1;36m");
        for (int l = 0; l < matrizAlunos.length; l++) {
            if (matrizAlunos[l][3].equals(String.valueOf(ra_aluno))) {
                c = l;
            }
        }
        if (c == -1) {
            System.out.println("\033[1;31m RA inválido\033[m\n");
            return;
        }
        System.out.println(" Nome: " + matrizAlunos[c][0]);
        System.out.println(" Desempenho: " + matrizAlunos[c][1]);
        System.out.println(" Sugestão: " + matrizAlunos[c][2]);
        System.out.println();
    }
}
