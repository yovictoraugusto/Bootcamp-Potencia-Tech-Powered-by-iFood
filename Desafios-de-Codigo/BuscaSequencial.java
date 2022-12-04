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
public class BuscaSequencial {
     public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        int num = leitor.nextInt();
        int i,aux=0;
        for (i=0; i<10;i++){
            if (num == elementos[i]){
                System.out.println("Achei "+ num +" na posicao " +i);
                aux=1;
            }
                
        }
        if (i == 10 && aux == 0)
            System.out.println("Numero "+ num +" nao encontrado!");
    }
}
