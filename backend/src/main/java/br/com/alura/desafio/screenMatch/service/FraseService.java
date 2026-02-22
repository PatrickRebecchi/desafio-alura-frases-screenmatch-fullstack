package br.com.alura.desafio.screenMatch.service;

import br.com.alura.desafio.screenMatch.dto.FraseDTO;
import br.com.alura.desafio.screenMatch.model.Frase;
import br.com.alura.desafio.screenMatch.repositorio.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFrases() {

        List<Frase> frases = repository
                .buscaFraseAleatoria(PageRequest.of(0,1));
        if (frases.isEmpty()) {
            throw new RuntimeException("Nenhuma frase encontrada");
        }

        Frase f = frases.get(0);

        return new FraseDTO(
                f.getTitulo(),
                f.getFrase(),
                f.getPersonagem(),
                f.getPoster());
    }
}
