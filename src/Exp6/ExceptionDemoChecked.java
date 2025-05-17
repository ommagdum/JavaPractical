package Exp6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemoChecked {
    public static void main(String[] args){

        try {
            readFile();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }

    }

    static void readFile() throws FileNotFoundException {
        File file = new File("a.txt");
        FileReader fileReader = new FileReader(file);
    }
}
