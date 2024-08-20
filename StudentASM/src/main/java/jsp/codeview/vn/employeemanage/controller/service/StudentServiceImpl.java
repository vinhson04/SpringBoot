package jsp.codeview.vn.employeemanage.controller.service;

import jsp.codeview.vn.employeemanage.controller.dao.StudentRepository;
import jsp.codeview.vn.employeemanage.controller.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() { return studentRepository.findAll(); }

    @Override
    public Student findById(int theId) {
        Optional<Student> student = studentRepository.findById(theId);

        Student theStudent = null;

        if (student.isPresent()) {
            theStudent = student.get();
        } else {
            throw new RuntimeException("Student not found" + theId);
        }

        return theStudent;
    }

    @Override
    public void save(Student theStudent) {
        studentRepository.save(theStudent);
    }

    @Override
    public void deleteById(int theId) {
        studentRepository.deleteById(theId);
    }
}
