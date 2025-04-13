package io.github.premwadhwani24.resumeanalyzer.resumeanalyzer.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserService implements UserService {
    private final List<User> users;

    public InMemoryUserService() {
        this.users= new ArrayList<>();
    }

    @Override
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User getUserById(long Id) {
        for(User user: users) {
            if(user.getId() == Id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByName(String name) {
        for(User user: users) {
            if(user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        for(User user: users) {
            if(user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByPassword(String password) {
        for(User user: users) {
            if(user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean deleteUser(long Id) {
        User user = getUserById(Id);
        if (user != null) {
            users.remove(user);
            return true;
        }
        return false;
    }
}
