package lr6;

import java.util.Arrays;

//Напишите программу со статическим методом, аргументом которому передается
//произвольное количество целочисленных аргументов. Результатом метод возвращает
//массив из двух элементов: это значения наибольшего и наименьшего значений среди
//аргументов, переданных методу.
public class example10 {
    public static void main(String[] args) {
        int[] arrayInt = getInt(12,23,54,32,11);
        System.out.println(Arrays.toString(arrayInt));

    }
    public static int[] getInt(int ... v) {
        Arrays.sort(v);
        int [] arrayInt = new int[2];
        arrayInt[0] = v[0];
        arrayInt[1] = v[v.length-1];

        return arrayInt;
    }
}
