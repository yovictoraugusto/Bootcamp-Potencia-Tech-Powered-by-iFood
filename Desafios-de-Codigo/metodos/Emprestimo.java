/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico.victor.terceirasemana.desafiocodigo.metodos;

/**
 *
 * @author victor
 */
public class Emprestimo {
    public static int getDuasParcelas(){
        return 2;
    }
    
    public static int getTresParcelas(){
        return 3;
    }
    
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    
    public static double getTaxaTresParcelas(){
        return 0.45;
    }
    
    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){
            System.out.println("O valor do empréstimos em duas parcelas: "+ (valor*getTaxaDuasParcelas()));
        }else if (parcelas == 3){
            System.out.println("O valor do empréstimos em tres parcelas: "+ (valor*getTaxaTresParcelas()));
        }else{
            System.out.println("Parcelas não aceitas");
        }
    }
}
