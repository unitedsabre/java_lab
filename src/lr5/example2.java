package lr5;
//Напишите программу с классом, у которого есть два символьных поля и метод.
//Он возвращает результат, и у него нет аргументов.
//При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые
//находятся «между» символами, являющимися значениями полей объекта (из
//которого вызывается метод). Например, если полям объекта присвоены
//значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
//выводиться все символы от ‘A’ до ‘D’ включительно.
public class example2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.getSymbol('A','K');
        task2.show();
    }
}
class Task2 {
    private char ch1;
    private char ch2;

    public void getSymbol(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }
    public void show() {
        int a = ch1;
        int b = ch2;
        if (ch1 > ch2) {
            a = ch2;
            b = ch1;
        }
        int showVse = 1;
        for (int i = a; i <= b; i++) {
            System.out.println(showVse + " = " + (char) i);
            showVse++;
        }
    }
}