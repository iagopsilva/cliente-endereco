ALTER TABLE cliente
    ADD COLUMN id_endereco UUID;

ALTER TABLE cliente
    ADD CONSTRAINT fk_cliente_endereco
        FOREIGN KEY (id_endereco) REFERENCES endereco (id);
