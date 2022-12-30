package lr6;
//Напишите программу со статическим методом, которым вычисляется сумма
//квадратов натуральных чисел 12 + 22 + 32 + ... + п2. Число п передается аргументом методу.
//Для проверки результата можно использовать формулу 12 + 22 +32+…+n2=(n+l) (2n + 1)/6
public class example5 {
    public static void main(String[] args) {
        int x = kvadSum(6);
        for (int i = x; i > 1; i -= 2) ;
        System.out.println("Сумма квадратов=" + x);

        int y = 6;
        int prov = ((y*(y+1)*(2*y+1))/6);
        System.out.println("Проверка=" + prov);

    }
    public static int kvadSum(int n) {
        int result = 0;
        int a = n;
        int b = 2;
        for (int i = n; i > 0; i--) {
            result = (int)Math.pow(a,b) + result;
            a--;
        }
        return result;
    }
}
