package quiz_mid02.quiz05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        List<Integer> list = new ArrayList<>();
        while (true) {
            int x = sc.nextInt();
            if(x == 0) break;
            list.add(x);
        }
        int sum = sum(list);
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg(sum, list.size()));
    }
    public static int sum(List<Integer> list) {
        int total = 0;
        for (int n : list) {
            total += n;
        }
        return total;
    }

    public static double avg(int sum, int n) {
        return (double) sum / n;
    }
}
