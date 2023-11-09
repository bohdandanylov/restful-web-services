package learnspringboot.restfulwebservices.restfulwebservices.messagecontroller;

public class MessageControllerBean {
    @Override
    public String toString() {
        return "MessageControllerBean{" +
                "message='" + message + '\'' +
                '}';
    }

    private String message;

    public MessageControllerBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
