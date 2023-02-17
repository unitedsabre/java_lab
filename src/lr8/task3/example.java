package lr8.task3;

import java.io.*;

public class example {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:/lab8/task2\\input.txt"), "UTF-8"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/lab8/task2\\output.txt"), "UTF-8"));
        String line;
        int lineNumber = 1;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] words = line.split(" ");
            int count = 0;
            for (String word : words) {
                if (isConsonantWord(word)) {
                    writer.write(word + " ");
                    count++;
                }
            }

            writer.write("(Строка " + lineNumber + ", слово " + count + ")");
            writer.newLine();
            lineNumber++;
        }

        reader.close();
        writer.close();
    }

    private static boolean isConsonantWord(String word) {
        char firstLetter = word.charAt(0);

        String consonants = "бвгджзклмнпрстфхцчшщБВГДЖЗКЛМНПРСТФХЦЧШЩ";
        return consonants.indexOf(firstLetter) != -1;
    }
}