CREATE TABLE cliente (
    id UUID PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    cpf_cnpj VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE cliente_emails (
    cliente_id UUID NOT NULL,
    emails VARCHAR(255) NOT NULL,
    CONSTRAINT fk_cliente_emails_cliente FOREIGN KEY (cliente_id) REFERENCES cliente (id) ON DELETE CASCADE
);

CREATE TABLE cliente_telefones (
    cliente_id UUID NOT NULL,
    telefones VARCHAR(30) NOT NULL,
    CONSTRAINT fk_cliente_telefones_cliente FOREIGN KEY (cliente_id) REFERENCES cliente (id) ON DELETE CASCADE
);
