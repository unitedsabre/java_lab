package lr6;

import java.util.Arrays;

//Напишите программу со статическим методом, аргументом которому передается
//одномерный символьный массив. В результате вызова метода элементы массива попарно
//меняются местами: первый — с последним, второй — с предпоследним и так далее
public class example9 {
    public static void main(String[] args) {
        char[] arrayChar = {'a','n','t','o','n'};

        char[] arrayCharResult = getChar(arrayChar);
        System.out.println(Arrays.toString(arrayCharResult));

    }
    public static char[] getChar(char arrayChar[]) {
        char[] reverseCharArray;
        char changeChar;
        int l = arrayChar.length-1;
        reverseCharArray = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            changeChar = arrayChar[i];
            reverseCharArray[i] = arrayChar[l-i];
            reverseCharArray[l-i] = changeChar;
        }
        return reverseCharArray;
    }
}
