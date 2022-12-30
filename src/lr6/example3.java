package lr6;
//Напишите программу с классом, в котором есть статические методы, которым
//можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив). Методы, на основании переданных аргументов или массива,
//позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//значение из набора чисел.
public class example3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.setMax(1,10,25,5,-5);
        //task3.setMax(3);
        task3.setMin(1,10,25,5,-5);
        //task3.setMin(-2);
        task3.setSum(1,10,25,5,-5);
        //task3.setSum(6);
    }
}
 class Task3 {
    static void setMax(int ... array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Максимальное значение=" + max);
    }
    static void setMin(int ... array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Минимальное занчение=" + min);
    }
    static void setSum(int ... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        int result = sum / array.length;
        System.out.println("Среднее значение=" + result);
    }
}
