package jsp.codeview.vn.employeemanage.controller.service;

import java.util.List;

import jsp.codeview.vn.employeemanage.controller.entity.Feedback;

public interface FeedbackService {

    public List<Feedback> findAll();

    public Feedback findById(int theId);

    public void save(Feedback theFeedback);

    public void deleteById(int theId);

}
