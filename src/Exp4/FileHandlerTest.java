package Exp4;
/*
Create an interface FileHandler with abstract methods readFile(), writeFile(), appendFile(), and deleteFile(),
where file names are passed as strings. Implement three subclasses: TextFileHandler, CSVFileHandler, and
JSONFileHandler to handle different file formats. Write a test class FileHandlerTest to create objects of all
three subclasses and perform file operations accordingly.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

interface FileHandler{
    void readFile(String f);
    void writeFile(String f);
    void appendFile(String f);
    void deleteFile(String f);
}

class TextFileHandler implements FileHandler{

    public void readFile(String f){
        try{
            File file = new File(f);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch (FileNotFoundException e){
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }

    public void writeFile(String f){
        try{
            File file = new File(f);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This Line Is Written Thought Java.");
            fileWriter.close();
            System.out.println("File Writing Successful");
        }catch (IOException e){
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }

    public void appendFile(String  f){
        try{
            File file = new File(f);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This Line Is Written Thought Java.");
            fileWriter.close();
            System.out.println("Appending Successful");
        }catch (IOException e){
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }

    public void deleteFile(String f){
        try{
            File file = new File(f);
            if(file.delete()){
                System.out.println("File Deleted Successful");
            }else {
                System.out.println("Error In Deleting File");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

}
public class FileHandlerTest {
    public static void main(String[] args){
        TextFileHandler t = new TextFileHandler();
        t.readFile("read.txt");
        t.writeFile("write.txt");
        t.appendFile("append.txt");
        t.deleteFile("delete.txt");
    }
}
