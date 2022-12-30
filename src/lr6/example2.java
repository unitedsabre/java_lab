package lr6;
//Напишите программу с классом, в котором есть закрытое статическое
//целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//статический метод, при вызове которого отображается текущее значение статического
//поля, после чего значение поля увеличивается на единицу.
public class example2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.show();
        task2.show();
    }
}
class Task2 {
        private static int int1;

        public static void show() {
            System.out.println(int1);
            int1++;
        }
    }