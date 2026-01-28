package com.devcl.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;
//Esta camada Controller cria rotas para o servidor
//Ela está mais próxima do usuário permitindo ele fazer requisições
@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/ninja")
    public String message() { return "Página do Ninja"; }
    @PostMapping("/adicionar")
    public String criarNinja() { return "Ninja Criado"; }
    @GetMapping("/mostrar")
    public String mostrarNinjas() { return "Todos os Ninjas"; }
    @GetMapping("/mostrar_id")
    public String mostrarNinjasId() { return "Todos os Ids Ninja"; }
    @PutMapping("/alterar")
    public String alterarNinjaId() { return "Alterar Ninja"; }
    @DeleteMapping("/deletar")
    public String criarNinjaId() { return "Deletar Ninja"; }
}
