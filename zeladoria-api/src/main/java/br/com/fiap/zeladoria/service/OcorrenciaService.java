package br.com.fiap.zeladoria.service;

import br.com.fiap.zeladoria.domain.model.Ocorrencia;
import br.com.fiap.zeladoria.domain.repository.OcorrenciaRepository;
import br.com.fiap.zeladoria.dto.OcorrenciaRequestDTO;
import br.com.fiap.zeladoria.dto.OcorrenciaResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OcorrenciaService {

    @Autowired
    private OcorrenciaRepository repository;

    public List<OcorrenciaResponseDTO> listarTodas() {
        return repository.findAll().stream()
                .map(OcorrenciaResponseDTO::new)
                .toList();
    }

    public OcorrenciaResponseDTO buscarPorId(Long id) {
        Ocorrencia ocorrencia = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Ocorrência não encontrada com o ID: " + id));
        return new OcorrenciaResponseDTO(ocorrencia);
    }

    @Transactional
    public OcorrenciaResponseDTO criar(OcorrenciaRequestDTO dto) {
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setTipo(dto.tipo());
        ocorrencia.setDescricao(dto.descricao());
        ocorrencia.setEndereco(dto.endereco());
        ocorrencia.setStatus(dto.status());

        Ocorrencia salva = repository.save(ocorrencia);
        return new OcorrenciaResponseDTO(salva);
    }

    @Transactional
    public OcorrenciaResponseDTO atualizar(Long id, OcorrenciaRequestDTO dto) {
        Ocorrencia ocorrencia = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Ocorrência não encontrada com o ID: " + id));

        ocorrencia.setTipo(dto.tipo());
        ocorrencia.setDescricao(dto.descricao());
        ocorrencia.setEndereco(dto.endereco());
        ocorrencia.setStatus(dto.status());

        Ocorrencia atualizada = repository.save(ocorrencia);
        return new OcorrenciaResponseDTO(atualizada);
    }

    @Transactional
    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Ocorrência não encontrada com o ID: " + id);
        }
        repository.deleteById(id);
    }
}