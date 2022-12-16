package lr4;
//Напишите программу, которая выводит в консольное окно прямоугольный треугольник;
public class example2 {
    public static void main(String[] args) {
        int height = 9;
        int z = 0;
        for (int i = 1; i <= height; i++) {
            System.out.print("nomer str: " + i + ": ");
            for (int j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z = z + 1;
            System.out.println(" kol-vo simv v str " + z);
        }
    }
}