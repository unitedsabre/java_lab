package lr4;
//Напишите программу, в которой создается двумерный массив, который выводит прямоугольный треугольник
public class example4 {
    public static void main(String[] args) {
        int vis = 9;
        int[][] treyg = new int[vis][];
        int z = 0;
        for (int i = 0; i < treyg.length; i++) {
            int j = i + 1;
            treyg[i] = new int[j];
        }
        for (int i = 0; i < vis; i++) {
            for (int j = 0; j < i + 1; j++) {
                treyg[i][j] = 2;
            }
        }
        for (int i = 0; i < vis; i++) {
            int y = i + 1;
            System.out.print("nomer str: " + y + ": ");
            for (int j = 0; j < treyg[i].length; j++) {
                System.out.print(treyg[i][j] + " ");
                z++;
            }
            System.out.println(" kol-vo simv v str " + z);
            z = 0;
        }
    }
}
