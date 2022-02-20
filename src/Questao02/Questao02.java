package Questao02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao02 {
	
	public static int SenhaFraca(String senha){
		
	      int numero = 0;
	      if (senha.length() < 6){
	          numero = 6 - senha.length();
	          System.out.println(numero);
	      }
	      return numero;
	  }

	  public static boolean SenhaForte(String senha){
	      String regex = "^(?=.*[0-9])"
	              + "(?=.*[a-z])(?=.*[A-Z])"
	              + "(?=.*[@#$%^&+=])"
	              + "(?=\\S+$).{6,20}$";

	      if (senha.matches(regex)){
	          System.out.println("Senha Forte!");
	      }else{ 
	    	  System.out.println("Senha Fraca!");
	      }
	      return senha.matches(regex);
	  }


	    public static void main(String[] args) {
	    	
	        Scanner entrada = new Scanner(System.in);

	        System.out.println("Nome");
	        String nome = entrada.next();
	        System.out.println("Senha");
	        String senha = entrada.next();
	        
	        Questao02 questao02 = new Questao02();
	        questao02.SenhaFraca(senha);
	        questao02.SenhaForte(senha);
	        
	        entrada.close();
	    }
	}


