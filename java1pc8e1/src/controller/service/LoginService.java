/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.service;

import controller.dao.UserDao;
import controller.managers.ConnectionManager;
import java.sql.Connection;
import model.User;

/**
 *
 * @author student
 */
public class LoginService {
    private LoginService() {}
    
    private static final class SingletonHolder {
        private static final LoginService SINGLETON = new LoginService();
    }
    
    public static LoginService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public boolean register(User user) {
        Connection con = ConnectionManager.getInstance().getConnection();
        UserDao userDao = new UserDao(con);
        
        User existingUser = 
                userDao.findUserByUsername(user.getUsername());
        
        if (existingUser == null) {
            userDao.adaugaUser(user);
            return true;
        }
        
        return false;
    }
    
    public boolean login(User user) {
        Connection con = ConnectionManager.getInstance().getConnection();
        UserDao userDao = new UserDao(con);
        
        User existingUser = 
                userDao.findUserByUsername(user.getUsername());
        
        if (existingUser != null) {
            if (existingUser.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        
        return false;
    }
}
