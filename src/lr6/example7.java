package lr6;

import java.util.Arrays;

//Напишите программу со статическим методом, аргументом которому передастся
//символьный массив, а результатом возвращается ссылка на целочисленным массив,
//состоящий из кодов символов из массива- аргумента
public class example7 {
    public static void main(String[] args) {
        char[] arrayChar = new char[5];
        arrayChar[0] = 'a';
        arrayChar[1] = 'n';
        arrayChar[2] = 't';
        arrayChar[3] = 'o';
        arrayChar[4] = 'n';

        int[] arrayCharResult = getChar(arrayChar);
        System.out.println(Arrays.toString(arrayCharResult));

    }
    public static int[] getChar(char arrayChar[]) {
        int[] intArray = new int[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            intArray[i] = (int) arrayChar[i];
        }
        return intArray;
    }
}
