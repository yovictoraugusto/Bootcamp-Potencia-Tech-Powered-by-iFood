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
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        
        for(int i = 0;i < matriz.length; i++){
            for(int j = 0;j<matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }
        
        for(int[]linha : matriz){
            for(int coluna : linha){
                System.out.print(coluna+" ");
            }
            System.out.println("");
        }
    }
}
