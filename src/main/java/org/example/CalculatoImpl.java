package org.example;

public class CalculatoImpl implements ICalculator {
    @Override
    public int sum(int x, int y) {
        return x+y;
    }

    @Override
    public int sub(int x, int y) {
        return x-y;
    }

    @Override
    public int div(int x, int y) {

        if(y==0) // branching statement
            return y;
        return x/y;
    }
}
