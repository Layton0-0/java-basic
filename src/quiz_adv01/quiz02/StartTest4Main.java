package quiz_adv01.quiz02;

import static java.lang.Thread.sleep;
import static quiz_adv01.quiz02.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork("A", 1000), "Thread-A");
        Thread threadB = new Thread(new PrintWork("B", 500), "Thread-B");
        threadA.start();
        threadB.start();
    }
    static class PrintWork implements Runnable {
        private String str;
        private int mills;

        public PrintWork(String str, int mills) {
            this.str = str;
            this.mills = mills;
        }

        @Override
        public void run() {
            while (true) {
                log(str);
                try {
                    sleep(mills);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
