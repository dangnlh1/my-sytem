package jpa_core;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;


public class JpaExample {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        // Tạo EntityManagerFactory
        emf = Persistence.createEntityManagerFactory("myJpaUnit");

        // Tạo EntityManager
        EntityManager em = emf.createEntityManager();

        // Tạo dữ liệu (Create)
        em.getTransaction().begin();
        Student student1 = new Student(1L,"Nguyen Van", "Test" , "nguyenvana@gmail.com");

//        Student student1 = new Student("Nguyen Van", "A" , "nguyenvana@gmail.com");
//        Student student2 = new Student( "Nguyen Van", "B" , "nguyenvanb@gmail.com");
        em.persist(student1);
//        em.persist(student2);
        em.getTransaction().commit();

        // Đọc dữ liệu (Read)
        List<Student> students = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        students.forEach(System.out::println);

        // Đóng EntityManager và EntityManagerFactory
        em.close();
        emf.close();
    }
}
