package jsp.codeview.vn.employeemanage.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jsp.codeview.vn.employeemanage.controller.dao.UserRepository;
import jsp.codeview.vn.employeemanage.controller.entity.User;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) { this.userRepository = userRepository; }

    @Override
    public List<User> findAll() { return userRepository.findAll(); }

    @Override
    public User findById(int theId) {
        Optional<User> result = userRepository.findById(theId);

        User theUser = null;

        if (result.isPresent()) {
            theUser = result.get();
        } else {
            throw new RuntimeException("User not found" + theId);
        }

        return theUser;
    }

    @Override
    public void save(User theUser) { userRepository.save(theUser); }

    @Override
    public void deleteById(int theId) { userRepository.deleteById(theId); }

}
