package mephi.Lab6.dop.presentation.task3.PECSExample;

import mephi.Lab6.dop.Sportsman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Competition<T> {
    private ArrayList<T> sportsmen;

    public List<T> filterSportsmen(Predicate<? super T> predicate) {
        List<T> result = new ArrayList<>();
        for (T sportsman : sportsmen) {
            if (predicate.test(sportsman)) {
                result.add(sportsman);
            }
        }
        return result;
    }



    public void replace(List<T> list) { //TODO: Другой пример
        sportsmen.subList(0, Math.min(list.size(), sportsmen.size())).clear();
        sportsmen.addAll(0, list);
    }

    public void addSportsman(Supplier<? extends T> supplier){
        sportsmen.add(supplier.get());
    }

    public ArrayList<T> getSportsmen() {
        return sportsmen;
    }

    public void add(T sportsman){
        sportsmen.add(sportsman);
    }

    public void swapSportsmen (ArrayList<T> newSportsmen, ArrayList<Integer> newbees, ArrayList<Integer> olds ){
        for (int i =0; i<olds.size(); i++) {
            newSportsmen.add(sportsmen.get(olds.get(i)));
            sportsmen.remove(olds.get(i));
        }
        for (int i =0; i<newbees.size(); i++) {
            sportsmen.add(newSportsmen.get(newbees.get(i)));
            newSportsmen.remove(newbees.get(i));
        }
    }
}
