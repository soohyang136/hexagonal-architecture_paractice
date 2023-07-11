package hexagonal.practice.adapter.out.persistence.user;

import jakarta.persistence.*;

@Entity
public class UserJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
}
