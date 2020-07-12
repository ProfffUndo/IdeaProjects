package mephi.Lab2.ex6;

/**
 * Класс Point представляет собой реализацию точки на плоскости с координатами по двум осям x и y
 * @author Alexander Koromyslov
 * @version 1.1
 */

public final class Point {
    private double x; //координата по x
    private double y; //координата по y

    public Point (double x, double y){
        this.x=x;
        this.y=y;
    }

    public Point (){
        this.x=0;
        this.y=0;
    }
    /**
     * Возвращает значение координаты по оси Х
     * @return координата по оси X
     */

    public double getX() {
        return x;
    }
    /**
     * Возвращает значение координаты по оси Y
     * @return координата по оси Y
     */
    public double getY() {
        return y;
    }

    /**
     * Смещает точку на указанные координаты
     * @param x Смещение по оси X
     * @param y Смещение по оси Y
     * @return Старая точка с новыми координатами
     */

    public Point translate(double x, double y){
        this.x +=x;
        this.y +=y;
        return this;
    }

    /**
     * Масштабирует старую точку на коэффицент
     * @param k - коэффицент изменения масштаба
     * @return Старая точка точка с новыми координатами
     */
    public Point scale (double k){
        this.x = k*x;
        this.y = k*y;
        return this;
    }
}
