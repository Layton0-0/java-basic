package quiz_mid01.quiz03;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        /*
            str 문자열을 반대로 뒤집어라.
            StringBuilder 에 있는 reverse() 를 사용해라
         */
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        System.out.println(reversedStr);
    }
}
