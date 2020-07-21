package test;

import dao.impl.AlumnoDAOImplHibernate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Alumno;
import utils.SiscomException;

/**
 *
 * @author  DANIEL LOZA
 */
public class Test {
    public static void main(String[] args) {
        try {
            AlumnoDAOImplHibernate dao = new AlumnoDAOImplHibernate();
            Alumno customer = new Alumno();
            customer.setNomAlu("Google");
            customer.setEdaAlu(58);
            
            //dao.saveOrUpdate(customer);
            
            //Update
            //customer.setCustomerID(1);
            //dao.saveOrUpdate(customer);
            
            //Delete
            //dao.delete(4);
            
            List<Alumno> customers = dao.findAll();
            for (Alumno c1 : customers) {
                System.out.println(c1);
            }
        } catch (SiscomException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}//End
