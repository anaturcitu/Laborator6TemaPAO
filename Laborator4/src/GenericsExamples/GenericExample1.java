package GenericsExamples;

import model.Avion;

public class GenericExample1<T> {

    T firstGenericAttribute;

    void addGenericAttribute(T t){
        this.firstGenericAttribute = t;
    }

    public T getFirstGenericAttribute() {
        return firstGenericAttribute;
    }

    public static void main(String[] args){
        String test = "Test generic string";
        GenericExample1<String> firstExample = new GenericExample1<>();
        firstExample.addGenericAttribute(test);
        Avion avion = new Avion("Bucuresti", "Tel Aviv");
        System.out.println(firstExample.getFirstGenericAttribute());


        GenericExample1<Avion> secondExample = new GenericExample1<>();
        secondExample.addGenericAttribute(avion);
        System.out.println(secondExample.getFirstGenericAttribute());
    }
}
