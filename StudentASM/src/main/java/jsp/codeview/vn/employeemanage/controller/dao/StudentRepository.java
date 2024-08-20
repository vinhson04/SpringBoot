package jsp.codeview.vn.employeemanage.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import jsp.codeview.vn.employeemanage.controller.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findAllByfullname(String fullName);
}
