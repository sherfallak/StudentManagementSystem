package skylion.smsys.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import skylion.smsys.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
