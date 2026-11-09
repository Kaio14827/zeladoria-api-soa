package br.com.fiap.zeladoria.domain.repository;

import br.com.fiap.zeladoria.domain.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}