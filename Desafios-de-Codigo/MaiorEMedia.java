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
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int maior = 0;
        int soma = 0;
        int count = 0;
        
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            
            if(numero > maior){
                maior = numero;
            }
            count++;
        }while(count < 5);
        
        System.out.println("Maior: "+maior);
        System.out.println("Média: "+soma/count);
    }
}
