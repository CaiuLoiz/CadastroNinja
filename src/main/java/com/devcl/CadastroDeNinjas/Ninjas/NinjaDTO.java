package com.devcl.CadastroDeNinjas.Ninjas;

import com.devcl.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO: DATA TRANFERENCE OBJECT ou Objeto de Transferência de Dados
//É um conceito para tirar a responsabilidade de estar usando o Model diretamente nas classes
//Funciona como uma camada extra de segurança de acesso ao BD
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private MissoesModel missoes;
    private String rank;
    private String imgUrl;
}
