package personal.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JustQuestion {

    public static void main(String[] args) {
        aboutArr();
        aboutList();
    }

    static void aboutArr() {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println("first arr Size = " + list.length);
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 3) {
                list[i] = 0;
            }
        }
        System.out.println("last arr Size = " + list.length);
    }

    static void aboutList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("first arrayList Size = " + list.size());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3) {
                list.remove(3);
            }
        }
        System.out.println("last arrayList Size = " + list.size());
    }
}
