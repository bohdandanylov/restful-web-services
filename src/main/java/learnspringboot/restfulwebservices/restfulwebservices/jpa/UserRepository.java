package learnspringboot.restfulwebservices.restfulwebservices.jpa;

import learnspringboot.restfulwebservices.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
