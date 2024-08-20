package jsp.codeview.vn.employeemanage.controller.service;

import jsp.codeview.vn.employeemanage.controller.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();

    public Student findById(int theId);

    public void save(Student theStudent);

    public void deleteById(int theId);


}
