package DAO_Example;

/**
 * Created by root on 16-2-23.
 */
public class Test {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        // 输出所有student
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo()
                    + ", Name : " + student.getName() + " ]");
        }

        // 更新一个student
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        // 得到更新后的student
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo()
                + ", Name : " + student.getName() + " ]");
    }
}
