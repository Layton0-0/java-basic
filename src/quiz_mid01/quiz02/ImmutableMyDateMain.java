package quiz_mid01.quiz02;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = new ImmutableMyDate(2024,1,1);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025);
        date1 = date1.withMonth(2);
        date1 = date1.withDay(24);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
