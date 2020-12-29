package Homework_5.dao;

import Homework_5.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static Homework_5.HibernateConfiguration.getSessionFactory;

public class Students {

    private final SessionFactory sessionFactory;
    private Session session;

    public Students() {
        sessionFactory = getSessionFactory();
    }

    public void createNewStudent(Student student) {
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        } finally {
            // sessionFactory.close();
            if (session != null) {
                session.close();
            }
        }
    }

    public Student getStudentFromDbById(Long id) {
        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Student studentFromDb = session.get(Student.class, id);
            session.getTransaction().commit();
            return studentFromDb;
        } finally {
            sessionFactory.close();
            if (session != null) {
                session.close();
            }
        }
    }

    public void deleteStudent(Long id) {

        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.delete(session.get(Student.class, id));
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
            if (session != null) {
                session.close();
            }
        }
    }

    public void updateStudent(Long id, String name, int mark) {

        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Student student = session.createQuery("SELECT s FROM Student s WHERE s.id = :id", Student.class)
                    .setParameter("id", id)
                    .getSingleResult();
            student.setName(name);
            student.setMark(mark);
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
            if (session != null) {
                session.close();
            }
        }
    }

}
