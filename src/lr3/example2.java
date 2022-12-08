package lr3;

import java.util.Scanner;

//Напишите программу, в которой пользователю предлагается ввести название дня недели.
// По введенному названию программа определяет порядковый номер дня в неделе.
// Если пользователь вводит неправильное название дня, программа выводит сообщение о том,
// что такого дня нет. Предложите версию программы на основе вложенных условных операторов
// и на основе оператора выбора switch.
public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели(с большой буквы):");
        String day = in.nextLine();
        System.out.println("Через switch");

        switch (day) {
            case "Понедельник":
                System.out.println("Понедельник 1ый день недели");
                break;
            case "Вторник":
                System.out.println("Вторник 2ой день недели");
                break;
            case "Среда":
                System.out.println("Среда 3ий день недели");
                break;
            case "Четверг":
                System.out.println("Чертверг 4ый день недели");
                break;
            case "Пятница":
                System.out.println("Пятница 5ый день недели");
                break;
            case "Суббота":
                System.out.println("Суббота 6ой день недели");
                break;
            case "Воскресенье":
                System.out.println("Воскресенье 7ой день недели");
                break;
            default:
                System.out.println("Такого дня недели нет!");
                break;
        }

        System.out.println("Через if");

            if (day.equals("Понедельник")) {
                System.out.println("Понедельник 1ый день недели");
            } else if (day.equals("Вторник")) {
                System.out.println("Вторник 2ой день недели");
            } else if (day.equals("Среда")) {
                System.out.println("Среда 3ий день недели");
            } else if (day.equals("Четверг")) {
                System.out.println("Чертверг 4ый день недели");
            } else if (day.equals("Пятница")) {
                System.out.println("Пятница 5ый день недели");
            } else if (day.equals("Суббота")) {
                System.out.println("Суббота 6ой день недели");
            } else if (day.equals("Воскресенье")) {
                System.out.println("Воскресенье 7ой день недели");
            } else {
                System.out.println("Такого дня недели нет!");
            }
        }
    }

