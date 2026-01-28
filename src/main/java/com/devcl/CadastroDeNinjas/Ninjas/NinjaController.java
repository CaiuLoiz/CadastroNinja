package com.devcl.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;
//Esta camada Controller cria rotas para o servidor
//Ela está mais próxima do usuário permitindo ele fazer requisições
@RestController
@RequestMapping("/ninja")
public class NinjaController {
    @GetMapping("/mostrar")
    public String mostrarNinjas() { return "Todos os Ninjas"; }
    @GetMapping("/mostrar_id")
    public String mostrarNinjasId() { return "Todos os Ids Ninja"; }
    @PostMapping("/criar")
    public String criarNinja() { return "Ninja Criado"; }
    @PutMapping("/alterar_id")
    public String alterarNinjaId() { return "Alterar Ninja"; }
    @DeleteMapping("/deletar")
    public String deletarNinjaId() { return "Deletar Ninja"; }
}
