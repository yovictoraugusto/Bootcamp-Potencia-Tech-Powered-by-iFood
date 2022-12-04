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
public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota=1;
        
        System.out.println("Nota: ");
        while(nota >=0 && nota <= 10){
            nota = scan.nextInt();
        }
    }
}
