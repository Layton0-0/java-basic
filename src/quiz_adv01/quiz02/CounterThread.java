package quiz_adv01.quiz02;

import static quiz_adv01.quiz02.MyLogger.*;

public class CounterThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i < 6; i++) {
                sleep(1000);
                log("value: " + i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        super.run();
    }
}
