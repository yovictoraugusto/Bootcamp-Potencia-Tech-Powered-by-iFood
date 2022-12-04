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
public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[6];
        
        System.out.println("Digite um vetor de 6 números");
        for(int i = 0;i != 6;i++){
            vetor[i] = scan.nextInt();
        }
        
        System.out.println("Vetor na ordem inversa");
        for(int i = 5; i >= 0;i--){
            System.out.println(vetor[i] + " ");
        }
    }
}
