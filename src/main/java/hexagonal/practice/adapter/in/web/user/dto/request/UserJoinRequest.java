package hexagonal.practice.adapter.in.web.user.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserJoinRequest {
    String userId;
    String password;
    String name;
}
