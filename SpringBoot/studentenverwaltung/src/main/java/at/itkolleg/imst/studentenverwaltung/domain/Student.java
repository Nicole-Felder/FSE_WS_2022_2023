package at.itkolleg.imst.studentenverwaltung.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @Id // Festlegen des Primärschlüssels
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Die Art und Weise wie es autogeneriert werden soll (Fortlaufende Nummer)! Strategie kann ausgewählt werden.
    private Long id;

    @Size(min=2) //Automatische Validierung von Datenfeldern!
    private String name;

    @Size(min=4, max=6)
    private String plz;

    public Student(String name, String plz){
        this.name = name;
        this.plz = plz;
    }
}
