package Ch25;

import java.util.concurrent.atomic.AtomicInteger;

class IncrementThread3 implements Runnable {
    private static AtomicInteger counter = new AtomicInteger(0);

    public int getCounter() {
        return counter.get();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.incrementAndGet(); // 동기화된 증가 연산
            System.out.println(Thread.currentThread().getName() + "'s counter: " + counter);
        }
    }
}

public class C05ThreadMain_Ex2 {

    public static void main(String[] args) throws InterruptedException {

        IncrementThread incrementThread1 = new IncrementThread();
        IncrementThread incrementThread2 = new IncrementThread();

        Thread thread1 = new Thread(incrementThread1);
        Thread thread2 = new Thread(incrementThread2);

        thread1.start();
        thread2.start();

        // 메인 스레드가 thread1, thread2의 작업이 모두 완료될 때까지 대기하도록 설정
        thread1.join();
        thread2.join();

        System.out.println("Final value: " + incrementThread1.getCounter());

    }
}
