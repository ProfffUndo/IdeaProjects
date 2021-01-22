package mephi.Lab6.dop;

public class FootballPlayer extends Sportsman {

    private String team;

    public FootballPlayer(String name, String sport, int height, int weight, String team) {
        super(name, sport, height, weight);
        this.team = team;
    }

    public FootballPlayer() {

    }

    public String getTeam() {
        return team;
    }


    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "team='" + team + '\'' +
                "} " + super.toString();
    }
}
