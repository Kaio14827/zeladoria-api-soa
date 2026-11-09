package br.com.fiap.zeladoria.controller;

import br.com.fiap.zeladoria.dto.OcorrenciaRequestDTO;
import br.com.fiap.zeladoria.dto.OcorrenciaResponseDTO;
import br.com.fiap.zeladoria.service.OcorrenciaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

    private final OcorrenciaService service;

    public OcorrenciaController(OcorrenciaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<OcorrenciaResponseDTO> criar(@RequestBody @Valid OcorrenciaRequestDTO dto, UriComponentsBuilder uriBuilder) {
        OcorrenciaResponseDTO response = service.criar(dto);
        URI uri = uriBuilder.path("/ocorrencias/{id}").buildAndExpand(response.id()).toUri();
        return ResponseEntity.created(uri).body(response);
    }

    @GetMapping
    public ResponseEntity<List<OcorrenciaResponseDTO>> listarTodas() {
        List<OcorrenciaResponseDTO> lista = service.listarTodas();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OcorrenciaResponseDTO> buscarPorId(@PathVariable Long id) {
        OcorrenciaResponseDTO response = service.buscarPorId(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OcorrenciaResponseDTO> atualizar(@PathVariable Long id, @RequestBody @Valid OcorrenciaRequestDTO dto) {
        OcorrenciaResponseDTO response = service.atualizar(id, dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}