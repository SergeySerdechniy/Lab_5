package ru.serdechniy.lab5;

public class PointOneDimensionalSpace extends Point {

    private double x;

    public PointOneDimensionalSpace(int numberOfSpaces, double x) {
        setName("Точка одномерного пространства");
        setNumberOfSpaces(numberOfSpaces);
        this.x = x;
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + ",  параметры: (" + x + ")" + "кол-во параметров: " + this.numberOfVariables()+", дата и время создания: "+this.number()+"."+this.month()+"."+this.year()+" "+this.hour()+":"+this.minutes();
    }

    @Override
    public int numberOfVariables() {
        return numberOfSpaces;
    }

    @Override
    public boolean isLocateAxis() {
        return x == 0;
    }

    @Override
    public void summet() {
        this.x = -x;
    }

    @Override
    public void transfer(Vektor p) {
        this.x += p.x1 - p.x0;
    }

    @Override
    public int number() {
       return 5;
    }

    @Override
    public int month() {
        return 10;
    }

    @Override
    public int year() {
        return 2012;
    }

    @Override
    public int hour() {
        return 12;
    }

    @Override
    public int minutes() {
        return 19;
    }
}
