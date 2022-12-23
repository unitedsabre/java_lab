package lr5;
//Напишите программу с классом, у которого есть закрытое целочисленное поле.
//Значение полю присваивается с помощью открытого метода.
// Методу аргументом может передаваться целое число, а также метод может вызываться без аргументов.
// Если методы вызывается без аргументов, то поле получает нулевое значение.
// Если метод вызывается с целочисленным аргументом, то это значение присваивается полю.
// Однако если переданное аргументом методу значение превышает 100, то значением полю присваивается число 100.
// Предусмотрите в классе конструктор, который работает по тому же принципу что и метод
// для присваивания значения полю. Также в классе должен быть метод, позволяющий проверить значение поля.
public class example5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5(33);
        System.out.println("Число=" + task5.check());

        task5.SetInt(31);
        System.out.println("Число=" + task5.check());

        task5.SetInt(101);
        System.out.println("Число=" + task5.check());

        task5.SetInt(-2);
        System.out.println("Число=" + task5.check());

        task5.SetInt();
        System.out.println("Число=" + task5.check());
    }
}
class Task5 {
    private int n1;
    public void SetInt(int n) {
        System.out.println("Метод с аргуметом");
        n1 = n;
        if (n >= 100) {
            n1 = 100;
        } if (n <= 0) {
            n1  = 0;
        }
    }
    public void SetInt() {
        System.out.println("Метод без аргумента");
        n1 = 0;
    }
    public int check() {
        return n1;
    }
    Task5(int n1) {
        System.out.println("Конструктор");
        this.SetInt(n1);
    }
}