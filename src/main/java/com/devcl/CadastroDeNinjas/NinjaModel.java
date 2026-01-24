package com.devcl.CadastroDeNinjas;

import jakarta.persistence.*;

//JPA (Java Persistence API)
@Entity         //Transforma uma classe em uma entidade do BD
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
}
