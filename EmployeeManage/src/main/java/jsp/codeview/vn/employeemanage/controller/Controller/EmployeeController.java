package jsp.codeview.vn.employeemanage.controller.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import jsp.codeview.vn.employeemanage.controller.entity.Employee;
import jsp.codeview.vn.employeemanage.controller.service.EmployeeService;

import java.util.List;

@SpringBootApplication
@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService) { employeeService = theEmployeeService; }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        List<Employee> theEmployees = employeeService.findAll();
        theModel.addAttribute("employees", theEmployees);
        return "list-employees";
    }

    @GetMapping("/add")
    public String addEmployees(Model theModel) {
        List<Employee> theEmployees = employeeService.findAll();
        theModel.addAttribute("employees", theEmployees);
        return "list-employees";
    }
}
