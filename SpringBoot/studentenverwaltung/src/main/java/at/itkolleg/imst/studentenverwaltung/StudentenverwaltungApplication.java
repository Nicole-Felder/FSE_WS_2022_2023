package at.itkolleg.imst.studentenverwaltung;

import at.itkolleg.imst.studentenverwaltung.domain.Student;
import at.itkolleg.imst.studentenverwaltung.repositories.DbZugriffStudenten;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentenverwaltungApplication implements ApplicationRunner {

	//Dependency-Injection; Injeziert in diese Variable ein entsprechendes Objekt vom Typ DbZugriffStudenten.
	// Unsere StudentenverwaltungApplication weiß jetzt nichts von SpringDataJPA!
	@Autowired
	DbZugriffStudenten dbZugriffStudenten;

	public static void main(String[] args) {
		SpringApplication.run(StudentenverwaltungApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception { // Wird ausgeführt, wenn SpringBoot Applikation ausgeführt wird.
		this.dbZugriffStudenten.studentSpeichern(new Student("Nicole Felder", "6020"));
		this.dbZugriffStudenten.studentSpeichern(new Student("Klaus Müller", "6460"));
		this.dbZugriffStudenten.studentSpeichern(new Student("Gisela Hauser", "6010"));
	}
}
