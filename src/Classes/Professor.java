package Classes;

import java.util.Scanner;

public class Professor {
    /*
     * Cria um sistema de Login e Senha do professor
     * 
     * caso a senha esteja incorreta,
     * deve-se pedir a senha novamente.
     * 
     * Vai se chamar login
     */
    Scanner entrada = new Scanner(System.in);

    Desempenho desempenho = new Desempenho();

    public boolean login() {
        Scanner entrada = new Scanner(System.in);
        String login;
        String senha;

        System.out.println("\033[1;36m");
        System.out.println("==============================");
        System.out.println("|           ACESSO           |");
        System.out.println("==============================");

        do {
            System.out.print("\033[1;33m");
            System.out.print(" Digite seu login: ");
            login = entrada.next();

            System.out.print(" Digite sua senha: ");
            senha = entrada.next();

            if (login.equals("Professor") && senha.equals("1969")) {
                return true;
            } else {
                System.out.println("\033[1;31m Login ou senha incorretos!\033[m\n");
            }
        } while (!login.equals("Professor") || !senha.equals("1969"));

        return false;
    }
}
