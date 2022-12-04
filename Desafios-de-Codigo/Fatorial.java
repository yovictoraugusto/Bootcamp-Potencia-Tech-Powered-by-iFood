/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico.victor.terceirasemana.desafiocodigo;
import java.util.*;
/**
 *
 * @author victor
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        
        int aux = 1;
        for(int i = fatorial; i != 0; i--){
            aux = aux * i;
        }
        System.out.println(fatorial + " != "+aux);
    }
}
