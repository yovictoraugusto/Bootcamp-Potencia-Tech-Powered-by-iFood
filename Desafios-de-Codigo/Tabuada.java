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
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
        
        System.out.println("Tabauda de "+tabuada);
        for(int i = 0; i<=10;i++){
            System.out.println(tabuada + " X " + i + " = " + (i * tabuada));
        }
    }
}
