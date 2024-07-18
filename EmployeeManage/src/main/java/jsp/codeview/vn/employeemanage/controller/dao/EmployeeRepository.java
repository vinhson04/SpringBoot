package jsp.codeview.vn.employeemanage.controller.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import jsp.codeview.vn.employeemanage.controller.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByOrderByLastNameAsc();
}
