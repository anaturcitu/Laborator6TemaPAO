package GenericsExamples;

import model.Avion;
import model.TipTren;
import model.Tren;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample2<T>  {

    List<T> objectsList;

 /*   public GenericsExample2(List<T> objectsList) {
        this.objectsList = objectsList;
    }*/

    public void addGenericObject(T obj){
        if(objectsList == null)
            objectsList = new ArrayList<>();
        objectsList.add(obj);

    }


    public List<T> getObjectsList(){
        for(T object : objectsList){
            if(object instanceof String)
                System.out.println("This is a string");
            else
                if(object instanceof Integer)
                    System.out.println("This is an integer");
                else
                    if(object.getClass().getSimpleName().equals("Avion"))
                        System.out.println("This a plane");
                    else System.out.println("Obiect neidentificat");
        }
        return objectsList;
    }


    public static void main(String[] args){
        String test = "test 1";
        Integer integer = 10;
        Avion avion = new Avion("Sofia", "Nice");
        Tren tren = new Tren(TipTren.TRANSPORT_PERSOANE);
        GenericsExample2<Object> genericsExample2 = new GenericsExample2<>();
        genericsExample2.addGenericObject(test);
        genericsExample2.addGenericObject(integer);
        genericsExample2.addGenericObject(avion);
        genericsExample2.addGenericObject(tren);

        System.out.println(genericsExample2.getObjectsList());
    }

}
