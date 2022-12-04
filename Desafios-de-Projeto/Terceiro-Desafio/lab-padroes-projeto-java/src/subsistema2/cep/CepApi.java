package subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){ //private garante que ninguém externamente instancie
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Araraquara";
    }

    public String recuperarEstado(String cep){
        return "São Paulo";
    }
}
