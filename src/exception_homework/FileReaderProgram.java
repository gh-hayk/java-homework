package exception_homework;
//4.Write a program that reads a file name from the user and prints its contents to the console. If the file does not exist or cannot be opened, the program should throw an exception and print an error message.
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileOpenException extends Exception {
    public FileOpenException(String message) {
        super(message);
    }
}

public class FileReaderProgram {
    public static void readFile(String fileName) throws FileOpenException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new FileOpenException("File not found: " + fileName);

        } catch (IOException e) {
            throw new FileOpenException("Cannot read file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            readFile(fileName);

        } catch (FileOpenException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Program finished.");
            scanner.close();
        }
    }
}
