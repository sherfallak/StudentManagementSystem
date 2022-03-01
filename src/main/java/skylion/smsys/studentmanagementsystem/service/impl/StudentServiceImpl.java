package skylion.smsys.studentmanagementsystem.service.impl;

import org.springframework.stereotype.Service;
import skylion.smsys.studentmanagementsystem.entity.Student;
import skylion.smsys.studentmanagementsystem.repository.StudentRepository;
import skylion.smsys.studentmanagementsystem.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
