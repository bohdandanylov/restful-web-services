package learnspringboot.restfulwebservices.restfulwebservices.messagecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping(path = "/message-controller")
    public String messageController(){
        return "Test";
    };

    @GetMapping(path = "/message-controller-bean")
    public MessageControllerBean MessageControllerBean(){
        return new MessageControllerBean("Test");
    };

    @GetMapping(path = "/message-controller/path-variable/{name}")
    public MessageControllerBean MessageControllerPathVariable(@PathVariable String name){
        return new MessageControllerBean(String.format("Name is %s", name));
    };
}
