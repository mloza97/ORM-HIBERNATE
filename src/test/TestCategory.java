package test;

import dao.impl.GrupoDAOImplHibernate;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Grupo;
import utils.SiscomException;

/**
 *
 * @author DANIEL LOZA
 */
public class TestCategory {
    public static void main(String[] args) {
        try {
            GrupoDAOImplHibernate dao = new GrupoDAOImplHibernate();
            Grupo category = new Grupo();
            category.setCveGru("Muchas bebidas");
            category.setNomGru("Bebidas");

            dao.saveOrUpdate(category);
        } catch (SiscomException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}//End class
