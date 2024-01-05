package learnspringboot.restfulwebservices.restfulwebservices.jpa;

import learnspringboot.restfulwebservices.restfulwebservices.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
