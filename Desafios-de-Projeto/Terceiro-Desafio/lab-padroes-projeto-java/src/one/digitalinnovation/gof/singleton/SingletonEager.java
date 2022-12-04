package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){ //private garante que ninguém externamente instancie
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
