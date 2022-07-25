package one;

import one.problems.Interfaces.Fraction;

public class test{

    public static void main(String[] args) {


        fraction fr=new fraction(2,3);
        fr.getLcm(4,8);
    }

}

class fraction implements Fraction {
    protected int num;
    protected int den;

    fraction(int n, int d){
        this.num=n;
        this.den=d;
    }

    public int getLcm(int x,int y){
        if(x>y && x%y==0){
            return x;
        }
        return y;
    }

    @Override
    public fraction plus(fraction x) {
        return null;
    }

    @Override
    public fraction times(int n) {
        return null;
    }

    @Override
    public fraction times(fraction x) {
        return null;
    }

    @Override
    public fraction reciprocal() {
        return null;
    }

    @Override
    public double value() {
        return 0;
    }
}
