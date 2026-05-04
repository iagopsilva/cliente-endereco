package com.nttdata.cliente_endereco.log.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "log_consulta_api_externa")
public class LogConsultaApiExterna {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "data_hora_consulta", nullable = false)
    private Instant dataHoraConsulta;

    @Column(name = "cep_consultado", length = 20, nullable = false)
    private String cepConsultado;

    @Column(name = "dados_resposta", nullable = false, columnDefinition = "TEXT")
    private String dadosResposta;

    public LogConsultaApiExterna(String cepConsultado, String dadosResposta) {
        this.dataHoraConsulta = Instant.now();
        this.cepConsultado = cepConsultado;
        this.dadosResposta = dadosResposta;
    }
}
