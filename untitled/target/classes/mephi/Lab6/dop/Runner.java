package mephi.Lab6.dop;

public class Runner extends Sportsman {
    int discipline;
    double record;

    public Runner(){
        super();
    }
    public Runner(String name, String sport, int height, int weight, int discipline, double record) {
        super(name, sport,height,weight);
        this.discipline = discipline;
        this.record = record;
    }

    public int getDiscipline() {
        return discipline;
    }

    public double getRecord() {
        return record;
    }

    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "discipline=" + discipline +
                ", record=" + record +
                "} " + super.toString();
    }

}
