package jsp.codeview.vn.employeemanage.controller.Controller;


import jsp.codeview.vn.employeemanage.controller.entity.Feedback;
import jsp.codeview.vn.employeemanage.controller.service.FeedbackService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@SpringBootApplication
@Controller
@RequestMapping("/feedbacks")
public class FeedbackController {

    private final FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) { this.feedbackService = feedbackService; }

    @GetMapping("/list")
    public String listFeedback(Model theModel) {
        List<Feedback> theFeedback = feedbackService.findAll();
        theModel.addAttribute("feedbacks", theFeedback);
        return "list-feedbacks";
    }

    @GetMapping("/add")
    public String addFeedback(Model theModel) {
        Feedback theFeedback = new Feedback();
        theModel.addAttribute("feedbacks", theFeedback);
        return "add-feedback-form";
    }

    @PostMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("feedbackId") int theId,
                                    Model theModel) {

        // get the employee from the service
        Feedback theFeedback = feedbackService.findById(theId);

        // set employee as a model attribute to pre-populate the form
        theModel.addAttribute("feedbacks", theFeedback);

        // send over to our form
        return "add-feedback-form";
    }

    @PostMapping("/save")
    public String saveFeedback(@ModelAttribute("feedback") Feedback theFeedback) {

        // save the Feedback
        feedbackService.save(theFeedback);

        // use a redirect to prevent duplicate submissions
        return "redirect:/feedbacks/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("feedbackId") int theId) {

        // delete the Feedback
        feedbackService.deleteById(theId);

        // redirect to /Feedback/list
        return "redirect:/feedbacks/list";

    }
}
