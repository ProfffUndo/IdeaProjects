package mephi.Lab6.dop.presentation.task3.WithoutPECS;

import mephi.Lab6.dop.FootballPlayer;
import mephi.Lab6.dop.Person;
import mephi.Lab6.dop.Runner;
import mephi.Lab6.dop.Sportsman;
import mephi.Lab6.dop.dopofdop.A;
import mephi.Lab6.dop.presentation.IsQuickEnough;
import mephi.Lab6.dop.presentation.task3.PECSExample.Competition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Competition<Sportsman> competition = new Competition<>();

        competition.add(new FootballPlayer());
      //  competition.filterSportsmen(new IsQuickEnough());


        Supplier<Person> personSupplier = Person::new; //Sportsman extends Person
     //  competition.addSportsman(personSupplier);

       for (int i=0; i<competition.getSportsmen().size(); i++){
           competition.getSportsmen().get(i).getSport();
       }

    }


    /*public static void example2(List <? extends Sportsman> list){ //может поступить массив бегунов
        Sportsman sportsman = new Sportsman();
        Runner runner=new Runner();
        list.add(sportsman);
        list.add(runner);

    }*/



//TODO: Метод со соловом extends, extends используется не как продюсер, а как consumer,
// пример heap pollution
}
