package com.devcl.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {
    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> mostrarMissoes() { return missoesRepository.findAll(); }

    public MissoesModel mostrarMissoesId(Long id) {
        Optional<MissoesModel> missoesModel = missoesRepository.findById(id);
        return missoesModel.orElse(null);
    }

    public MissoesModel criarMissao(MissoesModel missoesModel) {
        return missoesRepository.save(missoesModel);
    }

    public MissoesModel alterarMissao(Long id, MissoesModel missoesModel) {
        if (missoesRepository.existsById(id)) {
            missoesModel.setId(id);
            return missoesRepository.save(missoesModel);
        }
        return null;
    }

    public void deletarMissaoId(Long id) {
        missoesRepository.deleteById(id);
    }
}
