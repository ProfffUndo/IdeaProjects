package mephi.Lab6.dop.presentation;

import mephi.Lab6.dop.Runner;

import java.util.function.Predicate;

public class IsQuickEnough implements Predicate<Runner> {
    @Override
    public boolean test(Runner t) {
        return t.getRecord() < 10;
    }
}
