package TryCatchAndFileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) throws IOException{
        Reader();
    }

    static void Reader() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        System.out.println(reader.readLine());
        String content;

        while((content = reader.readLine()) != null){
            System.out.println(content);
        }
        reader.close();
    }
}
