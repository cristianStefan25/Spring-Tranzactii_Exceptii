/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ro.telacad.db.Product;

/**
 *
 * @author crist
 */
@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate template;

    public void adaugaProdus(Product product) {
        String sql = "INSERT INTO produse VALUES(NULL,?)";
        template.update(sql, product.getNume());
    }

}
