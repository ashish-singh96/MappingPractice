package com.example.Mapping.Practice.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit");

    public void createBook(Book book) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
        em.close();
    }

    public Book readBook(String bookId) {
        EntityManager em = emf.createEntityManager();
        Book book = em.find(Book.class, bookId);
        em.close();
        return book;
    }

    public void updateBook(Book book) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(book);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteBook(String bookId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Book book = em.find(Book.class, bookId);
        em.remove(book);
        em.getTransaction().commit();
        em.close();
    }
}
