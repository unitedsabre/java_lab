package lr5;
//Напишите программу с классом, в котором есть два закрытых целочисленных поля (назовем их max и min).
// Значение поля max не может быть меньше значения поля min.
// Значения полям присваиваются с помощью открытого метода.
// Метод может вызываться с одним или двумя целочисленными аргументами.
// При вызове метода значения полям присваиваются так: сравниваются текущие значения полей и значения аргументов,
// переданных методу. Самое большое из значений присваивается полю max,
// а самое маленькое из значений присваивается полю min. Предусмотрите конструктор,
// который работает по тому же принципу, что и метод для присваивания значений полям.
// В классе также должен быть метод, отображающий в консольном окне значения полей объекта.
public class example6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6(3, 6);
        task6.Check();

        task6 = new Task6(2);
        task6.Check();

        task6.SetInt(1,4);
        task6.Check();

        task6.SetInt(-2);
        task6.Check();
    }
}
class Task6 {
    private int max;
    private int min;

    public void SetInt(int n1, int n2) {
        System.out.println("Метод с двумя аргументами");
        max = Math.max(n1, n2);
        min = Math.min(n1, n2);
    }
    public void SetInt(int n) {
        System.out.println("Метод с одним аргументам");
        max = Math.max(max, n);
        min = Math.min(min, n);
    }
    Task6(int n1, int n2) {
        System.out.println("Конструктор с двумя аргументами");
        max = Math.max(n1, n2);
        min = Math.min(n1, n2);
    }
    Task6(int n) {
        System.out.println("Конструктор с одним аргументам");
        max = Math.max(max, n);
        min = Math.min(min, n);
    }
    void Check() {
        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }
}