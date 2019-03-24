package com.paloit.interview.repository;

import com.paloit.interview.model.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RoleRepository {

    @PersistenceContext
    private EntityManager em;

    public Role save(Role role){
        em.persist(role);
        return role;
    }

}
