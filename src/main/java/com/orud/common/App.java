package com.orud.common;

import org.hibernate.Session;
import com.orud.persistence.HibernateUtil;

/**
 * Created by Alex on 03.06.2017.
 */
public class App {

    public static void main( String[] args ) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("1990");
        stock.setStockName("ORNAME");

        session.save(stock);
        session.getTransaction().commit();

    }
}
