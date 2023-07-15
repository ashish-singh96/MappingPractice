package com.example.Mapping.Practice.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LaptopDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit");

    public void createLaptop(Laptop laptop) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(laptop);
        em.getTransaction().commit();
        em.close();
    }

    public Laptop readLaptop(String laptopId) {
        EntityManager em = emf.createEntityManager();
        Laptop laptop = em.find(Laptop.class, laptopId);
        em.close();
        return laptop;
    }

    public void updateLaptop(Laptop laptop) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(laptop);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteLaptop(String laptopId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Laptop laptop = em.find(Laptop.class, laptopId);
        em.remove(laptop);
        em.getTransaction().commit();
        em.close();
    }
}
