package javabasico.victor.setimasemana.desafiodecodigo;

import java.util.*;

public class DesafioParenteses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());
        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        char primeira = 'a', segunda = 'b', teste='c';
        for (int i = 0; i<s.length()-1; i++){
            primeira = s.charAt(i);
            segunda = s.charAt(i+1);
        }

        char[] bd = new char[6];
        bd[0] = '(';
        bd[1] = ')';
        bd[2] = '{';
        bd[3] = '}';
        bd[4] = '[';
        bd[5] = ']';

        for(int i = 0; i<6; i++){
            if(primeira == bd[i])
                teste = bd[i+1];
        }

        if(segunda == teste) return true;
        else return false;
    }
}
