package mephi.Lab6.dop.presentation.task3.PECSExample;

import mephi.Lab6.dop.FootballPlayer;
import mephi.Lab6.dop.Runner;
import mephi.Lab6.dop.Sportsman;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Competition<Sportsman> competition = new Competition<>();
        Sportsman lebron = new Sportsman("LeBron","Basketball",205,100);
        FootballPlayer artem = new FootballPlayer("Artem","Football",190,80,"Zenit");
        FootballPlayer leo = new FootballPlayer("Lionel", "Football", 170,65,"Barca");
        FootballPlayer mohammed = new FootballPlayer("Mohammed", "Football", 180,75,"Liverpool");
        Runner usein = new Runner("Usein","Run",180, 80, 100, 9.58);
        Supplier<Runner> supplier = new Supplier<Runner>() {
            @Override
            public Runner get() {
                return new Runner();
            }
        };

    }
}
