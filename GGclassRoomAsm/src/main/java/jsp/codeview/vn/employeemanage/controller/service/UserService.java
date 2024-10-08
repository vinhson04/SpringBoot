package jsp.codeview.vn.employeemanage.controller.service;

import java.util.List;

import jsp.codeview.vn.employeemanage.controller.entity.User;

public interface UserService {

    public List<User> findAll();

    public User findById(int theId);

    public void save(User theUser);

    public void deleteById(int theId);

}
