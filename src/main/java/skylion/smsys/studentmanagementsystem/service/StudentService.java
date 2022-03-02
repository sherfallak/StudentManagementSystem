package skylion.smsys.studentmanagementsystem.service;

import skylion.smsys.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();

    Student saveStudent(Student student);
}
