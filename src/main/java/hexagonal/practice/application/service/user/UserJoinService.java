package hexagonal.practice.application.service.user;

import hexagonal.practice.application.port.in.user.UserJoinUseCase;
import hexagonal.practice.application.port.out.user.UserPort;
import hexagonal.practice.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserJoinService implements UserJoinUseCase {

    private final UserPort userPort;

    @Override
    public void execute(String userId, String password, String name) {
        userPort.saveUser(
                User.builder()
                        .userId(userId)
                        .password(password)
                        .name(name)
                        .build()
        );
    }
}
