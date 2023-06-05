package com.deloitteinnovation.us.hbx.data.services;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class BaseDao {

    @Autowired
    protected EntityManager entityManager;

    protected Session getCurrentSession() {
        Session currentsession = entityManager.unwrap(Session.class);
        return currentsession;
    }
}
