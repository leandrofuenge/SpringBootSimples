package com.example.banco.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
@Transactional
public class MeusLimitesService {

    @PersistenceContext
    private EntityManager entityManager;

    public Double visualizarLimitesParaSaque(String cpf) {
        Query query = entityManager.createNativeQuery("SELECT MENSAL FROM SISTEMABANCOUSUARIOS WHERE CPF = :cpf");
        query.setParameter("cpf", cpf);
        Object limites = query.getSingleResult();
        if (limites != null) {
            return (Double) limites;
        } else {
            return null;
        }
    }
}
