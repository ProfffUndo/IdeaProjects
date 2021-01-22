package mephi.Lab6.dop;

public class Sportsman extends Person {

    private String sport;

    private int height;
    private int weight;

    public Sportsman(String name, String sport, int height, int weight) {
        super(name);
        this.sport=sport;
        this.height = height;
        this.weight = weight;
    }

    public Sportsman() {
        super();
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "sport='" + sport + '\'' +
                "} " + super.toString();
    }


}
