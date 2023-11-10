public class AgeException extends Exception{
    public  AgeException(){}
    public AgeException(String message) {
        super("hello" + message);
    }
    public AgeException(Throwable  cause) {
        super(cause);
    }
    public AgeException(String  message, Throwable cause){
        super(message, cause);
    }
}
