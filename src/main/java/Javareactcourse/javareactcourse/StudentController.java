package Javareactcourse.javareactcourse;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
	@GetMapping
	public List<Student> getAllStudents(){
		return List.of(
				new Student(
						UUID.randomUUID(),
						"James", "Bond",
						"jamesbonde@mail.com",
						Student.Gender.MALE
						),
				new Student(
						UUID.randomUUID(),
						"Elisa",
						"Tamara",
						"elisatamara@mail.com",
						Student.Gender.FEMALE
						)
				);
	}
}
