package one.problems.Interfaces;

public interface Line {

    /*
    *   ADT: Line
        contains(Point): Boolean
        equals(Line): Boolean
        isHorizontal(): Boolean
        isVertical(): Boolean
        slope(): Real
        toString(): String
        xIntercept(): Real
        yIntercept(): Real
    * */

    boolean contains(Point p);
    boolean equals(Line l);
    boolean isHorizontal();
    boolean isVertical();
    int slope();
    String toString();
    int xIntercept();
    int yIntercept();

}
