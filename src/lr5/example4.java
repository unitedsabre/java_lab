package lr5;
//Напишите программу с классом, у которого есть символьное и
//целочисленное поле. В классе должны быть описаны версии конструктора с
//двумя аргументами (целое число и символ – определяют значения полей), а
//также с одним аргументом типа double. В последнем случае действительная
//часть аргумента определяет код символа (значение символьного поля), а
//дробная часть (с учетом десятых и сотых) определяет значение
//целочисленного поля. Например, если аргументом передается число 65.1267,
//то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
//поле получит значение 12 (в дробной части учитываются только десятые и
//сотые).
public class example4 {
    public static void main(String[] args) {
        Task4 mytask1 = new Task4(12, 'A');
        Task4 mytask2 = new Task4(65.1267);

    }
}
class Task4 {
    private char ch1;
    private int n1;

    Task4(int n1, char ch1) {
        ch1 = ch1;
        n1 = n1;
        int length = (int) (Math.log10(n1) + 1);
        double result = (double)ch1 + (double)n1*1/Math.pow(10,length);
        System.out.println("res=" + result + " ch=" + (double)ch1 + " int=" + length);
    }
    Task4(double d){
        char ch1 = (char)d;
        n1 = (int)((d -(int)d)*100);
        System.out.println("ch = "+ch1+"; int = "+n1);
    }
}