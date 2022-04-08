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
	
	   public static boolean login() {
		   Scanner entrada = new Scanner(System.in);
		   String login ;
		   String senha ;
	
		   do {
	            System.out.print("Digite seu login: ");
	            login = entrada.next();
	            entrada.nextLine();

	            System.out.print("Digite sua senha: ");
	            senha = entrada.next();

	            if (login.equals("Professor") && senha.equals("1969")) {
	                System.out.println("Entrando no Sistema.....");
	                return true;
	            } else {
	                System.out.println("Login ou senha incorretos!");
	                return false;
	            }
	        } while (!login.equals("Professor") && !senha.equals("1969"));
	    	
	    	}
}
