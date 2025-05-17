package Exp8;

/*
Take file name as input to your program through command line, If file is existing the open and
display contents of the file. After displaying contents of file ask user – 1.do you want to add the data at the end of file or
2.replace specified text in file by other text. Based on user’s response, then accept data from user and append it to file. If
file in not existing then create a fresh new file and store user data into it. Also. User should type exit on new line to stop
the program. Do this program using Character stream classes.
 */
import java.io.*;
import java.util.Scanner;

public class FileHandlingTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        String inputFile = sc.nextLine().trim() + ".txt";

        File file = new File(inputFile);

        if (file.exists()) {
            // Read and display existing file content
            System.out.println("\nDisplaying File Content:");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // Prompt for action
            System.out.println("\nChoose an option:");
            System.out.println("1. Append data at the end of file");
            System.out.println("2. Replace specific text in file");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                // Append data
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);

                System.out.println("Enter data to append (type 'exit' on a new line to stop):");
                while (true) {
                    String input = sc.nextLine();
                    if (input.equalsIgnoreCase("exit")) break;
                    bw.write(input);
                    bw.newLine();
                }

                bw.close();
                System.out.println("Data appended successfully.");

            } else if (choice == 2) {
                // Replace text
                System.out.print("Enter text to be replaced: ");
                String oldText = sc.nextLine();
                System.out.print("Enter replacement text: ");
                String newText = sc.nextLine();

                // Read entire content
                BufferedReader reader = new BufferedReader(new FileReader(file));
                StringBuilder content = new StringBuilder();
                String currentLine;
                while ((currentLine = reader.readLine()) != null) {
                    content.append(currentLine.replace(oldText, newText)).append(System.lineSeparator());
                }
                reader.close();

                // Overwrite file
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(content.toString());
                writer.close();
                System.out.println("Text replaced successfully.");
            } else {
                System.out.println("Invalid option.");
            }

        } else {
            // File does not exist, create new and write data
            System.out.println("File does not exist. Creating new file.");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Enter data to store (type 'exit' on a new line to stop):");
            while (true) {
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("exit")) break;
                bw.write(input);
                bw.newLine();
            }

            bw.close();
            System.out.println("New file created and data stored successfully.");
        }

        sc.close();
    }
}