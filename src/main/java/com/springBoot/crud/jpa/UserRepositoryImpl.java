package com.springBoot.crud.jpa;

import com.springBoot.crud.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> findActiveUsers() {
        return em.createQuery(
                "select u from User u where u.active = true", User.class
        ).getResultList();
    }
}
