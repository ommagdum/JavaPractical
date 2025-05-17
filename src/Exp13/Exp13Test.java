package Exp13;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exp13Test {
    public static void main (String[] args) throws IOException {

        LinkedList<String> l = new LinkedList<String>();

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("read.txt"));
            String line;

            while((line = bufferedReader.readLine()) != null ){
                l.add(line);
            }

            ListIterator itr = l.listIterator();

            while(itr.hasNext()){

                itr.next();
            }

            while (itr.hasPrevious()){
                System.out.println(itr.previous());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
