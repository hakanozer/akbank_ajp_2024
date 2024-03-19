package useThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UseExecutorService {

    public static void main(String[] args) {

        Runnable rn = () -> {

            try {
                ExecutorService executorService = Executors.newCachedThreadPool();
                Future<Integer> future1 = executorService.submit(new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        System.out.println("future1 Call");
                        Thread.sleep(5000);
                        return 5;
                    }
                });

                Future<Integer> future2 = executorService.submit(new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        System.out.println("future2 Call");
                        Thread.sleep(10000);
                        return 10;
                    }
                });
                System.out.println("Threads Start");
                executorService.shutdown();
                System.out.println("future1 :" + future1.get());
                System.out.println("future2 :" + future2.get());
                System.out.println("Threads Finish");
            }catch (Exception ex ){
                System.err.println("UseExecutorService Error :" + ex);
            }
        };
        new Thread(rn).start();
        System.out.println("This line call");

    }

}
