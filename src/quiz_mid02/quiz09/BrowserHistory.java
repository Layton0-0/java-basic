package quiz_mid02.quiz09;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> stack = new ArrayDeque<>();

    public void visitPage(String url) {
        System.out.println("방문: " + url);
        stack.push(url);
    }

    public String goBack() {
        stack.pop();
        System.out.println("뒤로 가기: " + stack.peek());
        return stack.peek();
    }
    public BrowserHistory() {
    }
}
