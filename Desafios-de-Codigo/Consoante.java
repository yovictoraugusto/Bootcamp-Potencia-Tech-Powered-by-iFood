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
public class Consoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        
        int quantCons = 0;
        
        int count=0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();
            
            if(!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") |letra.equalsIgnoreCase("i") |letra.equalsIgnoreCase("o") |letra.equalsIgnoreCase("u") )){
                consoantes[count]=letra;
                quantCons++;
            }
            count++;
            
        }while(count < consoantes.length);
        
        System.out.println("Consoantes: ");
        for(String consoante : consoantes){
            if (consoante != null)
                System.out.println(consoante);
        }
        System.out.println("Quantidade: "+quantCons);
    }
}
