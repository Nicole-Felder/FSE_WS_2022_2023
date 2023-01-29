package at.itkolleg.imst.studentenverwaltung.controller;

import at.itkolleg.imst.studentenverwaltung.domain.Student;
import at.itkolleg.imst.studentenverwaltung.exceptions.StudentNichtGefunden;
import at.itkolleg.imst.studentenverwaltung.services.StudentenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Alle Methoden haben einen Response-Body d.h. dass was bei den Methoden zurück gegeben wird, als HTTP-Response verwendet wird.
// --> JSON(standardmäßig) wird produziert und als HTTP-Response zurück gegeben
@RestController
@RequestMapping("/api/v1/studenten")
public class StudentRestController {

    private StudentenService studentenService;

    public StudentRestController(StudentenService studentenService) {
        this.studentenService = studentenService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> gibAlleStudenten() {
        return ResponseEntity.ok(this.studentenService.alleStudenten());
    }

    @PostMapping
    public ResponseEntity<Student> studentEinfuegen(@RequestBody Student student){
        return ResponseEntity.ok(this.studentenService.studentEinfuegen(student));
    }

    @DeleteMapping("/{id}")
    public String studentLoeschen(Long id){
        this.studentenService.studentLoeschenMitId(id);
        return "Student gelöscht!";
    }

    @GetMapping("/mitplz/{plz}")
    public ResponseEntity<List<Student>> allesStudentenMitPlz(@PathVariable String plz){
        return ResponseEntity.ok(this.studentenService.alleStudentenMitPlz(plz));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> studentMitId(@PathVariable Long id) throws StudentNichtGefunden {
        return ResponseEntity.ok(this.studentenService.studentMitId(id));
    }
}
