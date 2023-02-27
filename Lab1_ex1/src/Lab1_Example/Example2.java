package Lab1_Example;

public class Example2 {

        /*
        structuri decizionale
        if
        switch
     */

    public static void main(String[] args) {

        //if
        int x = 1001;
        int aux = 0;
        int copy = x;
        while (x > 0) {
            aux = aux * 10 + (x % 10);
            x = x / 10;
        }

        if (aux != copy) {
            System.out.println("x nu este palindrom");
        } else
            System.out.println("x este paindrom");


        //switch

        String luna = "ianuarie";

        switch (luna) {
            case "februarie":
                System.out.println("Este luna februarie.");
                break;
            case "martie":
                System.out.println("Este luna martie.");
                break;
            case "aprilie":
                System.out.println("Este luna aprilie");
                break;
            default:
                System.out.println("Este luna " + luna);
        }


        int number1 = 81;
        int number2 = number1 % 2 == 0 &&( number1 < 78 || number1 >85) ? number1 : 0;
        System.out.println(number2);

        String par = number1 % 2 == 0 ? "par" : "impar";
        System.out.println(par);

    }

}
