package learnspringboot.restfulwebservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Liam", LocalDate.now().minusYears(32)));
        users.add(new User(++usersCount, "Noah", LocalDate.now().minusYears(34)));
        users.add(new User(++usersCount, "Emma", LocalDate.now().minusYears(36)));
        users.add(new User(++usersCount, "Anna", LocalDate.now().minusYears(38)));
        users.add(new User(++usersCount, "Mila", LocalDate.now().minusYears(40)));
        users.add(new User(++usersCount, "Aria", LocalDate.now().minusYears(42)));
        users.add(new User(++usersCount, "Lily", LocalDate.now().minusYears(44)));
        users.add(new User(++usersCount, "Lucy", LocalDate.now().minusYears(46)));
    }

    public List<User> findAll(){

        return users;
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }
}
