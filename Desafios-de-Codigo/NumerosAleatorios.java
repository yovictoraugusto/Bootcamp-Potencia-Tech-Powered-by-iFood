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
public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int[] numerosAletoarios = new int[20];
        
        for(int i = 0; i < numerosAletoarios.length; i++){
            int numero = random.nextInt(100);
            numerosAletoarios[i] = numero;
        }
        
        System.out.println("Numeros aleatórios");
        for(int numero: numerosAletoarios){
            System.out.print(numero+" ");
        }
        
        System.out.println("\nSucessores");
        for(int numero: numerosAletoarios){
            System.out.print(numero+1+" ");
        }
    }
}
