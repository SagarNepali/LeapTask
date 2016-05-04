/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.leaptask.dao.impl;

import com.leapfrog.leaptask.dao.UserDAO;
import com.leapfrog.leaptask.entity.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class UserDAOImpl implements UserDAO{

    EntityManagerFactory emf = null;
    EntityManager em = null;
    EntityTransaction trans = null;

    public UserDAOImpl() {
    
        emf = Persistence.createEntityManagerFactory("LeapTaskPU");
        em = emf.createEntityManager();
    }
    
    
            
            
    
    @Override
    public User login(String username, String password) {
       
        for(User u  : getAll()){
            
            if(u.getUsername().equals("username") && u.getPassword().equals("password")){
                return u;
            }
        }
        return null;
    }

    @Override
    public void insert(User u) {
        
    }

    @Override
    public List<User> getAll() {
       
        return em.createQuery("SELECT u from User u ").getResultList();
        
    }
    
}
