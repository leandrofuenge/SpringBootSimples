package com.example.banco.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
@Transactional
public class ContaService {

    @PersistenceContext
    private EntityManager entityManager;

    public Double visualizarSaldoDisponivel(String cpf) {
        Query query = entityManager.createNativeQuery("SELECT sd.saldo_disponivel FROM tabela_saldo_disponivel sd JOIN tabela_informacoes_pessoais ip ON sd.informacoes_pessoais_id = ip.id WHERE ip.cpf = :cpf");
        query.setParameter("cpf", cpf);
        try {
            Object result = query.getSingleResult();
            // Convertendo o resultado para Double
            if (result != null) {
                return ((Number) result).doubleValue();
            } else {
                return null;
            }
        } catch (NoResultException e) {
            return null;
        }
    }
}
