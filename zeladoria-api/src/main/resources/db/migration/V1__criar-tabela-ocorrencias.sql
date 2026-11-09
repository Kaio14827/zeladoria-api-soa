CREATE TABLE tb_ocorrencia (
                               id BIGINT AUTO_INCREMENT PRIMARY KEY,
                               tipo VARCHAR(100) NOT NULL,
                               descricao VARCHAR(255) NOT NULL,
                               endereco VARCHAR(255) NOT NULL,
                               status VARCHAR(50) NOT NULL,
                               data_registro TIMESTAMP NOT NULL
);