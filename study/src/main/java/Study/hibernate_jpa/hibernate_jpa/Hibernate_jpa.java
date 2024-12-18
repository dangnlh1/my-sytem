package Study.hibernate_jpa.hibernate_jpa;

import Study.hibernate_jpa.Student;
import Study.hibernate_jpa.dao.StudentDao;
import org.springframework.stereotype.Component;

@Component
public class Hibernate_jpa {

    private final StudentDao studentDao;

    public Hibernate_jpa(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public boolean saveStudent(Student student) {
        studentDao.save(student);
        return true;
    }
}
