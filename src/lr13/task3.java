package lr13;

public class task3 {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumbersPrinter());
        Thread oddThread = new Thread(new OddNumbersPrinter());
        evenThread.start();
        oddThread.start();
    }
}

class EvenNumbersPrinter implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

class OddNumbersPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}