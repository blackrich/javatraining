package synchronizedtest;

public class Main {
    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        // 여러 스레드에서 동시에 increment() 메서드 호출
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                example.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                example.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // getCount() 메서드 호출
        System.out.println("최종 Count: " + example.getCount());
    }
}
