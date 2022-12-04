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
public class NomeeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	String nome;
	int idade;
	
        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0"))
                break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
    }
}
