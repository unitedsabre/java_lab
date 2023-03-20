package lr10.task2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.*;
import java.util.zip.DataFormatException;

public class taskXML {
    static String getCollectionPath() { return "src/lr10/task2/books.xml"; }

    public static void main(String[] args) {
        Document collection = getXMLDocument(getCollectionPath());
        int answer = 0;

        do{
            switch(answer) {
                case 1: showCollectionMenu(collection); break;
                case 2: add2CollectionMenu(collection); break;
                case 3: searchInCollectionMenu(collection, "year"); break;
                case 4: searchInCollectionMenu(collection, "platform"); break;
                case 5: deleteFromCollection(collection); break;
            }

            answer = mainMenu();
        } while(answer != 0);
    }

    static int mainMenu(){
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
        do{
            if(isFirst) isFirst = false;
            else System.out.println("Такого пункта нет в меню");

            System.out.print("Ваш выбор: ");

            try {
                String input = in.nextLine();

                if((input.length() - input.replace(",", "").length()) == 1 || (input.length() - input.replace(".", "").length()) == 1)
                    throw new ClassCastException("Необходимо целое число");

                answ = Integer.parseInt(input.trim());

            } catch (ClassCastException e) {
                System.out.println("Ошибка:" + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Не верный формат числа");
            }
        }while(answ < 0 || answ > 4);

        return answ;
    }

    static void showCollectionMenu(Document collection){
        System.out.println("Список книг");
        NodeList nodeList = collection.getElementsByTagName("collection");
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                printELement(node);
            }
        }
        waitForEnter();
    }

    static void add2CollectionMenu(Document collection){
        System.out.println("Добавление игры в коллекцию");

        Scanner in = new Scanner(System.in);

        String inputTitle = "";
        String inputAuthor = "";
        int inputYear = 0;

        boolean valid;
        do {
            valid = true;
            System.out.print("Введите название книги: ");
            try {
                inputTitle = in.nextLine();
                if(inputTitle.isEmpty()) throw new DataFormatException();
            }catch(DataFormatException e){
                System.out.println("Ошибка!");
                valid = false;
            }

            if(valid){
                List<Element> game = findInCollection(collection, "title", inputTitle);
                if(game.size() > 0){
                    System.out.println("Ошибка!");
                    valid = false;
                }
            }
        }while(!valid);

        do {
            valid = true;
            System.out.print("Введите автора: ");
            try {
                inputAuthor = in.nextLine();
                if(inputAuthor.isEmpty()) throw new DataFormatException();
            }catch(DataFormatException e){
                System.out.println("Ошибка!");
                valid = false;
            }
        }while(!valid);


        Date curdate = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(curdate);
        int year = calendar.get(Calendar.YEAR);

        do {
            valid = true;
            System.out.print("Введите год: ");
            try {
                inputYear = in.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Ошибка!");
                valid = false;
            }
            finally {
                in.nextLine();
            }

        }while(!valid);

        if(addInCollection(collection, inputTitle, inputAuthor, inputYear)) {
            System.out.println("\nСледующая игра была успешно добавлена:");
            List<Element> book = findInCollection(collection, "title", inputTitle);
            if(book.size() == 1) printELement(book.get(0));
        }else{
            System.out.println("Ошибка. Книга не добавлена.");
        }
        waitForEnter();
    }

    static void searchInCollectionMenu(Document collection, String searchParam) {
        Scanner in = new Scanner(System.in);
        String inputWord = "";

        System.out.print("Поиск книги ");

        switch (searchParam) {
            case "year":
                System.out.println("по году выпуска");
                inputWord = "год выпуска";
                break;
        }
        System.out.print("Введите " + inputWord + ": ");
        String searchValue = in.nextLine();

        // Ищем
        List<Element> foundElements = findInCollection(collection, searchParam, searchValue);

        if (foundElements.size() == 0)
        {
            System.out.println("В коллекции ничего не найдено");
        }else{
            System.out.println("В коллекции найдено игр - " + foundElements.size() + " :");
            for(int i=0;i<foundElements.size();i++){
                Node node = foundElements.get(i);
                printELement(node);
            }
        }
        waitForEnter();
    }

    static void deleteFromCollection(Document collection){
        System.out.println("Удаление книги");

        Scanner in = new Scanner(System.in);

        String inputTitle = "";

        List<Element> game = new ArrayList<>();
        boolean valid;
        do {
            valid = true;
            System.out.print("Введите название удаляемой книги: ");
            inputTitle = in.nextLine();

            if(inputTitle.isEmpty()) return;

            game = findInCollection(collection, "title", inputTitle);
            if(game.size() == 0){
                System.out.println("Ошибка!");
                valid = false;
            }
        }while(!valid);

        Node gameItem = game.get(0);
        System.out.println("Найдена книга: ");
        printELement(gameItem);

        System.out.println("\nВы уверены, что хотите её удалить из коллекции?");
        System.out.println("1 - Да");
        System.out.println("0 - Отмена");

        System.out.print("Ваш ответ: ");
        String answer = in.nextLine();

        if(answer.equals("1")){
            Node parentNode = gameItem.getParentNode();
            parentNode.removeChild(gameItem);
            saveFile(collection);

            System.out.println("Книга удалена");
            waitForEnter();
        }
    }

    static void printELement(Node node){
        Element element = (Element) node;
        String gtitle = element.getElementsByTagName("title").item(0).getTextContent();
        String gauthor = element.getElementsByTagName("author").item(0).getTextContent();
        int gyear = Integer.parseInt(element.getElementsByTagName("year").item(0).getTextContent());

        System.out.println("* " + gtitle + " (" + gauthor + ", " + gyear + ")");
    }

    static void waitForEnter() {
        System.out.println("Нажмите [Enter] чтобы вернуться в меню...");
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }

    static Document getXMLDocument(String filePath){
        Document ret = null;

        try{
            File inputFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            ret = dBuilder.parse(inputFile);
            ret.getDocumentElement().normalize();
        }catch (Exception e){
            e.printStackTrace();
        }

        return ret;
    }

    static List<Element> findInCollection(Document collection, String searchParam, String searchValue){
        List<Element> retList = new ArrayList();

        NodeList nodeList = collection.getElementsByTagName("collection");
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String text = element.getElementsByTagName(searchParam).item(0).getTextContent();
                if(searchValue.equals(text)) retList.add(element);
            }
        }

        return retList;
    }

    static boolean addInCollection(Document collection, String title, String platform, int year) {
        boolean ret = true;

        Element rootElement = collection.getDocumentElement();
        try {
            // Добавление игры
            Element book = collection.createElement("collection");
            rootElement.appendChild(book);

            Element gameTitle = collection.createElement("title");
            gameTitle.appendChild(collection.createTextNode(title.trim()));
            book.appendChild(gameTitle);

            Element gameAuthor = collection.createElement("author");
            gameAuthor.appendChild(collection.createTextNode(platform.trim()));
            book.appendChild(gameAuthor);

            Element gameYear = collection.createElement("year");
            gameYear.appendChild(collection.createTextNode(Integer.toString(year)));
            book.appendChild(gameYear);

            saveFile(collection);
        } catch (Exception e){
            e.printStackTrace();
            ret = false;
        }

        return ret;
    }

    public static void saveFile(Document collection){
        try {
            collection.normalizeDocument();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(collection);
            StreamResult result = new StreamResult(new File(getCollectionPath()));
            transformer.transform(source, result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}