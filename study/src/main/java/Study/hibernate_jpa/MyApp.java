//package Study.hibernate_jpa;
//
//
//import Study.hibernate_jpa.hibernate_jpa.Hibernate_jpa;
//import Study.hibernate_jpa.jdbc.Jdbc;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.sql.SQLException;
//
//@SpringBootApplication
//public class MyApp implements CommandLineRunner {
//
//    private final Hibernate_jpa hibernateJpa;
//
//    private final Jdbc jdbc;
//
//    public MyApp(Hibernate_jpa hibernateJpa, Jdbc jdbc) {
//        this.hibernateJpa = hibernateJpa;
//        this.jdbc = jdbc;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(MyApp.class, args);
//
//    }
//
//     @Override
//    public void run(String... args) throws SQLException {
////        saveStudentByHibernateAndJpa();
//         saveStudentByJdbc();
//    }
//
//    void saveStudentByHibernateAndJpa() {
//        Student student = new Student("Paul", "Doe", "paul.doe@example.com");
//        hibernateJpa.saveStudent(student);
//    }
//
//    void saveStudentByJdbc() throws SQLException {
//        jdbc.saveStudent();
//    }
//
//
//}
