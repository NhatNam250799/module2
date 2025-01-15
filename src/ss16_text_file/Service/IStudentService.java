package Service;

import java.util.List;

import Model.Student;

public interface IStudentService {
	void addStudent(Student student);

	List<Student> getAllStudents();

	boolean deleteStudentByID(int id);

	void updateStudent(Student student);

	Student getStudentByID(int id);
}
