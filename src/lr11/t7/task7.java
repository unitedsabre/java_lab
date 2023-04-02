package lr11.t7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task7 {
    public static void main(String[] args) {
        int n = 10; // количество человек
        List<Integer> circleList1 = new ArrayList<>();
        List<Integer> circleList2 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            circleList1.add(i + 1);
            circleList2.add(i + 1);
        }
        System.out.println("Игра по кругу со списком ArrayList:");
        playCircleGame(circleList1);
        System.out.println("\nИгра по кругу со списком LinkedList:");
        playCircleGame(circleList2);
    }

    public static void playCircleGame(List<Integer> circleList) {
        System.out.println("Исходный круг людей: " + circleList);
        int size = circleList.size();
        int index = 0;
        while (size > 1) {
            index = (index + 1) % size; // переход к следующему человеку
            circleList.remove(index); // удаляем каждого второго человека
            size--;
            System.out.println("Текущий круг людей: " + circleList);
        }
        System.out.println("Остался человек с номером " + circleList.get(0));
    }
}
