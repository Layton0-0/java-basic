package quiz_mid01.quiz03;

public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";

        // replace() 를 사용해서 java 라는 단어를 jvm 으로 변경해라.
        input = input.replace("java", "jvm");
        System.out.println(input);
    }
}
