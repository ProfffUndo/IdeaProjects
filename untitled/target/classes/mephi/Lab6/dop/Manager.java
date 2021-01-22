package mephi.Lab6.dop;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, double salary, int bonus) {
        super(name, salary);
        this.bonus=bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }
}
