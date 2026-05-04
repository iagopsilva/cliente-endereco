CREATE TABLE endereco (
    id UUID PRIMARY KEY,
    cep VARCHAR(20) NOT NULL,
    logradouro VARCHAR(150),
    numero VARCHAR(10) NOT NULL,
    complemento VARCHAR(100),
    bairro VARCHAR(100),
    cidade VARCHAR(100) NOT NULL,
    estado VARCHAR(50)
);
