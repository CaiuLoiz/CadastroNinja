package com.devcl.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @GetMapping("/mostrar")
    public List<MissoesModel> mostrarMissao() { return missoesService.mostrarMissoes(); }

    @GetMapping("/mostrar/{id}")
    public MissoesModel mostrarMissaoId(@PathVariable Long id) { return missoesService.mostrarMissoesId(id); }

    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missoesModel) { return missoesService.criarMissao(missoesModel); }

    @PutMapping("/alterar/{id}")
    public MissoesModel alterarMissao(@PathVariable Long id, @RequestBody MissoesModel missoesModel) {
        return missoesService.alterarMissao(id, missoesModel);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id) { missoesService.deletarMissaoId(id); }
}
