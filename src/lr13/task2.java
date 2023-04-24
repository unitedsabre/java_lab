package lr13;

public class task2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
    }

    static class MyThread implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}