package Classes;

import java.util.Scanner;

public class Desempenho {
    /*
     * Irá passar por uma lista de alunos
     * e deixara o professor selecionar um desempenho
     * de uma lista de desempenhos (ex: Bom, Regular, Ruim)
     * O professor tambem pode adicionar uma sugestÃ£o para
     * melhora de desempenho (Não obrigatorio)
     * 
     * Vai se chamar calculaDesempenho
     * e vai receber a matrizAlunos
     */
    static Alunos alunos = new Alunos();
    static String matrizAlunos[][] = alunos.getMatrizAlunos();

    public static void calculaDesempenho() {
        Scanner entrada = new Scanner(System.in);
        int escolha = 0;
        String observacao = "";

        System.out.print("\033[1;36m");
        System.out.println("==============================");
        System.out.println("|           ALUNOS           |");
        System.out.println("==============================");

        for (int i = 0; i < alunos.getMatrizAlunos().length; i++) {
            System.out.println("\033[1;36m Qual o Desempenho de " + alunos.getMatrizAlunos()[i][0] + "?");
            System.out.println("  1. Ruim\n  2. Regular\n  3. Bom\n  4. Muito Bom ");
            while (true) {
                try {
                    System.out.print("\033[1;33m Selecione uma opção: ");
                    escolha = entrada.nextInt();
                } catch (Exception e) {
                    System.out.println("\033[1;31m Digite um número válido!\n");
                    entrada.next();
                    continue;
                }

                if (escolha < 1 || escolha > 4) {
                    System.out.println("\033[1;31m Opção inválida!\n");
                    continue;
                }
                break;
            }
            System.out.println();

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

            while (true) { // Tratamento de erro
                try {
                    System.out.print(
                            "\033[1;36m Deseja fazer uma observação?\n  1. Sim\n  2. Não\n\033[1;33m Selecione uma opção: ");
                    escolha = entrada.nextInt();

                } catch (Exception e) {
                    System.out.println("\033[1;31m Digite um número válido!\n");
                    entrada.next();
                    continue;
                }
                if (escolha < 1 || escolha > 2) {
                    System.out.println("\033[1;31m Selecione um número valido!\033[m\n");
                    continue;
                }
                System.out.println();
                break;

            }

            if (escolha == 1) {

                entrada.nextLine();// --> como existe muitos nextInt toda vez que a tecla enter é teclada
                System.out.println("\033[1;36m Mensagem: \033[1;33m"); // um \n é computado desalinhado o codigo... um nextLine a mais é  necessário.
               
                observacao = entrada.nextLine();

                // System.out.println(observacao); --> verificar se est� certo
                System.out.println("\n\033[1;32m Obrigado pelo feedback :)");

                alunos.getMatrizAlunos()[i][2] = observacao;
            } else if (escolha == 2) {
                System.out.println("\033[1;32m Obrigado pelo feedback :)\033[m");
            } else {
                System.out.println("\033[1;31m Selecione um número elegível!\033[m");
            }
            if (i != matrizAlunos.length - 1) {
                System.out.println("\n\033[m==============================");
            }
            System.out.println();
        }
        return;

    }

    public static void mostraMatriz() {
        Scanner leia = new Scanner(System.in);
        int ra_aluno;
        int c = -1;

        System.out.println("\033[1;36m");
        System.out.println("==============================");
        System.out.println("|         RESPONSÁVEL        |");
        System.out.println("==============================");
        while (true) {
            try {
                System.out.print("\033[1;33m Digite o RA do aluno: ");
                ra_aluno = leia.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("\033[1;31m ERRO: Digite um número válido!\n");
                leia.nextLine();
            }
        }

        System.out.println("\033[1;36m");
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
        System.out.println(" Observação:\n" + matrizAlunos[c][2]);
        System.out.println();

        if (matrizAlunos[c][1] == "Muito Bom") {
            System.out.println("Muito bom: Aluno com vontade de aprender," +
                    " realiza as entregas no prazo," +
                    " se expressa, tira dúvidas," +
                    " vai atrás de forma autonoma," +
                    " indo além do conteúdo e busca" +
                    " aprimorar o que foi aprendido" +
                    " na aula");
        } else if (matrizAlunos[c][1] == "Bom") {
            System.out.println("Bom: Aluno com vontade de aprender, realiza as entregas " +
                    " no prazo e atinge as" +
                    " expectativas do professor(a)," +
                    " mas ainda não se expõe diante" +
                    " da turma;");
        } else if (matrizAlunos[c][1] == "Regular") {
            System.out.println("Regular: Aluno não realiza as entregas" +
                    " no prazo, não entrega" +
                    " algumas atividades e tem" +
                    " dificuldades de manter a" +
                    " atenção na aula.");
        } else if (matrizAlunos[c][1] == "Ruim") {
            System.out.println("Ruim: Aluno não aprende o conteúdo" +
                    " e não demonstra interesse em" +
                    " aprender, mesmo explicando de" +
                    " formas diferentes, não" +
                    " participa das atividades" +
                    " propostas e não faz as " +
                    " entregas, bagunça muito " +
                    " durante a aula e atrapalha os" +
                    " colegas, não segue as" +
                    " orientações do(a)" +
                    " professor(a) em sala de aula");
        }
    }
}
