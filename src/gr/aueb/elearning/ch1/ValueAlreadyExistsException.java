package gr.aueb.elearning.ch1;

public class ValueAlreadyExistsException extends Exception{
    public ValueAlreadyExistsException(){

    }
    public ValueAlreadyExistsException(String s){
        super(s);
    }
}
