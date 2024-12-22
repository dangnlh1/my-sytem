package hibernate_core;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateExample2 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            Query<Student> query = session.createQuery("FROM Student", Student.class);
            List<Student> students = query.list();

            for (Student student : students) {
                System.out.println("Student ID: " + student.getId());
                System.out.println("Name: " + student.getFirstName());
                System.out.println("Name: " + student.getLastName());
                System.out.println("Email: " + student.getEmail());
            }
        } finally {
            session.close();
        }
    }
}
