package hexagonal.practice.adapter.out.persistence.user;

import hexagonal.practice.application.port.out.user.UserPort;
import hexagonal.practice.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserPersistenceAdapter implements UserPort {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    @Override
    public void saveUser(User user) {
        userJpaRepository.save(userMapper.toEntity(user));
    }
}
