package Homework_5;

import Homework_5.dao.Students;
import Homework_5.entities.Student;

public class HibernateMain {

    private final static java.util.Random rand = new java.util.Random();

    public static void main(String[] args) {

        Students studentDAO = new Students();

        for (int i = 0; i <= 1000; i++) {
            Student student = new Student("Max_" + i, rand.nextInt((5 - 1) + 1) + 1);
            studentDAO.createNewStudent(student);
        }
    }
}
