package quiz_mid02.quiz05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        List<Integer> list = new ArrayList<>();
        while (true) {
            int x = sc.nextInt();
            if(x == 0) break;
            list.add(x);
        }
        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
