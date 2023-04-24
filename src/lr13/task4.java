package lr13;

public class task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new MyRunnable(i));
            thread.start();
        }
    }
}

class MyRunnable implements Runnable {
    private int number;

    public MyRunnable(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Поток " + number);
    }
}