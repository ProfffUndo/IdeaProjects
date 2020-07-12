package Chess29;

public class Pawn extends Figure {

    @Override
    public void move(int x0, int y0) {
        if ((y0>=0) && (y0<8) && (x0>=0) && (x0<8)) {
            if ((x0==x) && (y0==y+1)) {
                x = x0;
                y = y0;
            }
            else System.out.println("Irregular move");
        }
        else System.out.println("Unexpected index");
    }

    @Override
    public void eat(int x0, int y0) {
        if ((y0>=0) && (y0<8) && (x0>=0) && (x0<8)) {
            if (((x0==x+1) || (x0==x-1)) && (y0==y+1)){
                x = x0;
                y = y0;
            }
            else System.out.println("Irregular move");
        }
        else System.out.println("Unexpected index");
    }
}
