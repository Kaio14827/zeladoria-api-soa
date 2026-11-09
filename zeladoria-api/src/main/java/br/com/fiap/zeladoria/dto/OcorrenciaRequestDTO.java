package br.com.fiap.zeladoria.dto;

import br.com.fiap.zeladoria.domain.model.StatusOcorrencia;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record OcorrenciaRequestDTO(
        @NotBlank(message = "O tipo da ocorrência é obrigatório")
        String tipo,

        @NotBlank(message = "A descrição é obrigatória")
        String descricao,

        @NotBlank(message = "O endereço é obrigatório")
        String endereco,

        StatusOcorrencia status
) {}