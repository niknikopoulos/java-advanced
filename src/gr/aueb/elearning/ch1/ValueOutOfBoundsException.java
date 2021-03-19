package gr.aueb.elearning.ch1;

import javax.sound.midi.Soundbank;

public class ValueOutOfBoundsException extends Exception{
    public ValueOutOfBoundsException(){

    }
    public ValueOutOfBoundsException(String s){
        super(s);
    }
}
