package hibernate_core;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateExample {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Student student = new Student("John" ,"Doe", "john.doe@example.com");
            session.save(student);

            transaction.commit();
            System.out.println("Student saved successfully!");
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
