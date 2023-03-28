package exception;

public class InvalidBirthDateException extends RuntimeException{

    public InvalidBirthDateException(String message){
        super(message);
    }
}
