package com.example.banco.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
@Transactional
public class ContaService {

    @PersistenceContext
    private EntityManager entityManager;

    public Double visualizarSaldoDisponivel(String cpf) {
        Query query = entityManager.createNativeQuery("SELECT saldodisponivel FROM SISTEMABANCOUSUARIOS WHERE cpf = :cpf");
        query.setParameter("cpf", cpf);
        Object result = query.getSingleResult();
        if (result != null) {
            return (Double) result;
        } else {
            return null;
        }
    }
}
