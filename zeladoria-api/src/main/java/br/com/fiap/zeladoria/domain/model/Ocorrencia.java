package br.com.fiap.zeladoria.domain.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_ocorrencia")
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String descricao;
    private String endereco;

    @Enumerated(EnumType.STRING)
    private StatusOcorrencia status;

    private LocalDateTime dataRegistro;

    @PrePersist
    public void prePersist() {
        this.dataRegistro = LocalDateTime.now();
        if (this.status == null) {
            this.status = StatusOcorrencia.ABERTA;
        }
    }

    // Construtores
    public Ocorrencia() {}

    public Ocorrencia(Long id, String tipo, String descricao, String endereco, StatusOcorrencia status, LocalDateTime dataRegistro) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.endereco = endereco;
        this.status = status;
        this.dataRegistro = dataRegistro;
    }

    // Getters e Setters manuais (eliminam qualquer problema com o Lombok)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public StatusOcorrencia getStatus() {
        return status;
    }

    public void setStatus(StatusOcorrencia status) {
        this.status = status;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}