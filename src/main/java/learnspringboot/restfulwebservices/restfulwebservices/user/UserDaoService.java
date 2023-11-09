package learnspringboot.restfulwebservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Liam", LocalDate.now().minusYears(32)));
        users.add(new User(3, "Noah", LocalDate.now().minusYears(34)));
        users.add(new User(4, "Emma", LocalDate.now().minusYears(36)));
        users.add(new User(5, "Anna", LocalDate.now().minusYears(38)));
        users.add(new User(6, "Mila", LocalDate.now().minusYears(40)));
        users.add(new User(7, "Aria", LocalDate.now().minusYears(42)));
        users.add(new User(8, "Lily", LocalDate.now().minusYears(44)));
        users.add(new User(9, "Lucy", LocalDate.now().minusYears(46)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
