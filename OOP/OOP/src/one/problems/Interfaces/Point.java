package one.problems.Interfaces;

/***
 * Interface for a point object
 */
public interface Point {

    /*
    *   ADT: Point
        amplitude(): Real
        distanceTo(Point): Real
        equals(Point): Boolean
        magnitude(): Real
        toString(): String
        xCoordinate(): Real
        yCoordinate(): Real
    * */
    int Amplitude();
    int distanceTo(Point p);
    boolean equalsTo(Point p);
    int magnitude();
    String toString();
    int xCoordinate();
    int yCoordinate();
}
