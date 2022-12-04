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
public class NumeroIguais {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int x = ler.nextInt();
        int y = ler.nextInt();
        if(x==y){
            System.out.println("Sao iguais! ");
        }else{
            System.out.println("Nao sao iguais! ");
        }
    }
}
