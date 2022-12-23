package lr5;
//Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов
public class example3 {
    public static void main(String[] args) {
        int int1 = 5;
        int int2 = 7;
        Task3 mytask1 = new Task3();
        Task3 mytask2 = new Task3(int1);
        Task3 mytask3 = new Task3(int1,int2);
    }
}
class Task3 {
    private int n1;
    private int n2;

    Task3() {
        System.out.println("Конструктор без передачи");
    }
    Task3(int n1) {
        System.out.println("Конструктор с передачей одного");
        this.n1 = n1;
        System.out.println(n1);
    }
    Task3(int n1, int n2) {
        System.out.println("Конструктор с передачей двух");
        this.n1 = n1;
        this.n2 = n2;
        System.out.println(n1 + " " + n2);
    }
}
