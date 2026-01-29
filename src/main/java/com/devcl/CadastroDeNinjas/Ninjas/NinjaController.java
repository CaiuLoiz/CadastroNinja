package com.devcl.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//Esta camada Controller cria rotas para o servidor
//Ela está mais próxima do usuário permitindo ele fazer requisições
@RestController
@RequestMapping("/ninja")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/mostrar")
    public List<NinjaModel> mostrarNinjas() { return ninjaService.listarNinjas(); }

    @GetMapping("/mostrar/{id}")
    public NinjaModel mostrarNinjasId(@PathVariable Long id) { return ninjaService.listarNinjasId(id); }

    @PostMapping("/criar")
    public String criarNinja() { return "Ninja Criado"; }

    @PutMapping("/alterar_id")
    public String alterarNinjaId() { return "Alterar Ninja"; }

    @DeleteMapping("/deletar")
    public String deletarNinjaId() { return "Deletar Ninja"; }
}
