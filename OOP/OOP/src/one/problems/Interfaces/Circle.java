package one.problems.Interfaces;

public interface Circle {
    /*
    ADT: Circle
    area(): Real
    center(): Point
    circumference(): Real
    contains(Point): Boolean
    equals(Circle): Boolean
    radius(): Real
    toString(): String
    * */
    int area();
    Point center();
    int circumference();
    boolean contains(Point p);
    boolean equals(Circle c);
    int radius();
    String toString();
}
