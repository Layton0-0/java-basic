package quiz.quiz07.mathutil;

public class MathArrayUtils {

    public static int sum(int[] array) {
        int result = 0;
        for (int a : array) {
            result += a;
        }
        return result;
    }

    public static float average(int[] array) {
        return sum(array) / array.length;
    }

    public static int min(int[] array) {
        int result = array[0];
        for (int a : array) {
            if(result > a) result = a;
        }
        return result;
    }

    public static int max(int[] array) {
        int result = array[0];
        for (int a : array) {
            if(result < a) result = a;
        }
        return result;
    }

    private MathArrayUtils() {
    }
}
