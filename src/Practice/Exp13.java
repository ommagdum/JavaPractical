package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

/*
Write a program to read a text file one line at a time. Read each line as a String and place that
String object into a LinkedList. Print all of the lines in the LinkedList in reverse order.
 */
public class Exp13 {
    public static void main(String[] args) throws IOException {
        LinkedList<String> linkedList = new LinkedList<>();
        try{

            BufferedReader bufferedReader = new BufferedReader(new FileReader("read.txt"));
            String line;

            while((line = bufferedReader.readLine()) != null){
                linkedList.add(line);
            }

            ListIterator itr = linkedList.listIterator();

            while(itr.hasNext()){
                itr.next();
            }

            while(itr.hasPrevious()){
                System.out.println(itr.previous());
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
