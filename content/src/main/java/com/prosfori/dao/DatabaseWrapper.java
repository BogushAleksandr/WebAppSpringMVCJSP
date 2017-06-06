package com.prosfori.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

public class DatabaseWrapper {

    private static Configuration configuration;
    private static SessionFactory sessionFactory;

    private static DatabaseWrapper instance;


    private DatabaseWrapper() {
        configuration = new Configuration().configure("/hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();

    }

    public static DatabaseWrapper getInstance() {
        if (instance == null)
            instance = new DatabaseWrapper();
        return instance;
    }

    public void testConnection() throws Exception {
        StandardServiceRegistryBuilder regBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(regBuilder.build());
        sessionFactory.openSession();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    //TODO change return type to boolean
    public String registerUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //TODO encrypt user password before saving
        session.save(user);

        transaction.commit();
        session.close();
        return "good";
    }

    public User getUser(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //TODO rewrite getUser(id) method
        //By the way, this provides same functionality as this whole method
        //User user = session.get(User.class, id);

        //TODO fix possible sql injection
        String query = "from User as U where U.id = :id";
        User user = (User) session.createQuery(query).setParameter("id", id).getResultList().get(0);

        transaction.commit();
        session.close();

        return user;
    }

    public User getUser(String login) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        String query = "from User as U where U.login = :login";
        User user = (User) session.createQuery(query).setParameter("login", login).uniqueResult();

        transaction.commit();
        session.close();

        return user;
    }

    public List getOrders(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List list = session.createQuery("from Ordering ").getResultList();

        transaction.commit();
        session.close();
        return list;
    }

    public void makeOrder(Ordering order){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(order);

        transaction.commit();
        session.close();
    }

    public List getOrdersByUserId(int userId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        String query = "from Ordering where Ordering.userId = :userId";
        List list = session.createQuery(query).setParameter("userId", userId).getResultList();

        transaction.commit();
        session.close();
        return list;
    }

    public List<Prosfori> getProsforas() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List list = session.createQuery("from Prosfori").getResultList();

        transaction.commit();
        session.close();

        ArrayList<Prosfori> plist = new ArrayList<>(list);
        return plist;
    }

    public List<Store> getStore() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List list = session.createQuery("from Store ").getResultList();

        transaction.commit();
        session.close();

        return (List<Store>) list;
    }

    //TODO fix duplicate code here. AdminController depends on these two
    public void addProsfora(Prosfori prosfora) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(prosfora);

        transaction.commit();
        session.close();
    }

    public void addStore(Store storeEntry) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(storeEntry);

        transaction.commit();
        session.close();
    }
}
