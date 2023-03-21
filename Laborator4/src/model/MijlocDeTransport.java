package model;

public interface MijlocDeTransport {

    public String ruta();

    default String getDefaultMessage(){
        return "This is a method defined in the interface";
    }



}
