package com.example.Mapping.Practice.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CourseDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit");

    public void createCourse(Course course) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
    }

    public Course readCourse(String courseId) {
        EntityManager em = emf.createEntityManager();
        Course course = em.find(Course.class, courseId);
        em.close();
        return course;
    }

    public void updateCourse(Course course) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(course);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteCourse(String courseId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Course course = em.find(Course.class, courseId);
        em.remove(course);
        em.getTransaction().commit();
        em.close();
    }
}

