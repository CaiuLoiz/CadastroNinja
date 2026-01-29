package com.devcl.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

//Injeção de dependência - Serve para dar permissão a camada Service de acessar o Repository, que por sua vez se conecta ao BD
//Para realizar cria-se uma variável do tipo Repository e cria um constructor a partir dela
@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }
}
