/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.leaptask.dao;

import com.leapfrog.leaptask.entity.User;
import java.util.List;



/**
 *
 * @author user
 */
public interface UserDAO {
    
    User login(String username, String password);
    void insert(User u);
    List<User> getAll();
    
}
