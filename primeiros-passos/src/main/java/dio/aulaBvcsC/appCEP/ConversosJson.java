package dio.aulaBvcsC.appCEP;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversosJson {
    @Autowired
    private Gson gson;
    public ViaCepResponse converter (String json){
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
