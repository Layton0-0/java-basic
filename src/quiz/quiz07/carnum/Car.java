package quiz.quiz07.carnum;

public class Car {

    private static int totalCars;

    private String name;

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }

    public Car(String name) {
        this.name = name;
        System.out.println("차량 구입, 이름: " + name);
        totalCars++;
    }
}
