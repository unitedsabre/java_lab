package lr3;
// Напишите программу, в которой создается символьный массив из 10 элементов.
// Массив заполнить большими (прописными) буквами английского алфавита.
// Буквы берутся подряд, но только согласные (то есть гласные буквы ’ А','Е' и ' I'
// при присваивании значений элементам массива нужно пропустить).
// Отобразите содержимое созданного массива в консольном окне.
public class example8 {
    public static void main(String[] args) {
        int razmer = 10;
        char simv[] = new char[razmer];
        char i = 'A';
        char glasn[] = {'A', 'E', 'I', 'O', 'U', 'Y'};
        for (int x = 0; x < simv.length; i++)
        {
            for (int y = 0; y < glasn.length; y++)
            {
                if (i == glasn[y]) {
                    i++;
                }
            }
            simv[x] = i;
            System.out.println("Элемент " + x + " = " + simv[x]);
            x++;
        }
    }
}