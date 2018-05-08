/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.service;

import controller.dao.ProdusDao;
import controller.managers.ConnectionManager;
import java.sql.Connection;
import java.util.List;
import model.Produs;

/**
 *
 * @author student
 */
public class ProductService {
    private ProductService() {}
    
    private static final class SingletonHolder {
        private static final ProductService SINGLETON = new ProductService();
    }
    
    public static ProductService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void adaugaProdus(Produs p) {
        Connection con = ConnectionManager.getInstance().getConnection();
        ProdusDao produsDao = new ProdusDao(con);
        produsDao.adaugaProdus(p);
    }
    
    public List<Produs> getProduse() {
        Connection con = ConnectionManager.getInstance().getConnection();
        ProdusDao produsDao = new ProdusDao(con);
        return produsDao.getProduse();
    }
    
    public void stergeProdus(Produs p) {
        Connection con = ConnectionManager.getInstance().getConnection();
        ProdusDao produsDao = new ProdusDao(con);
        produsDao.stergeProdus(p.getId());
    }
}
