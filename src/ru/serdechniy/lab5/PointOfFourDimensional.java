package ru.serdechniy.lab5;

public class PointOfFourDimensional extends Point {

    private double x;
    private double y;
    private double z;
    private double t;

    public PointOfFourDimensional(int numberOfSpaces, double x, double y, double z, double t) {
        setName("Точка четырехмерного пространства");
        setNumberOfSpaces(numberOfSpaces);
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + ",  параметры: (" + x + "," + y + "," + z + "," + t + ")" + "кол-во параметров: " + this.numberOfVariables()+", дата и время создания: "+this.number()+"."+this.month()+"."+this.year()+" "+this.hour()+":"+this.minutes();
    }

    @Override
    public int numberOfVariables() {
        return numberOfSpaces;
    }

    @Override
    public boolean isLocateAxis() {
        return t == 0;
    }

    @Override
    public void summet() {
        this.x = -x;
        this.y = -y;
        this.z = -z;
        this.t = -t;
    }

    @Override
    public void transfer(Vektor p) {
        this.x += p.x1 - p.x0;
        this.y += p.y1 - p.y0;
        this.z += p.z1 - p.z0;
        this.t += p.t1 - p.t0;
    }

    @Override
    public int number() {
        return 23;
    }

    @Override
    public int month() {
        return 9;
    }

    @Override
    public int year() {
        return 2012;
    }

    @Override
    public int hour() {
        return 18;
    }

    @Override
    public int minutes() {
        return 49;
    }
}
