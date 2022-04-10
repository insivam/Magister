package Classes;

import java.util.Scanner;

public class Pais {
    /*
     * IrÃ¡ pedir o RA do aluno
     * e irÃ¡ mostrar o nome do aluno,
     * o desempenho e sugestÃ£o
     * VocÃª vai receber uma matriz de alunos
     * e vai se chamar a matrizAlunos
     * A funÃ§Ã£o deve se chamar mostraAlunos
     * Nela contem [nome, desempenho, sugestao, RA]
     * nessa mesma ordem
     */

    public static void mostraAlunos() { // ?? completar p/ teste
        Scanner leia = new Scanner(System.in);
        int ra_aluno;
        int c = -1;

        System.out.println("-------------------------");
        System.out.println("| DIGITE O RA DO ALUNO: |");
        System.out.println("-------------------------");
        ra_aluno = leia.nextInt();

        for (int l = 0; l < matrizAlunos.length; l++) {

            if (matrizAlunos[l][3].equals(String.valueOf(ra_aluno))) {
                c = l;
            }
        }
        leia.close();
        if (c == -1) {
            System.out.println("RA inválido");
            return;
        }
        System.out.println("RA do aluno: " + matrizAlunos[c][3]);
        System.out.println("nome: " + matrizAlunos[c][0]);
        System.out.println("desempenho:" + matrizAlunos[c][2]);
        System.out.println("sugestao: " + matrizAlunos[c][1]);
        System.out.println();
    }
}