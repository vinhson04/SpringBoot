package jsp.codeview.vn.employeemanage.controller.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class DemoController {
    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("theDate", new java.util.Date());
        return "helloworld";
    }
}
