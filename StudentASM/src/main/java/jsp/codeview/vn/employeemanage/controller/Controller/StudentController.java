package jsp.codeview.vn.employeemanage.controller.Controller;

import jsp.codeview.vn.employeemanage.controller.entity.Student;
import jsp.codeview.vn.employeemanage.controller.service.StudentService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@SpringBootApplication
@Controller
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) { this.studentService = studentService; }

    @GetMapping("/list")
    public String listStudent(Model theModel) {
        List<Student> theStudent = studentService.findAll();
        theModel.addAttribute("students", theStudent);
        return "list-students";
    }

    @GetMapping("/add")
    public String addStudent(Model theModel) {
        Student theStudent = new Student();
        theModel.addAttribute("students", theStudent);
        return "add-student-form";
    }

    @PostMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("studentId") int theId,
                                    Model theModel) {

        Student theStudent = studentService.findById(theId);

        theModel.addAttribute("students", theStudent);

        return "add-student-form";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student theStudent) {
        studentService.save(theStudent);
        return "redirect:/students/list";
    }

    @PostMapping("/delete")
    public String deleteStudent(@RequestParam("studentId") int theId) {
        studentService.deleteById(theId);
        return "redirect:/students/list";
    }
}
