package jsp.codeview.vn.employeemanage.controller.service;

import jsp.codeview.vn.employeemanage.controller.dao.FeedbackRepository;
import jsp.codeview.vn.employeemanage.controller.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackServiceImpl(FeedbackRepository feedbackRepository) { this.feedbackRepository = feedbackRepository; }

    @Override
    public List<Feedback> findAll() { return feedbackRepository.findAllByOrderByNameAsc(); }

    @Override
    public Feedback findById(int theId) {
        Optional<Feedback> result = feedbackRepository.findById(theId);

        Feedback theFeedback = null;

        if (result.isPresent()) {
            theFeedback = result.get();
        } else {
            throw new RuntimeException("Feedback not found" + theId);
        }

        return theFeedback;
    }

    @Override
    public void save(Feedback theFeedback) {}

    @Override
    public void deleteById(int theId) {}

}
