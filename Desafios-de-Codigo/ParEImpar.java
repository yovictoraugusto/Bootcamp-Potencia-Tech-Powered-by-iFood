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
public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int quant;
        int number;
        int par=0;
        int impar=0;
        
        System.out.println("Quantos números?");
        quant = scan.nextInt();
        
        int cont=0;
        do{
            System.out.println("Numero: ");
            number = scan.nextInt();
            
            if(number%2==0)
                par++;
            else
                impar++;
            cont++;
        }while(cont<quant);
        System.out.println("Pares: "+par);
        System.out.println("Impares: "+impar);
    }
}
