package one.problems.Interfaces;

import one.fraction;

public interface Fraction {
    fraction plus(fraction x);
    fraction times(int n);
    fraction times(fraction x);
    fraction reciprocal();
    double value();
}
