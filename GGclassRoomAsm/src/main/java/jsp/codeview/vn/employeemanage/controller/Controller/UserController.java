package jsp.codeview.vn.employeemanage.controller.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jsp.codeview.vn.employeemanage.controller.entity.User;
import jsp.codeview.vn.employeemanage.controller.service.UserService;

import java.util.List;

@SpringBootApplication
@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) { this.userService = userService; }

    @GetMapping("/list")
    public String listUser(Model theModel) {
        List<User> TheUser = userService.findAll();
        theModel.addAttribute("users", TheUser);
        return "list-users";
    }

    @GetMapping("/add")
    public String addUser(Model theModel) {
        User theUser = new User();
        theModel.addAttribute("users", theUser);
        return "add-user-form";
    }

    @PostMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("userId") int theId,
                                    Model theModel) {

        // get the employee from the service
        User theUser = userService.findById(theId);

        // set employee as a model attribute to pre-populate the form
        theModel.addAttribute("users", theUser);

        // send over to our form
        return "add-user-form";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User theUser) {

        // save the Feedback
        userService.save(theUser);

        // use a redirect to prevent duplicate submissions
        return "redirect:/users/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("userId") int theId) {

        // delete the Feedback
        userService.deleteById(theId);

        // redirect to /Feedback/list
        return "redirect:/users/list";

    }
}
