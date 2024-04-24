package com.example.banco.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import com.example.banco.model.LimitesDTO;
import com.example.banco.model.LimitesPagamentoDTO;

@Service
@Transactional
public class MeusLimitesService {

    @PersistenceContext
    private EntityManager entityManager;

    public LimitesDTO visualizarLimitesParaSaque(String cpf) {
        Query query = entityManager.createNativeQuery("SELECT limite, LIMITE_MENSAL, LIMITE_SEM_CARTAO FROM tabela_limites_saque WHERE CPF = :cpf");
        query.setParameter("cpf", cpf);

        Object[] result = (Object[]) query.getSingleResult();

        if (result != null && result.length == 3) {
            Double mensal = (Double) result[0];
            Double diario = (Double) result[1];
            Double semcartao = (Double) result[2];
            return new LimitesDTO(mensal, diario, semcartao);
        } else {
            return null;
        }
    }


    public LimitesPagamentoDTO visualizarLimitesPagamento(String cpf) {
        Query query = entityManager.createNativeQuery("SELECT MENSAL_PAGAMENTO, DIARIO_PAGAMENTO, MENSAL_AGENDAMENTO_PAGAMENTO, DIARIO_AGENDAMENTO_PAGAMENTO FROM SISTEMABANCOUSUARIOS WHERE CPF = :cpf");
        query.setParameter("cpf", cpf);

        Object[] visualizarlimitepagamento = (Object[]) query.getSingleResult();

        if (visualizarlimitepagamento != null && visualizarlimitepagamento.length == 4) {

            Double MENSAL_PAGAMENTO = (Double) visualizarlimitepagamento[0];
            Double DIARIO_PAGAMENTO = (Double) visualizarlimitepagamento[1];
            Double MENSAL_AGENDAMENTO_PAGAMENTO = (Double) visualizarlimitepagamento[2];
            Double DIARIO_AGENDAMENTO_PAGAMENTO = (Double) visualizarlimitepagamento[3];
            return new LimitesPagamentoDTO(MENSAL_PAGAMENTO, DIARIO_PAGAMENTO, MENSAL_AGENDAMENTO_PAGAMENTO, DIARIO_AGENDAMENTO_PAGAMENTO);
        } else {
            return null;
        }
    }
}