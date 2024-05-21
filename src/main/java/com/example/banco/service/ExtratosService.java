package com.example.banco.service;

import com.example.banco.model.ExtratosDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExtratosService {

    @PersistenceContext
    private EntityManager entityManager;

    public ExtratosDTO visualizarFaturaCartao(String cpf) {
        Query query = entityManager.createNativeQuery("SELECT sd.conta_salario, sd.fatura_do_cartao, sd.poupanca, sd.data_extratos FROM tabela_extratos sd JOIN tabela_informacoes_pessoais ip ON sd.informacoes_pessoais_id = ip.id WHERE ip.cpf = ?");
        query.setParameter(1, cpf);
        Object[] result = (Object[]) query.getSingleResult();
        if (result != null && result.length == 4) {
            Double contaSalario = (Double) result[0];
            Double faturaDoCartao = (Double) result[1];
            Double poupanca = (Double) result[2];
            String dataExtratos = (String) result[3];
            return new ExtratosDTO(contaSalario, faturaDoCartao, poupanca, dataExtratos);
        } else {
            return null;
        }
    }
}
