package com.devcl.CadastroDeNinjas.Missoes;

import com.devcl.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

//JPA - É uma abstração para utilizar o BD, como queries
//ORM - OBJECT RELATIONAL MAPPING
//Tem ORM (Mapeamento de Objeto Relacional) - É responsável por fazer leitura nas Classes e criar tabelas
public interface MissoesRepository extends JpaRepository<NinjaModel, Long> {
}
