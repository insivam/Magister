package Classes;

public class Main {

	public static void main(String[] args) {
		// chama o metodo professor para login e senha
		Professor professor = new Professor();
		Professor.login();

		// chama o metodo alunos para matriz de alunos
		Alunos alunos = new Alunos();
		alunos.matrizAlunos();

		// chama o metodo desempenho para calcula desempenho
		Desempenho desempenho = new Desempenho();
		desempenho.calculaDesempenho(alunos.matrizAlunos);

		// chama o metodo pais para mostrar mostrar o desempenho do seu filho
		Pais pais = new Pais();
		pais.mostraAlunos(alunos.matrizAlunos);

	}

}
