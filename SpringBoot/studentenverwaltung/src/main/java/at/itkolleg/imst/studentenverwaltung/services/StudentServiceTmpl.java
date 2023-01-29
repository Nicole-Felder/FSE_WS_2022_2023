package at.itkolleg.imst.studentenverwaltung.services;

import at.itkolleg.imst.studentenverwaltung.domain.Student;
import at.itkolleg.imst.studentenverwaltung.exceptions.StudentNichtGefunden;
import at.itkolleg.imst.studentenverwaltung.repositories.DbZugriffStudenten;

import java.util.List;

public class StudentServiceTmpl implements StudentenService{

    private DbZugriffStudenten dbZugriffStudenten;

    public StudentServiceTmpl(DbZugriffStudenten dbZugriffStudenten) {
        this.dbZugriffStudenten = dbZugriffStudenten;
    }

    @Override
    public List<Student> alleStudenten() {
        return this.dbZugriffStudenten.alleStudenten();
    }

    @Override
    public Student studentEinfuegen(Student student) {
        return this.dbZugriffStudenten.studentSpeichern(student);
    }

    @Override
    public Student studenMitId(Long id) throws StudentNichtGefunden {
        return this.dbZugriffStudenten.studentMitId(id);
    }

    @Override
    public List<Student> alleStudentenMitPlz(String plz) {
        return this.dbZugriffStudenten.alleStudentenAusDemOrt(plz);
    }

    @Override
    public void studentLoeschenMitId(Long id) {
        this.dbZugriffStudenten.studentLoeschenMitId(id);
    }
}
