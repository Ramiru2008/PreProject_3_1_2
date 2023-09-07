package com.example.preproject_3_1_2.dao;

import com.example.preproject_3_1_2.model.User;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("from User", User.class).getResultList();
    }

   @Override
    public void add(User user) {
        em.persist(user);
    }

    @Override
    public User getUserById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void removeUserById(Long id) {
        User user = em.find(User.class, id);
        if (user != null) {
            em.remove(user);
        }
    }

    @Override
    public void edit(User user) {
        em.merge(user);
    }
}
