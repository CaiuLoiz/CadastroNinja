package com.devcl.CadastroDeNinjas.Missoes;

import com.devcl.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<NinjaModel, Long> {
}
