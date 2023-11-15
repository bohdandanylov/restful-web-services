package learnspringboot.restfulwebservices.restfulwebservices.messagecontroller;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MessageController {

    private MessageSource messageSource;

    public MessageController(MessageSource messageSource){
        this.messageSource = messageSource;
    }
    @GetMapping(path = "/message-controller")
    public String messageController(){
        return "Test";
    };

    @GetMapping(path = "/message-controller-bean")
    public MessageControllerBean MessageControllerBean(){
        return new MessageControllerBean("Good Afternoon");
    };

    @GetMapping(path = "/message-controller/path-variable/{name}")
    public MessageControllerBean MessageControllerPathVariable(@PathVariable String name){
        return new MessageControllerBean(String.format("Name is %s", name));
    };

    @GetMapping(path = "/message-controller-internationalized")
    public String messageControllerInternationalized(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.afternoon.message",
                null, "Default Message", locale);
    };
}
