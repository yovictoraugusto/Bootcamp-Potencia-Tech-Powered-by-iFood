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
public class fizzBuzz {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        
        int num = number.nextInt();
        confere(num);
    }
    
    static void confere (int num){
        if ((num%5==0)&&(num%3==0)){
            System.out.println("FizzBuzz");
        }else if(num%5==0){
            System.out.println("Buzz");
        }else if(num%3==0){
            System.out.println("Fizz");
        }else{
            System.out.println(num);
        }
    }
}
