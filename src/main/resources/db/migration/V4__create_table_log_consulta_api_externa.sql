CREATE TABLE log_consulta_api_externa (
    id UUID PRIMARY KEY,
    data_hora_consulta TIMESTAMPTZ NOT NULL,
    cep_consultado VARCHAR(20) NOT NULL,
    dados_resposta TEXT NOT NULL
);
