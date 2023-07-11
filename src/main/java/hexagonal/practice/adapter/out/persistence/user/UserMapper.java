package hexagonal.practice.adapter.out.persistence.user;

import hexagonal.practice.domain.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toDomain(UserJpaEntity entity) {
        return User.builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .password(entity.getPassword())
                .name(entity.getName())
                .build();
    }

    public UserJpaEntity toEntity(User domain) {
        return UserJpaEntity.builder()
                .id(domain.getId())
                .userId(domain.getUserId())
                .password(domain.getPassword())
                .name(domain.getName())
                .build();
    }
}
