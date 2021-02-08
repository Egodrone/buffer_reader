package se.lexicon;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Ex2 {
    public static void main(String[] args) {
        File url = new File("destination/example.txt");
        for (String string : read(url)) {
            System.out.println(string);
        }
    }

    public static List<String> read(File source) {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                strings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
}
