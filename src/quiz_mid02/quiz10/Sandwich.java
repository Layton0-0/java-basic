package quiz_mid02.quiz10;

public class Sandwich implements Comparable<Sandwich> {
    private String name;
    private int rank;
    public Sandwich(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    public String getName() {
        return name;
    }
    public int getRank() {
        return rank;
    }
    @Override
    public int compareTo(Sandwich o) {
        return o.getName().compareTo(this.getName());
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}
