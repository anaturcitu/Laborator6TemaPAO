package Lab1_Example;

import java.util.Scanner;

public class Example3 {
      /*
        while
        do while
        for
     */

    public static void main(String[] args) {

        //while
        int x = 1455;
        while (x > 0) {
            System.out.println(x);
            x = x / 2;
        }


        //for
        char[] list = {'1', 'a', 'c'};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }


        //do while
        Scanner scanner = new Scanner(System.in);
        System.out.println("List length: ");
        int listLength = scanner.nextInt();
        char[] charsList = new char[listLength];
        char character = 0;
        int i = 0;
        do {
            System.out.println("Char: ");
            character = scanner.next().charAt(0);
            charsList[i] = character;
            i++;
        }
        while (i < listLength);
        System.out.println(charsList);


    }

}

