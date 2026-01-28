package com.devcl.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {
    @GetMapping("/mostrar")
    public String mostrarMissao() { return "Todas as Missões"; }
    @PostMapping("/criar")
    public String criarMissao() { return "Missão criada com sucesso"; }
    @PutMapping("/alterar")
    public String alterarMissao() { return "Missão alterada com sucesso"; }
    @DeleteMapping("/deletar")
    public String deletarMissao() { return "Missão deletada com sucesso"; }
}
