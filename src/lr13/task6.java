package lr13;

public class task6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int cores = Runtime.getRuntime().availableProcessors();

        SumCalculator calculator = new SumCalculator(arr, cores);

        Thread[] threads = new Thread[cores];

        for (int i = 0; i < cores; i++) {
            threads[i] = new Thread(calculator);
            threads[i].start();
        }

        try {
            for (int i = 0; i < cores; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of array elements: " + calculator.getSum());
    }
}
class SumCalculator implements Runnable {
    private int[] arr;
    private int cores;
    private int sum;
    public SumCalculator(int[] arr, int cores) {
        this.arr = arr;
        this.cores = cores;
        this.sum = 0;
    }
    @Override
    public void run() {
        int threadIndex = Thread.currentThread().getId() == 1 ? 0 : 1;

        for (int i = threadIndex; i < arr.length; i += cores) {
            sum += arr[i];
        }
    }
    public int getSum() {
        return sum;
    }
}