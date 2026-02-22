package br.com.alura.desafio.screenMatch.repositorio;

import br.com.alura.desafio.screenMatch.dto.FraseDTO;
import br.com.alura.desafio.screenMatch.model.Frase;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM')")
    List<Frase> buscaFraseAleatoria(Pageable pageable);

}
