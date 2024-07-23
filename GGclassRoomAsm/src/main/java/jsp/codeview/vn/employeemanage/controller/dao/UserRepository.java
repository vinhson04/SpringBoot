package jsp.codeview.vn.employeemanage.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import jsp.codeview.vn.employeemanage.controller.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    public List<User> findAllByOrderByNameAsc();
}
