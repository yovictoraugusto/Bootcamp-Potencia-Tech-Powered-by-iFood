package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Preguiçoso"
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){ //private garante que ninguém externamente instancie
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }
}
