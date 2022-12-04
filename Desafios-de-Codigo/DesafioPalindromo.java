package javabasico.victor.setimasemana.desafiodecodigo;

import java.util.Scanner;

public class DesafioPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String palindromo = "";

        for(int i = palavra.length()-1; i >= 0;i--)
            palindromo =  palindromo + palavra.charAt(i);

        if(palavra.equals(palindromo)) System.out.println("TRUE");
        else System.out.println("FALSE");
    }
}
