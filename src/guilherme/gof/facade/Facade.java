package guilherme.gof.facade;

import subsystem1.CrmService;
import subsystem2.CepApi;

public class Facade {
    public void migrateClient(String name, String cep) {
        String city = CepApi.getInstance().getCity(cep);
        String state = CepApi.getInstance().getState(cep);

        CrmService.SaveClient(name, cep, city, state);
    }
}
