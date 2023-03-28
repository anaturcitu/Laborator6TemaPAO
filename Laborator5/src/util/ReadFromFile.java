package util;

import java.io.*;

public class ReadFromFile {

    public static void readFileContent(){
        try {
            File file = new File("src/util/test");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null)
                System.out.println(s);
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        catch (NullPointerException exception){
            System.out.println(exception.getMessage());
        }
    }
}
