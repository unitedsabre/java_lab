package lr13;

public class task1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + ": " + System.currentTimeMillis());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.setName("Thread 1");

        Thread thread2 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + ": " + System.currentTimeMillis());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}