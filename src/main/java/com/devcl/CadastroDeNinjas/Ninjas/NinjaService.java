package com.devcl.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Injeção de dependência - Serve para dar permissão a camada Service de acessar o Repository, que por sua vez se conecta ao BD
//Para realizar cria-se uma variável do tipo Repository e cria um constructor a partir dela
@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> listarNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    public NinjaDTO listarNinjasId(Long id) {
        Optional<NinjaModel> ninjas = ninjaRepository.findById(id);
        return ninjas.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    public NinjaDTO alterarNinja(Long id, NinjaDTO ninjaDTO) {
        Optional<NinjaModel> ninja = ninjaRepository.findById(id);
        if (ninja.isPresent()) {
            NinjaModel ninjaAtual = ninjaMapper.map(ninjaDTO);
            ninjaAtual.setId(id);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtual);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }

    public void deletarNinja(Long id) {
        ninjaRepository.deleteById(id);
    }
}
