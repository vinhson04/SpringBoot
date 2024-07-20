package jsp.codeview.vn.employeemanage.controller.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import jsp.codeview.vn.employeemanage.controller.entity.Feedback;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    public List<Feedback> findAllByOrderByNameAsc();
}