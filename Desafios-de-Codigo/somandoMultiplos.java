/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico.victor.terceirasemana.desafiocodigo;
import java.util.Scanner;
/**
 *
 * @author victor
 */
public class somandoMultiplos {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int aux=A, auxSoma=0;
        while(aux != N+1){
            if (aux%A==0){
                auxSoma=auxSoma+aux;
            }
            aux++;
        }
        System.out.println(auxSoma);
    }
}
