package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task5 {
    public static List<String> filterStrings(List<String> inputList, String substring) {
        List<String> outputList = new ArrayList<String>();
        for (String s : inputList) {
            if (s.contains(substring)) {
                outputList.add(s);
            }
        }
        return outputList;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("hello", "world", "java", "is", "fun");
        List<String> output = filterStrings(input, "o");
        System.out.println(output);
    }
}
