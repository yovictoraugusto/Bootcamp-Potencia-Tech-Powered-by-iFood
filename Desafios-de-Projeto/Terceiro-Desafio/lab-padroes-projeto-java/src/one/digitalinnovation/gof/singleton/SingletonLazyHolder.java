package one.digitalinnovation.gof.singleton;

/**
 * Singleton "LazyHolder"
 */

public class SingletonLazyHolder {
    private static class InstanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder(){ //private garante que ninguém externamente instancie
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
