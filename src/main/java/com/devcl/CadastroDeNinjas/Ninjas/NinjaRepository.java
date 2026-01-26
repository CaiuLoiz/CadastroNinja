package com.devcl.CadastroDeNinjas.Ninjas;

import com.devcl.CadastroDeNinjas.Missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<MissoesModel, Long> {
}
