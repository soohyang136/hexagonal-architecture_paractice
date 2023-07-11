package hexagonal.practice.application.port.out.user;

import hexagonal.practice.domain.user.User;

public interface UserPort {
    void saveUser(User user);
}
