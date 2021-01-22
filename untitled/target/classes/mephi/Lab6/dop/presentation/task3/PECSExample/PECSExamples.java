package mephi.Lab6.dop.presentation.task3.PECSExample;

import mephi.Lab6.dop.FootballPlayer;
import mephi.Lab6.dop.Runner;
import mephi.Lab6.dop.Sportsman;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PECSExamples<T> {
    public static void main(String[] args) {
        Sportsman lebron = new Sportsman("LeBron","Basketball",205,100);
        FootballPlayer artem = new FootballPlayer("Artem","Football",190,80,"Zenit");
        FootballPlayer leo = new FootballPlayer("Lionel", "Football", 170,65,"Barca");
        FootballPlayer mohammed = new FootballPlayer("Mohammed", "Football", 180,75,"Liverpool");
        Runner usein = new Runner("Usein","Run",180, 80, 100, 9.58);

        ArrayList<FootballPlayer> footballPlayers = new ArrayList<>();

        footballPlayers.add(artem);
        footballPlayers.add(leo);
        footballPlayers.add(mohammed);

        ArrayList<Sportsman> sportsmen = new ArrayList<>();

        sportsmen.add(artem);
        sportsmen.add(leo);
        sportsmen.add(mohammed);
        sportsmen.add(lebron);
        sportsmen.add(usein);



    }

    public static void printSportsmen(ArrayList<? super Sportsman> sportsmen){ //Consumer method
        for (Object sportsman:sportsmen) {
            System.out.println(sportsman.toString());
        }
    }

    public static ArrayList<? extends Sportsman> deleteSportsmen (ArrayList <? extends Sportsman> sportsmen){ //Producer
       for (int i=0; i<sportsmen.size(); i=i+2){
           sportsmen.remove(i);
       }
       return sportsmen;
    }



    public static <T> ArrayList<T> prodcons (ArrayList<T> array , Predicate<? super T> filter){ //TODO: Переделать 1 аргумент должен быть consumer и producer. PECS не можем
       ArrayList<T> returnList = new ArrayList<>();
        for (int i=0; i<array.size();i++){
           if(filter.test(array.get(i))) returnList.add(array.get(i));
       }
        return returnList;
    }
    //Что если компилятор бы разрешал не следовать PECS
}
