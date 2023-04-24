package lr13;

    public class task5 {
        private int[] arr;
        private int numThreads;

        public task5(int[] arr, int numThreads) {
            this.arr = arr;
            this.numThreads = numThreads;
        }

        public int getMax() throws InterruptedException {
            int chunks = numThreads;
            int chunkSize = arr.length / chunks;

            WorkerThread[] workerThreads = new WorkerThread[chunks];

            for (int i = 0; i < chunks; i++) {
                int startIndex = i * chunkSize;
                int endIndex = i == (chunks - 1) ? arr.length - 1 : (startIndex + chunkSize - 1);
                workerThreads[i] = new WorkerThread(startIndex, endIndex);
                workerThreads[i].start();
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < chunks; i++) {
                workerThreads[i].join();
                int chunkMax = workerThreads[i].getMax();
                if (chunkMax > max) {
                    max = chunkMax;
                }
            }
            return max;
        }

        private class WorkerThread extends Thread {
            private int startIndex;
            private int endIndex;
            private int max;

            public WorkerThread(int startIndex, int endIndex) {
                this.startIndex = startIndex;
                this.endIndex = endIndex;
                this.max = Integer.MIN_VALUE;
            }

            public int getMax() {
                return max;
            }

            @Override
            public void run() {
                for (int i = startIndex; i <= endIndex; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            int[] arr = {4, 8, 1, 7, 3, 9, 2, 5};
            task5 finder = new task5(arr, Runtime.getRuntime().availableProcessors());
            System.out.println("Max value in array: " + finder.getMax());
        }
    }