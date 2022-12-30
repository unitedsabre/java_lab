package lr6;
//Напишите программу со статическим методом, аргументом которому передается
//целочисленный массив, а результатом возвращается среднее значение для элементов
//массива (сумма значений элементов, деленная на количество элементов в массиве)
public class example8 {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        arrayInt[0] = 5;
        arrayInt[1] = 5;
        arrayInt[2] = 5;
        arrayInt[3] = 5;
        arrayInt[4] = 5;
        int resultSum = setSum(arrayInt);
        System.out.println("Среднее значение элементов=" + resultSum);

    }
    public static int setSum(int arrayInt[]) {
        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum = arrayInt[i] + sum;
        }
        int result = sum/ arrayInt.length;
        return result;
    }
}
