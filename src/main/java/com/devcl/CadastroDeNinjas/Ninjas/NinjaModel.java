package com.devcl.CadastroDeNinjas.Ninjas;

import com.devcl.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA (Java Persistence API)
@Entity         //Transforma uma classe em uma entidade do BD
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreign Key
    private MissoesModel missoes;
}
