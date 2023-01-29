package at.itkolleg.imst.studentenverwaltung.services;

import at.itkolleg.imst.studentenverwaltung.domain.Student;
import at.itkolleg.imst.studentenverwaltung.exceptions.StudentNichtGefunden;

import java.util.List;

public interface StudentenService {
    List<Student> alleStudenten();
    Student studentEinfuegen(Student student);
    Student studenMitId(Long id) throws StudentNichtGefunden;
    List<Student> alleStudentenMitPlz(String plz);
    void studentLoeschenMitId(Long id);
}
