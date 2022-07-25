package one.problems.implementation;

import one.problems.Interfaces.Point;

public class point implements Point {

    protected int start,finish;

    // constructor
    point(int s,int f){
        this.finish=f;
        this.start=s;
    }

    @Override
    public int Amplitude() {
        return 0;
    }

    @Override
    public int distanceTo(Point p) {
        return 0;
    }

    @Override
    public boolean equalsTo(Point p) {
        return false;
    }

    @Override
    public int magnitude() {
        return 0;
    }

    @Override
    public int xCoordinate() {
        return 0;
    }

    @Override
    public int yCoordinate() {
        return 0;
    }
}
