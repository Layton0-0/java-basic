package quiz_mid01.quiz03;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        // split() 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
        String[] strArr = email.split("@");
        System.out.println("ID: " + strArr[0]);
        System.out.println("Domain: " + strArr[1]);
    }
}
