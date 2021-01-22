package Chess29;

abstract public class Figure {
    int x;
    int y;
    abstract public void move(int x0, int y0);
    abstract public void eat(int x0, int y0);
}
