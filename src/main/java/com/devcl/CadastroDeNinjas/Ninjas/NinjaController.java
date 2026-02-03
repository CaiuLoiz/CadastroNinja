package com.devcl.CadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<NinjaDTO>> mostrarNinjas() {
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    @GetMapping("/mostrar/{id}")
    public ResponseEntity<?> mostrarNinjasId(@PathVariable Long id) {
        NinjaDTO ninja = ninjaService.listarNinjasId(id);
        if (ninja != null) {
            return ResponseEntity.ok(ninja);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o id " + id + " não encontrado");
        }
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninjaModel) {
        NinjaDTO ninjaDTO = ninjaService.criarNinja(ninjaModel);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + ninjaDTO.getNome() + " de ID: " + ninjaDTO.getId());
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarNinjaId(@PathVariable Long id, @RequestBody NinjaDTO ninjaModel) {
        NinjaDTO ninja = ninjaService.alterarNinja(id, ninjaModel);
        if (ninja != null) {
            return ResponseEntity.ok(ninja);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o id " + id + " não encontrado");
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaId(@PathVariable Long id) {
        if (ninjaService.listarNinjasId(id) != null) {
            ninjaService.deletarNinja(id);
            return ResponseEntity.ok("Ninja de id " + id + " saiu do clã");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o id " + id + " não encontrado");
        }
    }
}
