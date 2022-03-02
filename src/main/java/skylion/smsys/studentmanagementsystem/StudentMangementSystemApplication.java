package skylion.smsys.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import skylion.smsys.studentmanagementsystem.entity.Student;
import skylion.smsys.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentMangementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentMangementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("fallak", " sher", "fsmalik@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("sheraz", " anjum", "sanjum@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("zain", " bilal", "zainbilal@gmail.com");
        studentRepository.save(student3);
    }
}
