package DAO_Example;

/**
 * Created by root on 16-2-23.
 */
import java.util.List;

public interface StudentDao {

    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}