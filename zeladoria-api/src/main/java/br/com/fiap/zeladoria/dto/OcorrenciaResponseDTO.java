package br.com.fiap.zeladoria.dto;

import br.com.fiap.zeladoria.domain.model.Ocorrencia;
import br.com.fiap.zeladoria.domain.model.StatusOcorrencia;
import java.time.LocalDateTime;

public record OcorrenciaResponseDTO(
        Long id,
        String tipo,
        String descricao,
        String endereco,
        StatusOcorrencia status,
        LocalDateTime dataRegistro
) {
    public OcorrenciaResponseDTO(Ocorrencia ocorrencia) {
        this(
                ocorrencia.getId(),
                ocorrencia.getTipo(),
                ocorrencia.getDescricao(),
                ocorrencia.getEndereco(),
                ocorrencia.getStatus(),
                ocorrencia.getDataRegistro()
        );
    }
}