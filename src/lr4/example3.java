package lr4;
//Напишите программу, в которой создается двумерный массив, который выводи прямоугольник из цифр 2;
public class example3 {
    public static void main(String[] args) {
        int shir = 15;
        int vis = 10;
        int[][] pryam = new int[vis][shir];
        int z = 0;
        for (int i = 0; i < vis; i++) {
            for (int j = 0; j < shir; j++) {
                pryam[i][j] = 2;
            }
        }
        for (int i = 0; i < vis; i++) {
            int y = i + 1;
            System.out.print("nomer str: " + y + ": ");
            for (int j = 0; j < shir; j++) {
                System.out.print(pryam[i][j] + " ");
                z++;
            }
            System.out.println(" kol-vo simv v str " + z);
            z = 0;
        }
    }
}