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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.criarNinja(ninjaModel);
    }

    @PutMapping("/alterar_id")
    public String alterarNinjaId() { return "Alterar Ninja"; }

    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaId(@PathVariable Long id) { ninjaService.deletarNinja(id); }
}
