package one.problems.Interfaces;

public interface Polynomial {

    /*
    * ADT: Polynomial
    degree(): int
    derivative(): Polynomial
    equals(Point): Boolean
    sum(Polynomial): Polynomial
    toString(): String
    valueAt(Real): Real
    * */

    int degree();
    Polynomial derivative();
    boolean equals(Point p);
    Polynomial sum(Polynomial p);
    String toString();
    int valueAt(int x);
}
