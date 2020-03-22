package hyj_assignment7;

import java.util.concurrent.*;

class TestSum {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        SumValueMulti c = new SumValueMulti();
        Future f1 = pool.submit(c);
        Future f2 = pool.submit(c);
        Future f3 = pool.submit(c);
        Future f4 = pool.submit(c);
        while (true) {
            try {
                System.out.println("Sum is " + f1.get().toString() + f2.get().toString()
                        + f3.get().toString() + f4.get().toString());
            } catch (Exception e) {
                e.printStackTrace();
            }

            pool.shutdown();
            break;
        }
    }
}

class SumValueMulti implements Callable {
    int[] arr = new int[1000000];
    long sum = 0;

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 1000000; i++) {
            arr[i] = (int) (Math.random() * 10);
            sum = sum + arr[i];
        }
        return sum;
    }
}