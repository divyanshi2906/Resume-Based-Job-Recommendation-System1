package io.github.premwadhwani24.resumeanalyzer.resumeanalyzer.User;

import java.util.List;
public interface UserService {

    User createUser(User user);

    List<User> getAllUser();
    User getUserById(long id);

    User getUserByName(String name);

    User getUserByEmail(String email);

    User getUserByPassword(String password);

    boolean deleteUser(long id);

}
