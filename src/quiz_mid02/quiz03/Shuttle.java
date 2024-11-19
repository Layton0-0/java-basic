package quiz_mid02.quiz03;

public class Shuttle<T extends BioUnit> {
    private T t;
    public Shuttle() {
    }

    public void in(T t) {
        this.t = t;
    }

    public void showInfo() {
        System.out.println("이름: " + t.getName() + ", HP: " + t.getHp());
    }
}
