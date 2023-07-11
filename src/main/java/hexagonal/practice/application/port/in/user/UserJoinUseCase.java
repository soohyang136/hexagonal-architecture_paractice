package hexagonal.practice.application.port.in.user;

public interface UserJoinUseCase {
    void execute(String userId, String password, String name);
}
