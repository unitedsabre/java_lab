package lr7.example5;
//Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
//конструктор с текстовым параметром и метод, при вызове которого в консольном окне
//отображается название класса и значение поля. На основе суперкласса создаются два
//подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
//защищенное целочисленное поле, там есть конструктор с двумя параметрами и
//переопределен метод для отображения значений полей объекта и названия класса.
//Во втором подклассе появляется защищенное символьное поле, конструктор с двумя
//параметрами и переопределен метод, отображающий в консоли название класса и значения
//полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
//отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
//метод через объектную переменную суперкласса, которая ссылается на объект производного класса.
public class example5 {
    public static void main(String[] args) {
        sup supTest = new sup("kyky");
        supTest.classPrint();

        sub1 sub1Test = new sub1("kto", 416);
        sub1Test.classPrint();

        sub2 sub2Test = new sub2("tyt", 'A');
        sub2Test.classPrint();

        sup supTest2 = new sup(supTest.getStr1());
        supTest2.classPrint();

        sup supTest3 = new sup(supTest2.str1);
        supTest3.classPrint();
    }
}