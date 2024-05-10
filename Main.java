// VANSHIKA TYAGI
// 22070126128
// AIML B-3

import java.lang.Thread;
class SumCalculator extends Thread {
    private int start;
    private int end;
    private long sum;

    public SumCalculator(int start, int end, String name) {
        super(name);
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public long getSum() {
        return sum;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
            System.out.println(Thread.currentThread().getName() + " is calculating. Current sum: " + sum);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 100;
        int numThreads = 5;
        long totalSum = 0;

        // Create threads
        SumCalculator[] threads = new SumCalculator[numThreads];
        int chunk = n / numThreads;
        int start = 1;
        int end = chunk;

        for (int i = 0; i < numThreads; i++) {
            if (i == numThreads - 1) {
                end = n;
            }
            threads[i] = new SumCalculator(start, end, "Thread-" + i);
            threads[i].setPriority(Thread.MIN_PRIORITY + i); // Set priority
            start = end + 1;
            end += chunk;
        }

        // Start threads
        for (SumCalculator thread : threads) {
            thread.start();
        }

        // Wait for threads to finish and calculate total sum
        try {
            for (SumCalculator thread : threads) {
                thread.join();
                totalSum += thread.getSum();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Total sum from 1 to " + n + " is: " + totalSum);

        // Get and set thread properties
        for (SumCalculator thread : threads) {
            System.out.println("Thread Name: " + thread.getName());
            System.out.println("Thread ID: " + thread.getId());
            System.out.println("Thread Priority: " + thread.getPriority());
            System.out.println("Is Thread Alive? " + thread.isAlive());
            System.out.println();
        }
    }
}