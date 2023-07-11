package hexagonal.practice.domain.user;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    Long id;
    String userId;
    String password;
    String name;
}
