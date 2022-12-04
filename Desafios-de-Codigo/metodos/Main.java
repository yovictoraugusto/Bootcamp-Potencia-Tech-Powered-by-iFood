/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico.victor.terceirasemana.desafiocodigo.metodos;

/**
 *
 * @author victor
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora:");
        Calculadora.soma(1, 2);
        Calculadora.subtracao(5, 2);
        Calculadora.multiplicacao(5, 5);
        Calculadora.divisao(8, 2);
        
        System.out.println("");
        System.out.println("Empréstimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        
        System.out.println("");
        System.out.println("Mensagem:");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
    }
}
