package at.itkolleg.imst.studentenverwaltung.repositories;

import at.itkolleg.imst.studentenverwaltung.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentJPARepo extends JpaRepository<Student,Long> {
    List<Student> findAllByPlz(String plz);
}
