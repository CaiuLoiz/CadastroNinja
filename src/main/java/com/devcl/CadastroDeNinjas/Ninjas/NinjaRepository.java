package com.devcl.CadastroDeNinjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;

//JPA - É uma abstração para utilizar o BD, como queries
//ORM - OBJECT RELATIONAL MAPPING ou Mapeamento de Objeto Relacional
//Tem ORM - É responsável por fazer leitura nas Classes e criar tabelas utilizando o Hibernate
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
