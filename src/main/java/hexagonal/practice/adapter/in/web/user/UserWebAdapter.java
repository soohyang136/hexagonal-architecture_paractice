package hexagonal.practice.adapter.in.web.user;

import hexagonal.practice.adapter.in.web.user.dto.request.UserJoinRequest;
import hexagonal.practice.application.port.in.user.UserJoinUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserWebAdapter {

    private final UserJoinUseCase userJoinUseCase;

    @PostMapping("/join")
    public void join(@RequestBody UserJoinRequest request) {
        userJoinUseCase.execute(request.getUserId(), request.getPassword(), request.getName());
    }

}
