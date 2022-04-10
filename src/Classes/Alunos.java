package Classes;

public class Alunos {
    /*
     * Criar uma matriz de alunos em ordem
     * alfabetica já prontos para ser usada
     * Cada aluno tem um nome, 2 String
     * vazias para desempenho e
     * sugestão para melhoras
     * e uma String com o RA
     * 
     * Vai se chamar matrizAlunos
     */
    String matrizAlunos[][] = {
            { "Alana ", "", "", "40" },
            { "Enzo ", "", "", "97" },
            { "Miguel ", "", "", "89" },
            { "Ravena ", "", "", "22" },
            { "Valentina ", "", "", "55" }
    };

    public String[][] getMatrizAlunos() {
        return matrizAlunos;
    }

    public void setMatrizAlunos(String[][] matrizAlunos) {
        this.matrizAlunos = matrizAlunos;
    }

}
