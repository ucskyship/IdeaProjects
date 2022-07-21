package phoneBook;

public class UserInfoException extends Exception {
    public UserInfoException(){
        super();
    }
    public UserInfoException(String message) {
        super(message);
    }
    public UserInfoException(Throwable cause){
        super(cause);
    }
    public UserInfoException(String message, Throwable cause) {
        super(message, cause);
    }
}
