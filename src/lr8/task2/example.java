package lr8.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class example {
    public static void main(String[] args) throws Exception {
        File file = new File("D:/lab8/task2\\input.txt");
        file.createNewFile();

        try (PrintWriter writer = new PrintWriter(file, StandardCharsets.UTF_8)) {
            writer.println("FString");
            writer.println("SString");
            for (int i = 0; i < 7; i++) {
                double min = -5;
                double max = 15;
                double rNum = Math.random() * (max - min) + min;
                writer.println(rNum);
                }
            }
        try (Scanner in = new Scanner(new FileInputStream("D:/lab8/task2\\input.txt"), StandardCharsets.UTF_8)
                .useLocale(Locale.ROOT);
        PrintWriter writer = new PrintWriter(new FileOutputStream("D:/lab8/task2\\output.txt"), true)) {

            String fLine = in.nextLine();
            String sLine = in.nextLine();
            System.out.println("SecLine: " + sLine);
            writer.println(sLine);

            for (int i = 0; i < 7; i++) {
                if(in.hasNextDouble()) {
                    double num = Double.parseDouble(in.next());

                    if (num > 0) {
                        System.out.println("Num: " + num);
                        writer.println(num);
                    }
                } else {
                    System.out.println("No");
                    break;
                }
            }
        }
    }
}
