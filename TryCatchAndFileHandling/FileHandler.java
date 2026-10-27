package TryCatchAndFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    static String copiedContent = "";

    public static void main(String[] args) {
        try {
            System.out.println("File content:");
            Reader();
            Writer();
        } catch (IOException e) {
            System.out.println("Error: \n" + e.getMessage());
        }

    }

    static void Reader() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        StringBuilder sb = new StringBuilder();

        String content;
        while ((content = reader.readLine()) != null) {
            System.out.println(content);
            sb.append(content).append(System.lineSeparator());
        }
        copiedContent = sb.toString();
        reader.close();
    }

    static void Writer() throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("text2.txt", true));
        writer.write(copiedContent);
        writer.newLine();
        writer.close();
        System.out.println("\nSuccessfully stored content in text2.txt");
    }
}
