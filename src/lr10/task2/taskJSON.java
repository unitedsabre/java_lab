package lr10.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.zip.DataFormatException;

public class taskJSON {
    static String getCollectionPath() {
        return "src/lr10/task2/example.json";
    }

    public static void main(String[] args) {
        Object collection = getJSONObject(getCollectionPath());
        int answer = 0;

        do {
            switch (answer) {
                case 1:
                    showCollectionMenu(collection);
                    break;
                case 2:
                    add2CollectionMenu(collection);
                    break;
                case 3:
                    searchInCollectionMenu(collection);
                    break;
                case 4:
                    deleteFromCollection(collection);
                    break;
            }

            answer = mainMenu();
        } while (answer != 0);
    }

    static int mainMenu() {
        System.out.flush();
        System.out.println("Выберите действие:");
        System.out.println("1 - Просмотр библиотеки");
        System.out.println("2 - Добавить книги");
        System.out.println("3 - Поиск книги");
        System.out.println("4 - Удаление кники");
        System.out.println("0 - Выход");

        int answ = -1;
        boolean isFirst = true;

        Scanner in = new Scanner(System.in);
        do {
            if (isFirst) isFirst = false;
            else System.out.println("Такого пункта нет в меню");

            System.out.print("Ваш выбор: ");

            try {
                String input = in.nextLine();

                if ((input.length() - input.replace(",", "").length()) == 1 || (input.length() - input.replace(".", "").length()) == 1)
                    throw new ClassCastException("Необходимо целое число");

                answ = Integer.parseInt(input.trim());

            } catch (ClassCastException e) {
                System.out.println("Ошибка:" + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Не верный формат числа");
            }
        } while (answ < 0 || answ > 4);

        return answ;
    }

    static void showCollectionMenu(Object collection) {
        System.out.println("Список книг");
        JSONObject jsonObject = (JSONObject) collection;
        JSONArray jsonArray = (JSONArray) jsonObject.get("collection");

        for (Object o : jsonArray) {
            JSONObject game = (JSONObject) o;
            printELement(game);
        }
        waitForEnter();
    }

    static void add2CollectionMenu(Object collection) {
        Scanner in = new Scanner(System.in);

        String inputTitle = "";
        String inputAuthor = "";
        int inputYear = 0;

        boolean valid;
        do {
            valid = true;
            System.out.println("Введите название книги: ");
            try {
                inputTitle = in.nextLine();
                if (inputTitle.isEmpty()) throw new DataFormatException();
            } catch (DataFormatException e) {
                System.out.println("Ошибка!");
                valid = false;
            }

            if (valid) {
                List<Object> game = findInCollection(collection, "title", inputTitle);
                if (game.size() > 0) {
                    System.out.println("Ошибка!");
                    valid = false;
                }
            }
        } while (!valid);

        do {
            valid = true;
            System.out.print("Введите автора: ");
            try {
                inputAuthor = in.nextLine();
                if (inputAuthor.isEmpty()) throw new DataFormatException();
            } catch (DataFormatException e) {
                System.out.println("Ошибка!");
                valid = false;
            }
        } while (!valid);


        Date curdate = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(curdate);
        int year = calendar.get(Calendar.YEAR);

        do {
            valid = true;
            System.out.print("Введите год: ");
            try {
                inputYear = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка!");
                valid = false;
            } finally {
                in.nextLine();
            }

        } while (!valid);

        if (addInCollection(collection, inputTitle, inputAuthor, inputYear)) {
            System.out.println("Книга была успешно добавлена:");
            List<Object> book = findInCollection(collection, "title", inputTitle);
            if (book.size() == 1) {
                JSONObject g = (JSONObject) book.get(0);
                printELement(g);
            }
        } else {
            System.out.println("Ошибка. Книга не добавлена.");
        }
        waitForEnter();
    }

    static void searchInCollectionMenu(Object collection) {
        Scanner in = new Scanner(System.in);

        System.out.println("Поиск книг");
        System.out.print("Введите автора: ");
        String searchValue = in.nextLine();

        // Ищем
        List<Object> foundElements = findInCollection(collection, "author", searchValue);

        if (foundElements.size() == 0) {
            System.out.println("В коллекции ничего не найдено");
        } else {
            System.out.println("Найдено  - " + foundElements.size() + " :");
            for (int i = 0; i < foundElements.size(); i++) {
                JSONObject game = (JSONObject) foundElements.get(i);
                printELement(game);
            }
        }
        waitForEnter();
    }

    static void deleteFromCollection(Object collection) {
        System.out.println("Удаление книг");

        Scanner in = new Scanner(System.in);

        String inputTitle = "";

        List<Object> game = new ArrayList<>();
        boolean valid;
        do {
            valid = true;
            System.out.print("Введите название удаляемой книги: ");
            inputTitle = in.nextLine();

            if (inputTitle.isEmpty()) return;

            game = findInCollection(collection, "title", inputTitle);
            if (game.size() == 0) {
                System.out.println("Ошибка!");
                valid = false;
            }
        } while (!valid);

        JSONObject gameItem = (JSONObject) game.get(0);
        System.out.println("Найдена книга: ");
        printELement(gameItem);

        System.out.println("\nВы уверены, что хотите её удалить?");
        System.out.println("1 - Да");
        System.out.println("0 - Отмена");

        System.out.print("Ваш ответ: ");
        String answer = in.nextLine();

        if (answer.equals("1")) {
            JSONObject jsonObject = (JSONObject) collection;
            JSONArray jsonArray = (JSONArray) jsonObject.get("collection");

            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (inputTitle.equals(book.get("title"))) {
                    iterator.remove();
                }
            }

            saveFile(collection);

            System.out.println("Книга удалена!");
            waitForEnter();
        }
    }

    static void printELement(JSONObject game) {
        String gtitle = game.get("title").toString();
        String gauthor = game.get("author").toString();
        int gyear = Integer.parseInt(game.get("year").toString());

        System.out.println("* " + gtitle + " (" + gauthor + ", " + gyear + ")");
    }

    static void waitForEnter() {
        System.out.println("Нажмите [Enter] чтобы вернуться в меню...");
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }

    static Object getJSONObject(String filePath) {
        Object ret = null;

        try {
            JSONParser parser = new JSONParser();
            ret = parser.parse(new FileReader(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ret;
    }

    static List<Object> findInCollection(Object collection, String searchParam, String searchValue) {
        List<Object> retList = new ArrayList();

        JSONObject jsonObject = (JSONObject) collection;
        JSONArray jsonArray = (JSONArray) jsonObject.get("collection");

        for (Object o : jsonArray) {
            JSONObject books = (JSONObject) o;

            String text = books.get(searchParam).toString();
            if (searchValue.equals(text)) retList.add(books);
        }

        return retList;
    }

    static boolean addInCollection(Object collection, String title, String author, int year) {
        boolean ret = true;

        JSONObject jsonObject = (JSONObject) collection;
        JSONArray jsonArray = (JSONArray) jsonObject.get("collection");
        try {
            // Добавление игры
            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);

            saveFile(collection);
        } catch (Exception e) {
            e.printStackTrace();
            ret = false;
        }

        return ret;
    }

    public static void saveFile(Object collection) {
        try {
            JSONObject jsonObject = (JSONObject) collection;
            FileWriter file = new FileWriter(getCollectionPath());
            file.write(jsonObject.toJSONString());
            file.flush();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}