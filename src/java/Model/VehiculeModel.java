/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Metier.Vehicule;
import Utile.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author Ayoub
 */
public class VehiculeModel {
    
    public static List<Vehicule> getAllVehicule()
    {
        List<Vehicule> vehicules=new ArrayList<Vehicule>();
        Transaction tx=HibernateUtil.getSession().beginTransaction();
        Query query=HibernateUtil.getSession().createQuery("From Vehicule");
        vehicules=query.list();
        tx.commit();
        return vehicules;
        
    }
    public static void addVehicule(Vehicule vehicule)
    {
      Transaction tx=HibernateUtil.getSession().beginTransaction();
      HibernateUtil.getSession().save(vehicule);
      tx.commit();
    }
    
}
