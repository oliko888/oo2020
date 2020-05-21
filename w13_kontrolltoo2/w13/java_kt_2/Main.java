import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> lettersList = new ArrayList<String>();
    static List<Integer> frequencyList = new ArrayList<>();

    static List<Element> elements = new ArrayList<Element>();
    static List<String> sortedLetters = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Main obj = new Main();
        obj.fileReader();
        obj.sortFrequencies();
        obj.composeHTML();
        System.out.println("Tähed esinemissageduse järjekorras:");
        System.out.println(sortedLetters);
    }

    private void fileReader() throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            Scanner readWord = new Scanner(scanner.nextLine());
            while (readWord.hasNext()) {
                String word = readWord.next();
                word = cleanString(word);

                if (!word.isEmpty()) {
                    String lastLetter = printLastLetter(word);
                    lastLetter = lastLetter.toUpperCase();
                    noteFrequency(lastLetter);
                    writeToFiles(word, lastLetter);
                }
                
            }
        }
    }

    private static String printLastLetter(String word) {
        word = word.substring(word.length() - 1);
        /* System.out.println(word); */
        return word;
    }

    private static String cleanString(String word) {
        word = word.replaceAll("[^a-zA-Z0-9]", "");
        return word;
    }

    private void noteFrequency(String lastLetter) {
        if (lettersList.contains(lastLetter)) {
            int index = lettersList.indexOf(lastLetter);
            Integer value = frequencyList.get(index);
            value = value + 1;
            frequencyList.set(index, value);
        } else {
            lettersList.add(lastLetter);
            frequencyList.add(1);
        }
    }

    private void sortFrequencies() {
        Integer[] array = frequencyList.toArray(new Integer[0]);

        for (int i = 0; i < array.length; i++) {
            elements.add(new Element(i, array[i]));
        }

        Collections.sort(elements);

        for (Element element : elements) {
            sortedLetters.add(lettersList.get(element.index));
        }
    }

    private void writeToFiles(String word, String lastLetter) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("files/" + lastLetter + ".txt", true);
            fileWriter.write(word + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void composeHTML() throws IOException {
        String header = "<!DOCTYPE html>" + "\n" +
        "<html>" + "\n" +
        "<head>" + "\n" +
        "<title>KT2</title>" + "\n" +
        "<meta name='viewport' content='width=device-width, initial-scale=1'>" + "\n" +
        "</head>" + "\n" +
        "<body>" + "\n";
        
        String footer = "</body>" + "\n" +
        "</html>";
        
        FileWriter fileWriter = new FileWriter("index.html", true);
        fileWriter.write(header);
                
        for (int i = 0; i < sortedLetters.size(); i++) {
            fileWriter.write("<a href='files/" + sortedLetters.get(i) + ".txt'>" + sortedLetters.get(i) + " | " + elements.get(i).value + "</a>" + "\n" + "<br>" + "\n");
        }

        fileWriter.write(footer);
        fileWriter.close();
    }
    
}